package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )

    {
    Scanner input = new Scanner(System.in);

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

        // ArrayList<Integer> list = new ArrayList<>();
        
    //     while (true) {
    //         int value = Integer.valueOf(input.nextLine());

    //         if (!(value == -1)) {
    //             list.add(value);
    //         }
    //         else {
    //             break;
    //         }
    //     }

    //     System.out.print("From where? ");
    //     int min = Integer.valueOf(input.nextLine());
    //     System.out.print("To where? ");
    //     int max = Integer.valueOf(input.nextLine());

    //     while(true) {
    //         if (max <= list.size()) {
    //             for (int a = min; a <= max; a++) {
    //                 System.out.println(list.get(a));
    //             }
    //             break;
    //         }
    //         else {
    //             break;
    //         }
    //     }   

    // Books book = new Books();
    // while (true) {
    //     System.out.print("Title: ");
    //     String newBook = String.valueOf(input.nextLine());
    //     if (!(newBook == "")) {
    //         System.out.print("Pages: ");
    //         int pg = Integer.valueOf(input.nextLine());
    //         System.out.print("Publication year: ");
    //         int yr = Integer.valueOf(input.nextLine());
    //         book.addNew(newBook,pg,yr);
    //     }
    //     else {
    //         break;
    //     }
    // }
    // System.out.println();

    // while (true) {
    //     System.out.print("What information will be printed: ");
    //     String izvele = String.valueOf(input.nextLine());
    //     if (izvele.equals("everything")) {
    //         book.Everything();
    //     }
    //     else {
    //         book.onlyName();

    Box box = new Box(2.5, 5.0, 6.0);
    Box box1 = new Box(2.0, 4.0, 5.0);

    System.out.println(box1.nests(box));

    System.out.println(box.smallerBox(box));
   }
}
