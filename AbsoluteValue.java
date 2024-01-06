import java.util.Scanner;

public class AbsoluteValue {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter absolute number: ");
int num = input.nextInt();
 
int PositiveNumber = num * 1;

int NegativeNumber = num * -1;

if(num > 0){
System.out.print("The absolute value difference is: " + PositiveNumber);

}

if(num < 0){
System.out.print("The absolute value difference is: " + NegativeNumber);

}

if(num == 0){
System.out.print("The absolute value difference is: " + PositiveNumber);
} 
                                                                                                                          


}
}




































