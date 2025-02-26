package com.bhavya.calculator;

import java.util.Scanner;

public class Calculator {

    public double squareRoot(double x) {
        if (x < 0) {
            System.out.println("Imaginar roots");
            return -1;
        }
        return Math.sqrt(x);
    }

    public long factorial(int n) {
        if (n < 0) {
            System.out.println("Can't compute factorial for negative inputs");
            return -1;
        }
        if (n == 0) return 1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public double Log(double x) {
        if (x <= 0) {
            System.out.println("Logarithm is undefined for negative numbers");
            return -1;
        }
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }


    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Log (ln x)");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int ch = sc.nextInt();
            if (ch == 5) {
                System.out.println("Byee..Have a good day!");
                break;
            }

            double num, result;
            switch (ch) {
                case 1:
                    System.out.print("Enter a number: ");
                    num = sc.nextDouble();
                    result = c.squareRoot(num);
                    if (result != -1) System.out.println("√" + num + " = " + result);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    long factResult = c.factorial(n);
                    if (factResult != -1) System.out.println(n + "! = " + factResult);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    num = sc.nextDouble();
                    result = c.Log(num);
                    if (result != -1) System.out.println("ln(" + num + ") = " + result);
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = sc.nextDouble();
                    result = c.power(base, exponent);
                    System.out.println(base + "^" + exponent + " = " + result);
                    break;

                default:
                    System.out.println("Please enter valid number");
            }
        }
        sc.close();
    }
}
