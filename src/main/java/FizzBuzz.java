package main.java;

public class FizzBuzz {

    public static String check(int number) {
        String fb = "";

        if(number == 0) {
            return "0";
        }

        if(number % 3 == 0) {
            fb += "Fizz";
        }

        if (number % 5 == 0) {
            fb += "Buzz";
        }
        return fb.isEmpty() ? String.valueOf(number) : fb;
    }
}
