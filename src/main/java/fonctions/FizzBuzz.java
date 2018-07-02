package fonctions;

public class FizzBuzz {
	public static String fizzBuzz(int min, int max) {
		if (min < 0) {
			min = 0;
		}
		if (max < 0) {
			max = 0;
		}
		if (min == 0 && max == 0) {
			return null;
		} else {
			String result = "";
			if (max < min) {
				int temp = max;
				max = min;
				min = temp;
			}
			if (min == 0) {
				min++;
			}
			while (min <= max) {
				if (min % 3 == 0 && min % 15 != 0) {
					result += "Fizz";
				} else if (min % 5 == 0 && min % 15 != 0) {
					result += "Buzz";
				} else if (min % 15 == 0) {
					result += "FizzBuzz";
				} else {
					result += Integer.toString(min);
				}
				min++;
			}
			System.out.println(result);
			return result;
		}
	}

}
