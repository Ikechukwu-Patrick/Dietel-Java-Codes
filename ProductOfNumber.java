import java.util.Scanner;

public class ProductOfNumber {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter numbre:  ");
int num = input.nextInt();

int number = 3;

while(number <= 100){
	number = 3 * num;
}

System.out.print("The firt power of 3 larger than 100 is: ", number);

}
}