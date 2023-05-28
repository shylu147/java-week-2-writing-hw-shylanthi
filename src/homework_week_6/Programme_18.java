package homework_week_6;

import java.util.Scanner;

public class Programme_18 {
    /**Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
     * Test Data:
     * Input first number: 125
     * Input second number: 24
     * Expected Output :
     * 125 + 24 = 149
     * 125 - 24 = 101
     * 125 x 24 = 3000
     * 125 / 24 = 5
     * 125 mod 24 = 5
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int first=s.nextInt();
        System.out.println("Please enter the second number : " );
        int second =s.nextInt();
        Programme_18 obj=new Programme_18();
        obj.printTheOperation(first,second);
        s.close();
    }
    public void printTheOperation(int a,int b){
        System.out.println("The sum of" +a+ "and" +b+ "is" +(a+b));
        System.out.println("The difference of" +a+ "and" +b+ "is" +(a-b));
        System.out.println("The product of" +a+ "and" +b+ "is" +(a*b));
        System.out.println("The division of" +a+ "and" +b+ "is" +(a/b));
        System.out.println("The remainder of" +a+ "and" +b+ "is" +(a%b));

    }
}
