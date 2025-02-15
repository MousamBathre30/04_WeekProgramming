package uncheckedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmatic_Inputmismatch {

    public static String arthmaticInputmismatchException(int a,
    int b){
        try{
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e){
            return "Arithmatic Exception catchght :) " + e.getMessage();
        } catch (InputMismatchException e){
            System.out.println("input mismatch exception");
            System.out.println("Please give valid number (int)" );
        }
        return "";
    }
    public static void main(String[] args) {
        int a , b;
        System.out.println("Enter the number a and b ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(arthmaticInputmismatchException(a ,b));

    }
}
