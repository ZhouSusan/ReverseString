package org.example;
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        String inputStr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your text here: ");

        inputStr = scanner.nextLine();
        int i = inputStr.length();
        System.out.println("Your reverse string is: ");
        while (i  >  0) {
            System.out.print(inputStr.charAt(i - 1));
            i-=1;
        }
    }
}