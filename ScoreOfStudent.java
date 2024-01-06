import java.util.Scanner;

   public class ScoreOfStudent{
	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	int highestScore = 0;
	String highestScoreName = " ";
	int count = 0;

	System.out.print("Enter the number of students: ");
	int numberOfStudents = input.nextInt();

       while(count < numberOfStudents){
	System.out.print("Enter Student Name: ");
	String name = input.next();

	System.out.print("Enter the score: ");
	int score = input.nextInt();

		if(score > highestScore){
		highestScore = score;
		highestScoreName = name;
		}
		 count ++;
	}
	
	
System.out.print(highestScoreName + " had the highest score: "+ highestScore);

	}
  }



















