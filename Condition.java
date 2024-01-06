import java.util.Scanner;
public class Condition {

public static void main(String[]args) {

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter first number: ");
	int firstNumber = scanner.nextInt();

	System.out.println("Enter second number: ");
	int secondNumber = scanner.nextInt();


	boolean condition = firstNumber != secondNumber;

	if(condition) {
	System.out.println("you have entered two different number");
	}

else {
System.out.println("you have entered the same number twice");
}


}

}



	