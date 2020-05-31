package main.java;

public class FizzBuzz {

    public static String check(int number) {
        if(number == 0) {
            return "0";

        }
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";

        }
        if(number % 3 == 0) {
            return "Fizz";

        } else if (number % 5 == 0){
            return "Buzz";

        }
        return String.valueOf(number);
    }
}
