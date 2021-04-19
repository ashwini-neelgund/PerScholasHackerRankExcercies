package Java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

//    https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        try {
            x = input.nextInt();
            y = input.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ex) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }

}