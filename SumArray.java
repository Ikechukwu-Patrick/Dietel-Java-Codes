public class SumArray{
public static void main(String [] args){
int [] sumArray = {23,4,45,5,67,7,8,9,67,88,4,45};
int total = 0;

	for(int counter = 0; counter < sumArray.length; counter++){
		total += sumArray [counter] ;
	}

	System.out.printf("The total array elements is: %d%n", total);
}
}