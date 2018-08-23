package stringCalculator;

public class StringCalculator {

	public int add(String var) {

		if (var.length() == 0) {
			return 0;
		}

		int result = 0;

		String delimiter = ",";
		if (var.startsWith("//")) {
			delimiter = var.charAt(2) + "";
			var = var.substring(4);
		}
		for (String number : var.split("[" + delimiter + "|\\n]")) {
			result += stringToInt(number);
		}

		return result;

	}

	private int stringToInt(String number) {
		number = number.trim();
		if (!number.equals("")) {
			return Integer.parseInt(number);
		}

		return 0;
	}

}

// int start = 0;
//
// for (int i = 0; i < var.length(); i++) {
// if (var.charAt(i) == ',' || var.charAt(i) == '\n') {
// String number = var.substring(start, i);
// result += stringToInt(number);
// start = i + 1;
// }
// }
// String rest = var.substring(start);
// result += stringToInt(rest);