package com.company.dahms;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double x= 0;
        Scanner input = new Scanner(System.in);
        while (x != -460) {
            x = input(input);
            output(math(x));
        }
    }

    public static double input(Scanner input){
        System.out.println("Please Input a temperature in Fahrenheit. Input -460 to exit.");
        return input.nextDouble();
    }

    public static double math(double temp){
        return (temp - 32) * 5/9;
    }

    public static void output(double temp){
        System.out.println(temp + " C");
    }

}
