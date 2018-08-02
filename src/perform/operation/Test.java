package perform.operation;
import java.util.ArrayList;

public class Test {


	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	//Putting elements in the ArrayList
	for (int i=1;i<=100;i++)
	{
	list.add(i);
	}
	//checking the isOdd predicate
	list.stream().filter(performOperation.isOdd()).forEach(System.out::println);
	System.out.println("*************************************************");
	//checking the isEven predicate
	list.stream().filter(performOperation.isPrime()).forEach(System.out::println);
	System.out.println("*************************************************");
	//checking the isPalindrome predicate
	list.stream().filter(performOperation.isPalindrome()).forEach(System.out::println);
	}
	
}
