package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithSameletters {

	public static void main(String[] args) {

		String str = "aabccbb";
		
		System.out.println(findLength(str,2));

	}

	public static int findLength(String str, int k) {
		int windowStart = 0, maxLength = 0, maxRepeatLetterCount = 0;
		Map<Character, Integer> letterFrequencyMap = new HashMap<>();
		// try to extend the range [windowStart, windowEnd]
		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
			char rightChar = str.charAt(windowEnd);
			letterFrequencyMap.put(rightChar, letterFrequencyMap.getOrDefault(rightChar, 0) + 1);
			maxRepeatLetterCount = Math.max(maxRepeatLetterCount, letterFrequencyMap.get(rightChar));

			// current window size is from windowStart to windowEnd, overall we
			// have a letter which is
			// repeating 'maxRepeatLetterCount' times, this means we can have a
			// window which has one letter
			// repeating 'maxRepeatLetterCount' times and the remaining letters
			// we should replace.
			// if the remaining letters are more than 'k', it is the time to
			// shrink the window as we
			// are not allowed to replace more than 'k' letters
			if (windowEnd - windowStart + 1 - maxRepeatLetterCount > k) {
				char leftChar = str.charAt(windowStart);
				letterFrequencyMap.put(leftChar, letterFrequencyMap.get(leftChar) - 1);
				windowStart++;
			}

			maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
		}

		return maxLength;
	}
}
