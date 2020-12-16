package Code.Loop.While_Loop.day3;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        //Generate a random number to be guessed
        int number= (int) (Math.random()*101);

        Scanner scan=new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        //Prompt the user to guess the number
        System.out.println("\nEnter your guess: ");
        int guess= scan.nextInt();

        if(guess==number)
            System.out.println("Yes, the number is " + number);
        else if(guess>number)
            System.out.println("Your guess is to high");
        else
            System.out.println("Your guess is to low");
    }
}
