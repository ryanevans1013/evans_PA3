import java.util.*;
import java.security.SecureRandom;

public class evans_p1 {
    // Gives us access to scanner and random number generator.
    static SecureRandom rand = new SecureRandom();
    static Scanner scnr = new Scanner(System.in);

    public static int generateQuestion() {
        // Generates random number in specified boundary.
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);

        // Prints out question with randomly generated numbers.
        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");

        // Returns the correct answer.
        return rand_int1 * rand_int2;
    }

    public static void message(boolean isCorrect){
        // Stores possible comments for given answers.
        String correctMessages[] = {"Very good!", "Excellent!", "Nice Work!", "Keep up the work!"};
        String incorrectMessages[] = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."};

        // Randomly selects 1 comment
        int comment = rand.nextInt(4);

        // Prints out the correct messages.
        if(isCorrect){
            System.out.println(correctMessages[comment]);
        }
        // Prints out incorrect messages.
        else{
            System.out.println(incorrectMessages[comment]);
        }
    }

    public static void main(String[] args){

        int question;
        int response;
        int i = 0;

        while(true && i < 10){
            // Creates question.
            question = generateQuestion();
            // Gets user response.
            response = scnr.nextInt();

            // Creates boolean statement to check if user response is correct.
            boolean isCorrect = false;

            // Prints out the responses for answering correctly.
            if(response == question){
                isCorrect = true;
                message(isCorrect);
                i++;
            }
            // Loops the question until the user answers the question correctly.
            else{

                while(response != question){
                    message(isCorrect);
                    response = scnr.nextInt();
                    i++;
                }
                isCorrect = true;
                message(isCorrect);
                i++;
            }
        }
    }
}
