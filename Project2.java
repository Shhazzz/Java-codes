/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to guess numbers between 1- 100 in 10 tries
	UIN: 241P092
	Date: 15/7/25
*/
package RcoeJavaExp;
import java.util.Random;
import java.util.Scanner;
public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerb = 1, upperb = 100;
        int guessno = random.nextInt(upperb - lowerb+1) + lowerb;
        int tryno=0;
        System.out.println("Guess a number between 1 - 100! ");
        while (tryno < 10){
            System.out.println("Guess a number: ");
            int num = sc.nextInt();
            tryno ++;

            if (num  == guessno){
                System.out.println("Congratulations! you've guessed it right in just " +tryno+" tries!");
                break;
            }
            else if (num < guessno){
                System.out.println("Sorry!! Guess higher!!");
            }
            else if (num > guessno){
                System.out.println("Sorry!! Guess lower!!");
            }
            else {
                System.out.println("The number is: "+ guessno);
            }
        }
        sc.close();
    }
}

