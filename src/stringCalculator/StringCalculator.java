package stringCalculator;

public class StringCalculator {

	public int add(String var) {

		if (var.length() == 0) {
			return 0;
		}

		int result = 0;
		for (String number : var.split(",")) {
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
