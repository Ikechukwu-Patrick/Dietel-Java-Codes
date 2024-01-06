import java.util.Scanner;

public class Nokia3310 {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter 1 to 13 to access phone menu ");

System.out.println("""

		1.Phone book
		2.Messsage	
		3.Chat
		4.Call Register
		5.Tones
		6.Settings
		7.Call Divert
		8.Games
		9.Calculator
		10.Reminder
		11.Clock
		12.Profiles
		13.SIM services """);
				
	
int menu = input.nextInt();
switch(menu){
case 1:
System.out.println("Enter 1 to 10 to access Phone book");
System.out.print("1. Search\n2. Service Nos\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags\n");
System.out.println("Enter 1 to 10 to access the phone book");
int phonebook = input.nextInt();
switch(phonebook){
case 1: System.out.println("Search");
break;
case 2: System.out.println("Services Nos");
break;
case 3: System.out.println("Add name");
break;
case 4: System.out.println("Erase");
break;
case 5: System.out.println("Edit");
break;
case 6: System.out.println("Assign tone");
break;
case 7: System.out.println("Send b'card");
break;
case 8: System.out.println("Options");
break;
case 9: System.out.println("Speed dials");
break;
case 10: System.out.println("Voice tags");
break;
 
}  

case 2:
System.out.println("Enter 1 to 10 to access Messages");
System.out.print("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor");
int Messages = input.nextInt();
switch(Messages){
case 1: System.out.println("Write messages");
break;
case 2: System.out.println("Inbox");
break;
case 3: System.out.println("Outbox");
break;
case 4: System.out.println("Picture messages");
break;
case 5: System.out.println("Templates");
break;
case 6: System.out.println("Smileys");
break;
case 7: System.out.println("Messages settings");
break;
case 8: System.out.println("Info services");
break;
case 9: System.out.println("Voice mailbox number");
break;
case 10: System.out.println("Service command editor");
break;
}

case 3:
System.out.println("Chat");
int Chat = input.nextInt();
switch(Chat){
}

case 4:
System.out.println("Call register");
System.out.print("1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\nShow call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid\n");
int Callregister = input.nextInt();

switch(Callregister){
case 1: System.out.println("Missed calls");
break;
case 2: System.out.println("Received calls");
break;
case 3:  System.out.println("Dialled numbers");
break;
case 4:  System.out.println("Erase recent call lists");
break;
case 5:  System.out.println("Show call duration");
break;
case 6:  System.out.println("Show call costs");
break;
case 7:  System.out.println("Call cost settings");
break;
case 8:  System.out.println("Prepaid credit");
break;

}

case 5:

System.out.println("Tone");
System.out.print("1. Ringing tone\n2. Ringing volume\n3. Incoming calls alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver");

int Tone = input.nextInt();

switch(Tone){
case 1: System.out.println("Ringing tone");
break;
case 2: System.out.println("Ringimg volume");
break;
case 3: System.out.println("Incoming calls alert");
break;
case 4: System.out.println("Composer");
break;
case 5: System.out.println("Message alert tone");
break;
case 6: System.out.println("Keypad tones");
break;
case 7: System.out.println("Warning and game tones");
break;
case 8: System.out.println("Vibrating alert");
break;
case 9: System.out.println("Screen saver");
break;

}

case 6:

System.out.println("Settings");
System.out.print("1. Call setttings\n2. Phone settings \n3. Security settings\n4. Restore factory settings\n");

int Showallcosts = input.nextInt();

switch(Showallcosts){
case 1: System.out.println("Call settings"); 
break;
case 2: System.out.println("Phone settings");
break;
case 3: System.out.println("Security settings");
break;
case 4: System.out.println("Restor factory settings");
break;
}

case 7:

System.out.println(" Divert");
int Divert = input.nextInt();
switch(Divert){
}

case 8: 

System.out.println(" Games");
int Games = input.nextInt();
switch(Games){
}

case 9:

System.out.println(" phone Calculator");
int Calculator =input.nextInt();
switch(Calculator){
}

case 10:

System.out.println("Enter 10 to access phone Reminders");
int Reminders = input.nextInt();
switch(Reminders){

case 10:
System.out.println("Reminders");
break;
}

case 11:

System.out.println("Enter 11 to access phone Clock");
int Clock = input.nextInt();
switch(Clock){
}

case 12:

System.out.println("Enter 12 to access phone Profiles");
int Profiles = input.nextInt();
switch(Profiles){
}

case 13:

System.out.println("Enter 13 to access phone SIM services");
int SIMservices = input.nextInt();
switch(SIMservices){
}


}


}
}





























