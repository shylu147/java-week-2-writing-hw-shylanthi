package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class Programme_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number = s.nextInt();
        multiplicationTable(8);
        s.close();
    }
public static void multiplicationTable(int number){
    System.out.println(number + "*1" +"=" +number);
    System.out.println(number + "*2" + "=" +number*2);
    System.out.println(number + "*3" + "=" +number);
    System.out.println(number + "*4" + "=" +number);
    System.out.println(number + "*5" + "=" +number);
    System.out.println(number + "*6" + "=" +number);
    System.out.println(number + "*7" + "=" +number);
    System.out.println(number + "*8" + "=" +number);
    System.out.println(number + "*9" + "=" +number);
    System.out.println(number + "*10" + "=" +number);

}
}
