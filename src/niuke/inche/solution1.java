package niuke.inche;

import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.indexOf(0)=='"' && input.indexOf(input.length()-1)=='"'){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
