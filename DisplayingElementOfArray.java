public class DisplayingElementOfArray{
public static void main(String [] args){

	int [] naArray = {45,56,77,6,55,67,78,89,99};
	System.out.printf("%s%8s%n", "Index", "Value");

	for(int counter = 0; counter < naArray.length; counter++){
		System.out.printf("%5d%8d%n", counter, naArray[counter]);
	}
    }
}