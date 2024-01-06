import java.util.Scanner;

public class GioPoliticalZone {

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter your state ");
String state = input.nextLine();

switch(state){

case "Kebi","Katsna","Kaduna","Gombe" -> System.out.print("Your are from North West");

case "Abia","Anambra","Enugu","Ebonyi","Imo" -> System.out.print("Your are from South East");

case "Delta","Aka Ibom","Rivers","Cross River","Bayelsa" -> System.out.print("Your are from South South");


//Default :  System.out.print("Mr Femi suppose cease your laptop for two weeks"); 


 	}
     }
}

