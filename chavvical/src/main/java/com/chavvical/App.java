package com.chavvical;

import java.util.Scanner;

/**
 * Author: Marcelo Villalobos Diaz
 * Date: September 19, 2022
 * Class: CSIS26 - FA22
 * Description: Basic calculator. The user is allowed to type anything. But, the
 * calculator is resilient.
 * So, it only accepts valid input. Valid input is the single character menu
 * commands like (a,b,+,-,*,=,c,q).
 * Entering non-numerical values for a number prints an error message. Dividing
 * by 0 prints an error message.
 * To enter commands or numers, the user types in a command or number, and then
 * presses enter.
 */
public class App {
    public static void main(String[] args) {
        // Upon starting the calculator, the values of A and B are initially set to 0
        // The display precision of A and B is 3 significant figures
        float numberA = 0.000f;
        float numberB = 0.000f;

        // the following are the only characters allowed to be input
        // Asks the user to enter a number for A
        char answerA = 'a';
        // Asks the user to enter a number for B
        char answerB = 'b';
        // A gets the value of A plus B. In other words, A=A+B
        char answerC = '+';
        // A gets the value of A minus B. In other words, A=A-B
        char answerD = '-';
        // A gets the value of A times B. In other words, A=A*B
        char answerE = '*';
        // A gets the value of A divided by B. In other words, A=A/B. Dividing by 0 is
        // invalid user input
        char answerF = '/';
        // Clears the value of A and B. A gets the value 0 and B gets the value 0
        char answerG = 'c';
        // Quits the app
        char answerH = 'q';

        // conditional statement for the while loop
        boolean isRunning = true;

        while (isRunning) {

            // The following print statemens are the user interface of the calculator.
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Chavvi Cal");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("A = ");
            System.out.printf("%.3f    ", numberA);
            System.out.print("B = ");
            System.out.printf("%.3f%n", numberB);
            System.out.println("---------------------------------------------------------------------");
            System.out.println("a     Enter a value for A");
            System.out.println("b     Enter a value for B");
            System.out.println("+     Add");
            System.out.println("-     Subtract");
            System.out.println("*     Multiply");
            System.out.println("/     Divide");
            System.out.println("c     Clear");
            System.out.println("q     Quit");
            System.out.println("---------------------------------------------------------------------");

            System.out.print("Enter a command: ");
            // Scans for user input
            Scanner user1 = new Scanner(System.in);
            String userAnswer = user1.next();
            char answerCheck = userAnswer.charAt(0);
            // This if statement checks if the input is only one character
            if (userAnswer.length() != 1) {
                // Prints error message
                System.out.println("Invalid input. Please enter a valid command!");
                // answer1 = user1.next();
                continue;
            } else if (answerCheck == answerA) {
                System.out.print("Enter a number: ");
                if (!user1.hasNextFloat()) {
                    // Prints error message
                    System.out.println("Invalid input. Please enter a valid number!");
                    continue;
                } else if (user1.hasNextFloat()) {
                    numberA = user1.nextFloat();
                    continue;
                }
            } else if (answerCheck == answerB) {
                System.out.print("Enter a number: ");
                if (!user1.hasNextFloat()) {
                    // Prints error message
                    System.out.println("Invalid input. Please enter a valid number!");
                    continue;
                } else if (user1.hasNextFloat()) {
                    numberB = user1.nextFloat();
                    continue;
                }
            } else if (answerCheck == answerC) {
                numberA = numberA + numberB;
                continue;
            } else if (answerCheck == answerD) {
                numberA = numberA - numberB;
                continue;
            } else if (answerCheck == answerE) {
                numberA = numberA * numberB;
                continue;
            } else if (answerCheck == answerF) {
                if (numberA == 0 && numberB == 0) {
                    // Prints error message
                    System.out.println("Result is undefined. The value of A and B must be greater than 0!");
                } else if (numberB == 0) {
                    // Prints error message
                    System.out.println("Cannot divide by 0. Change the value of B first!");
                } else {
                    numberA = numberA / numberB;
                }
                continue;
            } else if (answerCheck == answerG) {
                numberA = 0;
                numberB = 0;
                continue;
            } else if (answerCheck == answerH) {
                // Prints goodbye message
                System.out.println("Goodbye! See you soon!");
                break;
            } else {
                // Prints error message
                System.out.println("Invalid input. Please enter valid command!");
                continue;
            }

            user1.close();

        }

    }
}
