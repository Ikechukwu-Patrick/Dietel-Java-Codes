public class TabulaArray{
public static void main(String [] args){
int [] number = {10,56,70,89,34,50,67,80,89,90};

System.out.printf("%s%8s%n", "Index",  "Value");

for(int counter = 0; counter < number.length; counter++){
	System.out.printf("%5d%8d%n", counter, number[counter]);

	}

     }
}