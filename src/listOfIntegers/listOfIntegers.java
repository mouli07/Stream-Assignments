//Program to generate random numbers and preform various filtering on them
package listOfIntegers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class listOfIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//Generating and adding random integers into the arraylist
		for (int i = 1; i <= 100; i++) {
			list.add((int) (Math.random() * 10000) % 100);
		}
		
		Consumer<Integer> consumerPrint = System.out::println;
		
		Predicate<Integer> predicateEven = (element) -> (element % 2 == 0) ? true : false;
		Predicate<Integer> predicateOdd = (element) -> (element % 2 == 0) ? false : true;
		Predicate<Integer> predicateDivbysix = (element) -> (element % 6 == 0) ? true : false;
		Predicate<Integer> predicateLessThanTwelve = (element) -> (element < 12) ? true : false;
		Predicate<Integer> predicateGreterThanFifty = (element) -> (element > 50) ? true : false;
		
		System.out.println("\n1. All integers in the list\n");
		list.stream().forEach(consumerPrint);
		System.out.println("\n2. All even elements in the list\n");
		list.stream().filter(predicateEven).forEach(consumerPrint);
		System.out.println("\n3. All odd elements in the list\n");
		list.stream().filter(predicateOdd).forEach(consumerPrint);
		System.out.println("\n4. All numbers divisible by 6 in the list\n"); 
		list.stream().filter(predicateDivbysix).forEach(consumerPrint);
		System.out.println("\n5. All numbers less than 12 in the list\n");
		list.stream().filter(predicateLessThanTwelve).forEach(consumerPrint);
		System.out.println("\n6. All numbers greater than 50 in the list\n");
		list.stream().filter(predicateGreterThanFifty).forEach(consumerPrint);
	}

}
