package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Make your first Hello World app!
        // System.out.println("Hello World!");

        // String name = "Marta";
        // int age = 17;
        // boolean isOnline = true;

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(isOnline);

        Scanner input = new Scanner(System.in);

        // String ievade = input.nextLine();
        // System.out.println(ievade);

        // System.out.println("Ievadi vārdu:");
        // String name = input.nextLine();

        // System.out.println("Ievdi uzvārdu:");
        // String last = input.nextLine();

        // System.out.println("Ievdi grupu:");
        // String group = input.nextLine();

        // System.out.println("Students: " + name + " " + last + ", grupa: " + group);


        // int chicken = 9000;
        // double bacon = 0.1;
        // String tractor = "Zetor";

        // System.out.println("Chicken:");
        // System.out.println(chicken);
        // System.out.println("Bacon (kg):");
        // System.out.println(bacon);
        // System.out.println("Tractor:");
        // System.out.println(tractor);
        // System.out.println();
        // System.out.println("And finally" + ", a summary");
        // System.out.println(chicken);
        // System.out.println(bacon);
        // System.out.println(tractor);




        // int number1 = Integer.valueOf(input.nextLine());
        // int number2 = Integer.valueOf(input.nextLine());

        // System.out.println(number1 + number2);
        // System.out.println(number1 * number2);
        // System.out.println(number1 / number2);



        // System.out.println("Give the first number:");
        // int firstNumber = Integer.valueOf(input.nextLine());

        // System.out.println("Give the second number:");
        // int secondNumber = Integer.valueOf(input.nextLine());

        // double dvide = (double) firstNumber/secondNumber;
        // double average = (double) (firstNumber+secondNumber)/2;

        // System.out.println(firstNumber+" + "+secondNumber+" = "+(firstNumber+secondNumber));
        // System.out.println(firstNumber+" - "+secondNumber+" = "+(firstNumber-secondNumber));
        // System.out.println(firstNumber+" * "+secondNumber+" = "+(firstNumber*secondNumber));
        // System.out.println(firstNumber+" / "+secondNumber+" = "+(dvide));
        // System.out.println("Average = "+average);



        System.out.println("Give speed:");
        int speed = Integer.valueOf(input.nextLine());
        if (speed>120) {
            System.out.println("Speeding ticket!");
        }

    }

}
