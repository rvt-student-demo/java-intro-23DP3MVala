package lv.rvt;

import java.util.*;

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



        // System.out.println("Give speed:");
        // int speed = Integer.valueOf(input.nextLine());
        // if (speed>120) {
        //     System.out.println("Speeding ticket!");
        // }


        // System.out.println("Value of the gift?");
        // int value = Integer.valueOf(input.nextLine());

        // if (value >= 1000000) {
        //     System.out.println("Tax: " + (142100 + (value - 1000000) * 0.17));
        // } else if (value >= 200000) {
        //     System.out.println("Tax: " + (22100 + (value - 200000) * 0.15));
        // } else if (value >= 55000) {
        //     System.out.println("Tax: " + (4700 + (value - 55000) * 0.12));
        // } else if (value >= 25000) {
        //     System.out.println("Tax: " + (1700 + (value - 25000) * 0.1));
        // } else if (value >= 5000) {
        //     System.out.println("Tax: " + (100 + (value - 5000) * 0.08));
        // } else {
        //     System.out.println("No tax!");
        // }
        // int x = 10;
        // for( ; x<100;x+=10) {
        //     System.out.println(x);
        // }
        // int sum = 0;
        // int times = 0;
        // int even = 0;
        // int odd = 0;
        // System.out.println("Give numbers:");
        // int number = Integer.valueOf(input.nextLine());
        // while(!(number==-1)) {
        //     sum += number;
        //     times ++;
        //     if (number %2==0){
        //         even++;
        //     } else {
        //         odd++;
        //     }
        //     number = Integer.valueOf(input.nextLine());
        // }
        // if (number==-1){
        //     System.out.println("Thx! Bye!");
        //     System.out.println("Sum: "+sum);
        //     System.out.println("Numbers: "+times);
        //     double avg = (double)sum/times;
        //     System.out.println("Average: "+avg);
        //     System.out.println("Even: "+even);
        //     System.out.println("Odd: "+odd);
        // }

        // System.out.println("Ievadi sākuma skaitli: ");
        // int a = Integer.valueOf(input.nextLine());
        // System.out.println("Ievadi beigu skaitli: ");
        // int b = Integer.valueOf(input.nextLine());
        // divisibleByThreeInRange(a, b);

        // Stars.printRightTriangle(4);
        // Stars.christmasTree(4);

        ArrayList<String> elements = new ArrayList<>();
        
        while (true) {
            String element = input.nextLine();

            if (!(element == "")) {
                elements.add(element);
            }
            else {
                break;
            }
        }
        System.out.println(elements.get(2));            


    }

}
