import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userInput = 0;
        int randomNumber;

        boolean valid = false;


        randomNumber = (int)(Math.random()*10)+1;


        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Guess a number between 1-10");
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= 1 && userInput <= 10) {
                    valid = true;
                }
                else {
                    System.out.println("You did not enter a valid number please enter a integer between 1-10 ");
                }
            }
            else {
                System.out.println("You entered the wrong data type");
                scan.nextLine();
            }

        } while (!valid);

        if (userInput == randomNumber) {
            System.out.println("My number was " + randomNumber);
            System.out.println("You guessed right");
        }
        else if (userInput > randomNumber){
            System.out.println("My number was " + randomNumber);
            System.out.println("Your guess was too high");
        }
        else {
            System.out.println("My number was " + randomNumber);
            System.out.println("You guess was too low");
        }








    }
}