package recursionandbacktrack;

public class ReplaceAllOccurenceoFPi {

	static StringBuilder res = new StringBuilder();

	public static void main(String[] args) {

		String str = "2 * pi + 3 * pi = 5 * pi";

		backTrack(str, res, 0);

		System.out.println(res.toString());
	}

	static void backTrack(String str, StringBuilder res, int index) {

		if (index>=str.length())
			return;

		if (str.charAt(index) == 'p' && str.charAt(index + 1) == 'i') {
			res.append("3.14");
			backTrack(str, res, index + 2);

		}

		else {
			backTrack(str, res.append(str.charAt(index)), index + 1);
		}

	}

}
