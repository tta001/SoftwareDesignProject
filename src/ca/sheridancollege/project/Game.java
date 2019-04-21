
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * This project simulates a card matching game using a deck of cards. 
 */

/**
 *
 * @author ttta
 */
public class Game {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GroupOfCards set1 = new GroupOfCards();
        System.out.println(set1);
        GroupOfCards set2 = new GroupOfCards();
        System.out.println(set2);
        char keepGoing = 'Y';
        int correctMatches = 0;
        
        System.out.println("Welcome to Flippin' Matchin' ");
        do {
            System.out.print("Please choose a number from 1 - 13: ");
            int select1 = in.nextInt();
            if (select1 < 1 || select1 > 13) {
                System.out.println("Sorry, that is not a valid number.");
                System.out.println("Please enter a number between 1 - 13.");
                select1 = in.nextInt();
            }
            int num1 = select1 - 1;
            System.out.println("You have selected: " + set1.get(num1));
            System.out.print("Please choose a second number from 1 - 13: ");
            int select2 = in.nextInt();
            if (select2 < 1 || select2 > 13) {
                System.out.println("Sorry, that is not a valid number.");
                System.out.println("Please enter a number between 1 - 13.");
                select2 = in.nextInt();
            }
            int num2 = select2 - 1;
            System.out.println("You have selected: " + set2.get(num2));
            
            if (String.valueOf(set1.get(num1)).equals(String.valueOf(set2.get(num2)))) {
                System.out.println("You got a match!");
                keepGoing = in.next().toUpperCase().charAt(0);
            } else {
                System.out.println("Sorry, these cards don't match. Try Again.");
                System.out.println("Would you like to keep playing? y/n");
                keepGoing = in.next().toUpperCase().charAt(0);
            }

        } while (keepGoing == 'Y');
 
    }
}

