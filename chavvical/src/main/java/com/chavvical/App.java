package com.chavvical;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Author: Marcelo Villalobos Diaz
 * Date: August 29, 2022
 * Class: CSIS26 - FA22
 *Description: Basic calculator.
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("0.000");
        float A = 0.000f;
        float B = 0.000f;

        while(true){

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

            char answer1;
            char answer_a = 'a';
            char answer_b = 'b';
            char answer_c = '+';
            char answer_d = '-';
            char answer_e = '*';
            char answer_f = '/';
            char answer_g = 'c';
            char answer_h = 'q';

            System.out.print("Enter a command: ");
            Scanner user1 = new Scanner(System.in);
            answer1 = user1.next().charAt(0);
            
            if(answer1 == answer_a){
                System.out.print("Enter a number: ");
                if(user1.hasNextFloat()){
                    A = user1.nextFloat();
                    continue;
                }else{
                    System.out.println("Invalid input. Please enter a valid command!");
                }
            }else if(answer1 == answer_b){
                System.out.print("Enter a number: ");
                if(user1.hasNextFloat()){
                    B = user1.nextFloat();
                    continue;
                }else{
                    System.out.println("Invalid input. Please enter a valid command!");
                }
            }else if(answer1 == answer_c){
                A = A+B;
                continue;
            }else if(answer1 == answer_d){
                A = A-B;
                continue;
            }else if(answer1 == answer_e){
                A = A*B;
                continue;
            }else if(answer1 == answer_f){
                if(A==0 && B==0){
                    System.out.println("Result is undefined. The value of A and B must be greater than 0!");
                }else if(B==0){
                    System.out.println("Cannot divide by 0. Change the value of B first!");
                }else{
                    A= A/B;
                }
                continue;
            }else if(answer1 == answer_g){
                A=0;
                B=0;
                continue;
            }else if(answer1 == answer_h){
                System.out.println("Goodbye! See you soon!");
                break;
            }else{
                System.out.println("Invalid input. Please enter valid command!");
                continue;
            }

            //user1.close();
            

        }
        

       
    }
}
