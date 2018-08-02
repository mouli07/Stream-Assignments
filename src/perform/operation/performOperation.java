package perform.operation;

import java.util.function.Predicate;

public class performOperation {

	// Check if a number is odd or not
	public static Predicate<Integer> isOdd() {
		Predicate<Integer> predicate = (element) -> {
			return (element % 2 == 0) ? false : true;
		};
		return predicate;
	}

	// Check if a number is prime or not
	public static Predicate<Integer> isPrime() {
		Predicate<Integer> predicate = (element) -> {
			boolean flag = false;
			for (int i = 2; i <= element / 2; ++i) {
				if (element % i == 0) {
					flag = true;
					break;
				}
			}
			return (!flag) ? true : false;
		};
		return predicate;
	}

	// Check if a number is Palindrome or not
	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> predicate = (element) -> {
			return (Integer.toString(element))
					.equals(new StringBuilder(Integer.toString(element)).reverse().toString());
		};
		return predicate;
	}

}
