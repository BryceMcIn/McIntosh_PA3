import java.security.SecureRandom;
import java.util.Scanner;

public class yepyep {


    public static int genQuestion(int userDiff, int userArith){


        SecureRandom rand = new SecureRandom();
        int answer = 0, num1, num2;
        int bound = 10;

        if(userDiff == 1){
            bound = 10;
        }
        else if(userDiff == 2){
            bound = 100;
        }
        else if(userDiff == 3){
            bound = 1000;
        }
        else if(userDiff == 4){
            bound = 10000; //these some big boy numbers
        }

        num1 = rand.nextInt(bound);
        num2 = rand.nextInt(bound);

        if(userArith == 5){

            userArith = 1 + rand.nextInt(4);

        }


        switch(userArith){
            case 1:
                System.out.println("How much is " + num1 + " + " + num2 + "?");
                answer = num1 + num2;
                break;
            case 2:
                System.out.println("How much is " + num1 + " * " + num2 + "?");
                answer = num1 * num2;
                break;
            case 3:
                System.out.println("How much is " + num1 + " - " + num2 + "?");
                answer = num1 - num2;
                break;
            case 4:
                System.out.println("How much is " + num1 + " / " + num2 + "?");
                answer = num1 / num2;
                break;


        }

        return(answer);
    }

    public static void genBadResponse(){

        int temp;
        SecureRandom rand = new SecureRandom();

        temp = rand.nextInt(4);

        switch(temp){
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don’t give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static void genGoodResponse(){

        int temp;
        SecureRandom rand = new SecureRandom();

        temp = rand.nextInt(4);

        switch(temp){
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }


    public static void main(String[] args) {

        int control = 1;
        int userChoice;

        while (control == 1) {

            Scanner in = new Scanner(System.in);
            int userVal, answer, userDifficulty, userArith;
            int numCorrect = 0;
            double userGrade = 0;

            System.out.println("Please choose level of difficulty (1-4)");
            System.out.print(":");
            userDifficulty = in.nextInt();

            System.out.println("Please choose the type of arithmetic you would like to study (1-5)");
            System.out.print(":");
            userArith = in.nextInt();

            //QUESTION LOOPE

            for (int i = 0; i < 10; i++) {

                answer = genQuestion(userDifficulty, userArith);
                System.out.print(":");
                userVal = in.nextInt();

                if (userVal == answer) {
                    System.out.println("====================");
                    genGoodResponse();
                    System.out.println("====================");
                    numCorrect++;
                } else {
                    System.out.println("====================");
                    genBadResponse();
                    System.out.println("====================");
                }
            }

            //PASSING OR FAILING SYSTEM

            userGrade = (double) numCorrect / 10.0;

            if (userGrade > .75) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            } else {
                System.out.println("Please ask your teacher for extra help.");
            }

            //RESET SYSTEM

            System.out.print("\n\n");
            System.out.println("Would you like to reset? (1 = YES | 0 = NO)");
            userChoice = in.nextInt();

            if(userChoice != 1){
                break;
            }
            else{
                System.out.print("\n\n");
            }


        }
    }



}


