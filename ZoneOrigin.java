import java.util.Scanner;

public class ZoneOrigin {

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter your state  ");
String zone = input.nextLine();

switch(zone){
case 1:
System.out.println("Enter 1 to 37 to access your origin of zone ");
System.out.print("1. Kebi\n2. Sokoto\n3. Katsina\n4. Zamfara\n5. Kaduna\n6. Kano\n7. Adamawa\n8. Yobe\n9. Bornu\n10. Bauchi\n11. Gombe\n12. Taraba\n13. Jigawa\n14. Plateau\n15. Kwara\n16. Kogi\n17. Benue\n18. Nigr\n19. Nasarawa\n20. FCT\n21. Lagos\n22. Ondo\n23. Osun\n24. Oyo\n25. Ogun\n26. Ekiti\n27. Abia\n28. Anambra\n29. Ebonyi\n30. Enugu\n31. Imo\n32.Bayelsa\n");

System.out.print("Wetin be ur state?:  ");

String Zone = input.nextLine();

switch("Zone"){

case a: System.out.println("your are from Kebi state");
break;
case b: System.out.println("your are from Sokoto state ");
break;
case c: System.out.println("your are from Katsina stte");
break;
case d: System.out.println("your are from Zamfara state");
break;



} 
}

}
}