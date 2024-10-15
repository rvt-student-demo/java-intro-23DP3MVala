package lv.rvt;

// import java.util.Scanner;

public class Stars {
    public static void printStars(int number) {
        
        for(int i = 0; i < number; i++) {
        System.out.print("*");
        }
        System.out.println("");

    }

    public static void printSquare(int  size) {
        
        for (int i = 0; i < size; i++) {
            Stars.printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {

        for (int i = 0; i < height; i++) {
            Stars.printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            Stars.printStars(i+1);
        }
    }

    public  static void printSpaces (int number) {
        for(int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public  static void printRightTriangle (int size) {
        for(int i = 0; i < size; i++) {
            int space = size - i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            Stars.printStars(i+1);
        }
    }

    public  static void christmasTree (int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
            }
            System.out.println("");
        }

        for (int c = 0; c < 2; c++) {
            for (int b = 0; b < height - 2; b++) {
                System.out.print(" ");
            }
            Stars.printStars(3);

        }


    }


}
