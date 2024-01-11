import java.util.Scanner;
import java.util.Arrays;

public class MyersBriggsTypeIndicator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

	System.out.println("Please bear in mind that in this tests, there's no Right and Wrong answers:");
	
        String[] roundA = {
                "A. expand energy, enjoy groups?",
                "A. more outgoing, think out loud?",
                "A. seek many task, public activities, interact with others?",
                "A. external, communicative, express yourself?",
                "A. active, initiate?",
                "A. logical, thinking, questioning?",
                "A. candid, straight forward, frank?",
                "A. firm, tend to criticise, hold the line?",
                "A. tough minded, just?",
                "A. matter of fact, issue_oriented?",
                "A. organised, orderly?",
                "A. plan, schedule?",
                "A. regulated, structured?",
                "A. preparation, plan ahead?",
                "A. control, govern?",
                "A. interpret literally?",
                "A. practical, realistic, experiential?",
                "A. standard, usual, conventional?",
                "A. focus on here and now?",
                "A. facts, things, what is?",
        };

        String [] roundB = {
                "B. conserve energy?",
                "B. more reserved, think to yourself?",
                "B. seek private, solitary activities with quiet to concentrate?",
                "B. internal reticent, keep to yourself?",
                "B. reflective, deliberate?",
                "B. empathetic, feeling, accommodating?",
                "B. tactful, kind, encouraging?",
                "B. gentle, tend to appreciate, conciliate?",
                "B. tender-hearted, mercifu?l",
                "B. sensitive, people-oriented, compassionate?",
                "B. flexible, adaptable?",
                "B. unplanned, spontaneous?",
                "B. easygoing, live and let live?",
                "B. go with the flow, adapt as you go?",
                "B. latitude, freedom?",
                "B. look for meaning and possibilities?",
                "B. imaginative, innovative, theoretical?",
                "B. different, novel, unique?",
                "B. look to the future, global perspective, big picture?",
                "B. ideas, dreams, what could be, philosophical?"
        };


		        String answer = "";
        String[] answerA = {"E", "S", "T", "J"};
        String[] answerB = {"I", "N", "F", "P"};
        String[][] answerBook = new String[4][5];
        for (int E = 0; E < 20; E++) {
           System.out.println(roundA[E] + "\t\t" + roundB[E]);
            answer = input.next();
	}
}
}