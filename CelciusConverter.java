import java.util.Scanner;

public class CelciusConverter {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("input temperature in celcius");

double celcius = input.nextDouble();

double fahrenheit = ((9.0/5) * celcius) + 32;

System.out.printf("%.2f is %.2f fahrenheit",celcius, fahrenheit);
}
}

