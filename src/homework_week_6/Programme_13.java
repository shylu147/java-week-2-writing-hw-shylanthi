package homework_week_6;

import java.util.Scanner;

public class Programme_13 {
    /**Write a Java program that takes three numbers as input to calculate and
     *print the average of the numbers.
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first number : " );
        double x=s.nextDouble();
        System.out.println("Enter the second number : ");
        double y=s.nextDouble();
        System.out.println("Enter the third number : ");
        double z=s.nextDouble();
        averageOfThreeNumbers(x,y,z);
        s.close();
    }
    public static void averageOfThreeNumbers(double a,double b,double c){
        double average= (a+b+c)/3;
        System.out.println("The average =" +average);
    }
}
