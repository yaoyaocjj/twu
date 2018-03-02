package introductory_programming_exercises;

import java.util.Scanner;

public class DiamondExercises {

    public static void isoscelesTriangle (int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j <= height-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the length of the isosceles triangle line:");
        int height = sc.nextInt();
        isoscelesTriangle(height);
    }
}
