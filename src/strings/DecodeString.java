package strings;

import java.util.Stack;

/**
 * Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:
 * @author shivamjari
 *
 */
public class DecodeString {

	public static void main(String[] args) {
		String str = "3[a]2[bc]";
		
		new DecodeString().decodeString(str);
	}

	public String decodeString(String s) {
		Stack<String> result = new Stack<>();
		Stack<Integer> counts = new Stack<>();

		String res = "";

		for (int i = 0; i < s.length();) {

			if (Character.isDigit(s.charAt(i))) {
				int count = 0;
				while (Character.isDigit(s.charAt(i))) {
					count = count * 10 + (s.charAt(i) - '0');
					i++;
				}
				counts.push(count);
			} else if (s.charAt(i) == '[') {
				result.push(res);
				res = "";
				i++;
			} else if (s.charAt(i) == ']') {
				StringBuilder sb = new StringBuilder(result.pop());
				int count = counts.pop();
				for (int j = 0; j < count; j++) {
					sb.append(res);
				}
				res = sb.toString();
				i++;
			} else {
				res = res + s.charAt(i);
				i++;
			}
		}
		return res;

	}

}
