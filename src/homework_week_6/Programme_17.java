package homework_week_6;

import java.util.Scanner;

public class Programme_17 {
    /**Write a Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     * Binary number is: 101
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the decimal number ;" );
        int number=s.nextInt();
        convertDecimalToBinary(number);
        s.close();
    }
    public static void convertDecimalToBinary(int number){
        String binary=Integer.toBinaryString(number);
        System.out.println("The binary number value is : " +binary);

    }
}
