package main.java;

import java.util.Scanner;

public class FizzBuzz {

    public static String returnOutput(int number) {
        String fb = "";

        if (number == 0) {
            return "0";
        }
        if(number % 3 == 0) {
            fb += "Fizz";
        }
        if(number % 5 == 0) {
            fb += "Buzz";
        }
        System.out.println(fb);
        return fb.isEmpty() ? String.valueOf(number) : fb;
    }

    public static void checkInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        while(true) {
            String inText = input.next();
            if (inText.equals("q")) {
                break;
            } else {
                int number = Integer.parseInt(inText);
                returnOutput(number);
            }
        }
    }

    public static void main(String[] args) {
        checkInput();
    }
}
