package introductory_programming_exercises;

import java.util.Scanner;

public class TriangleExercises {

    public static void oneAsterisk() {
        System.out.println("*");
    }

    public static void horizontalLine(int length) {
        do{
            System.out.print("*");
            length -= 1;
        }while(length > 0);

        System.out.println();
    }

    public static void verticalLine(int height) {
        do{
            System.out.println("*");
            height -= 1;
        }while(height > 0);
    }

    public static void rightTriangle(int triangle_height){
        for(int i = 1; i <= triangle_height; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        oneAsterisk();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the length of the horizontal line:");
        int length = sc.nextInt();
        horizontalLine(length);
        System.out.println("Please Enter the height of the vertical line:");
        int height = sc.nextInt();
        verticalLine(height);
        System.out.println("Please Enter the height of the right triangle:");
        int tri_height = sc.nextInt();
        rightTriangle(tri_height);
    }

}
