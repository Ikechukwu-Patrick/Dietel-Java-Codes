public class MethodOverLoading{

public static void main(String [] args){

	System.out.printf("The square of integer 7 is %d%n", square(7));
	System.out.printf("The square of double 7.5 is  %f%n", square(7.5));

}

public static int square(int intValue){
System.out.printf("%nMethod called square with int argument:  %d%n", intValue);

	return intValue * intValue;

   }

public static double square(double doubleValue){
	System.out.printf("%nMethod called square with double argument: %f%n", doubleValue);

	return doubleValue * doubleValue;

    }

}