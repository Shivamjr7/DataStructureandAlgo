package strings;

public class ReverseWordsinAString {

	public static void main(String[] args) {

		String str = "a good   example";

		System.out.println(reverseWords(str));

	}

	public static String reverseWords(String s) {

		s = s.trim();

		String[] arr = s.split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i > 0; i--) {
			if (!arr[i].equals("")) {

				sb.append(arr[i]);
				sb.append(" ");
			}
			
		}

		sb.append(arr[0]);
		return sb.toString();

	}

}
