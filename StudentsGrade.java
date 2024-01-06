import java.util.Scanner;
public class StudentsGrade {
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter grade number  ");
int studentScore = input.nextInt();          
                                               
	if(studentScore >= 90 && studentScore <=100){
		System.out.println("excellent");
	}  
	else if(studentScore >= 80 && studentScore <90){
		System.out.print("very good");
                }

	else if(studentScore >= 70 && studentScore < 80) {
		System.out.println("credit");
		}

	else if(studentScore >= 60 && studentScore < 70){
		System.out.println("pass");
		}
   
	else { System.out.println("fail");
 		}
     }
    
   }
         
