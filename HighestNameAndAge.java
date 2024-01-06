import java.util.Scanner;
public class HighestNameAndAge {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	

	int age = 0;
        int highestage = 0;
	String highestName = "";
	String lowestName = "";
	int kan = 2;
        int lowestage = 0;

for(int count = 0; count < kan; count ++) {
	System.out.println("Enter a name: ");
	String name = scanner.next();
	
	System.out.println("Enter " + name + " Age ");
	age = scanner.nextInt();

	if( age > highestage){
	highestage = age;
	highestName = name;
        }
	if( age < highestage){
	lowestage = age;
	lowestName = name;
	}
   }


}

}