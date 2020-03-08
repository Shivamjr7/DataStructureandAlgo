package linkedlist;

import java.util.HashMap;

public class LRUCache {

	static class Node {
		Node prev;
		Node next;
		int key;
		int val;

		Node(int key, int val) {
			this.key = key;
			this.val = val;
		}
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1,1);
		cache.put(2,2);
		cache.get(1);
		cache.put(3, 3);
		cache.get(2);
		cache.put(4, 4);
		cache.get(1); 
	}

	Node head;
	Node tail;
	HashMap<Integer, Node> map = null;
	int cap = 0;

	public LRUCache(int capacity) {
		this.cap = capacity;
		this.map = new HashMap<>();
	}

	public int get(int key) {
		if (map.get(key) == null) {
			return -1;
		}

		// move to tail
		Node t = map.get(key);

		removeNode(t);
		offerNode(t);

		return t.val;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			Node t = map.get(key);
			t.val = value;

			// move to tail
			removeNode(t);
			offerNode(t);
		} else {
			if (map.size() >= cap) {
				// delete head
				map.remove(head.key);
				removeNode(head);
			}

			// add to tail
			Node node = new Node(key, value);
			offerNode(node);
			map.put(key, node);
		}
	}

	private void removeNode(Node n) {
		if (n.prev != null) {
			n.prev.next = n.next;
		} else {
			head = n.next;
		}

		if (n.next != null) {
			n.next.prev = n.prev;
		} else {
			tail = n.prev;
		}
	}

	private void offerNode(Node n) {
		if (tail != null) {
			tail.next = n;
		}

		n.prev = tail;
		n.next = null;
		tail = n;

		if (head == null) {
			head = tail;
		}
	}
}
