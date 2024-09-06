package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Make your first Hello World app!
        // System.out.println("Hello World");

        // String name = "Marta";
        // int age = 17;
        // boolean isOnline = true;

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(isOnline);

        Scanner input = new Scanner(System.in);

        // String ievade = input.nextLine();
        // System.out.println(ievade);

        System.out.println("Ievadi vārdu:");
        String name = input.nextLine();

        System.out.println("Ievdi uzvārdu:");
        String last = input.nextLine();

        System.out.println("Ievdi grupu:");
        String group = input.nextLine();

        System.out.println("Students: " + name + " " + last + ", grupa: " + group);
    }

}
