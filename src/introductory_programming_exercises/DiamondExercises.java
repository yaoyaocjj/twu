package introductory_programming_exercises;

import java.util.Scanner;
import java.util.HashSet;

public class DiamondExercises {

    public static void isoscelesTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lowTriangle(int height) {
        for (int i = 1; i <= height - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (height - 1 - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int height) {
        isoscelesTriangle(height);
        lowTriangle(height);
    }

    public static void diamondWithName(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == height) {
                    if (k == height) System.out.print("myName");
                    else System.out.print("2");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        lowTriangle(height);
    }

    public static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        }
    }

    public static void generate(int n) {
        HashSet<Integer> primeFactor = new HashSet<>();
        int k = 2;
        while (k <= n) {
            if (k == n) {
                primeFactor.add(n);
                break;
            } else if (n % k == 0) {
                primeFactor.add(k);
                n = n / k;
            } else k++;
        }
        for (Integer factor : primeFactor) {
            System.out.println(factor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the length of the isosceles triangle line:");
        int height = sc.nextInt();
        isoscelesTriangle(height);
        System.out.println("Please Enter the half height of the diamond:");
        int diamondHeight = sc.nextInt();
        diamond(diamondHeight);
        System.out.println("Please Enter the half height of the diamond:");
        int diamondWithNameHeight = sc.nextInt();
        diamondWithName(diamondWithNameHeight);
        System.out.println("Please Enter the number of the FizzBuzz:");
        int number = sc.nextInt();
        fizzBuzz(number);
        System.out.println("Please Enter a number:");
        int n = sc.nextInt();
        generate(n);
    }
}
