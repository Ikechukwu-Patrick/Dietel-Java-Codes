import java.util.Scanner;
public class AgeChecker{
	public static void main(String [] ars){
	Scanner input = new Scanner(System.in);
	int age = 0;
	System.out.print("Enter your date of birth ");
	int birthNumber = input.nextInt();

	age = 2024 - birthNumber;
	if(birthNumber <  0){System.out.print("invalid number, enter a valid number");}

	else {
		System.out.print("You are  " + age);
		}



}

}