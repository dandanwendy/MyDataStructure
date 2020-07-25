package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nextLineDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("enter an integer");
                int number = input.nextInt();

                System.out.println("the number entered is" + number);
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println("try again, incorrect input");
                input.nextLine();
            }
        }while(continueInput);
    }
}
