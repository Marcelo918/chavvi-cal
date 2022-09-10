package com.chavvical;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Author: Marcelo Villalobos Diaz
 * Date: September 10, 2022
 * Class: CSIS26 - FA22
 * Description: Basic calculator. The user is allowed to type anything. But, the calculator is resilient.
 *              So, it only accepts valid input. Valid input is the single character menu commands like (a,b,+,-,*,=,c,q).
 *              Entering non-numerical values for a number prints an error message. Dividing by 0 prints an error message.
 *              To enter commands or numers, the user types in a command or number, and then presses enter.
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("0.000");
        float A = 0.000f; //Upon starting the calculator, the values of A and B are initially set to 0
        float B = 0.000f; //The display precision of A and B is 3 significant figures

        char answer_a = 'a'; //Asks the user to enter a number for A
        char answer_b = 'b'; //Asks the user to enter a number for B
        char answer_c = '+'; //A gets the value of A plus B. In other words, A=A+B
        char answer_d = '-'; //A gets the value of A minus B. In other words, A=A-B 
        char answer_e = '*'; //A gets the value of A times B. In other words, A=A*B
        char answer_f = '/'; //A gets the value of A divided by B. In other words, A=A/B. Dividing by 0 is invalid user input
        char answer_g = 'c'; //Clears the value of A and B. A gets the value 0 and B gets the value 0
        char answer_h = 'q'; //Quits the app

        while(true){

            //The following print statemens are the user interface of the calculator.
            System.out.println( "---------------------------------------------------------------------" );
            System.out.println("Chavvi Cal");
            System.out.println( "---------------------------------------------------------------------" );
            System.out.println("A = " + df.format(A) + "   " + "B = " + df.format(B));
            System.out.println( "---------------------------------------------------------------------" );
            System.out.println("a     Enter a value for A");
            System.out.println("b     Enter a value for B");
            System.out.println("+     Add");
            System.out.println("-     Subtract");
            System.out.println("*     Multiply");
            System.out.println("/     Divide");
            System.out.println("c     Clear");
            System.out.println("q     Quit");
            System.out.println( "---------------------------------------------------------------------" );


            System.out.print("Enter a command: ");
            Scanner user1 = new Scanner(System.in); //Scans for user input
            //answer1 = user1.next().charAt(0);
            String answer1 = user1.next();
            char answer2 = answer1.charAt(0);
            if(answer1.length() != 1){ //This if statement checks the input is only one character
                
                System.out.println("Invalid input. Please enter a valid command!"); //Error message
                //answer1 = user1.next();
                continue;
            }else if(answer2 == answer_a){ //The following if else statements is to check if the user input entered a valid command. 
                System.out.print("Enter a number: ");
                if(!user1.hasNextFloat()){
                    System.out.println("Invalid input. Please enter a valid number!"); //Error message
                    continue;
                }else if(user1.hasNextFloat()){
                    A = user1.nextFloat();
                    continue;
                }
            }else if(answer2 == answer_b){
                System.out.print("Enter a number: ");
                if(!user1.hasNextFloat()){
                    System.out.println("Invalid input. Please enter a valid number!"); //Error message
                    continue;
                }else if(user1.hasNextFloat()){
                    B = user1.nextFloat();
                    continue;
                }
            }else if(answer2 == answer_c){
                A = A+B;
                continue;
            }else if(answer2 == answer_d){
                A = A-B;
                continue;
            }else if(answer2 == answer_e){
                A = A*B;
                continue;
            }else if(answer2 == answer_f){
                if(A==0 && B==0){
                    System.out.println("Result is undefined. The value of A and B must be greater than 0!"); //Error message
                }else if(B==0){
                    System.out.println("Cannot divide by 0. Change the value of B first!"); //Error message
                }else{
                    A= A/B;
                }
                continue;
            }else if(answer2 == answer_g){
                A=0;
                B=0;
                continue;
            }else if(answer2 == answer_h){
                System.out.println("Goodbye! See you soon!"); //Goodbye message
                break;
            }else{
                System.out.println("Invalid input. Please enter valid command!"); //Error message.
                continue;
            }

            user1.close();
            

        }
        

       
    }
}
