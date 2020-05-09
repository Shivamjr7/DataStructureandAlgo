package strings;

import java.util.HashMap;
import java.util.Map;

public class DayOftheWeek {

	public static void main(String[] args) {

		System.out.println(solution("Sat", 100));

	}

	public static String solution(String S, int k) {

		String[] week = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < 7; i++) {
			map.put(week[i], i);
		}
		return week[(map.get(S) + k) % 7];

	}

}
