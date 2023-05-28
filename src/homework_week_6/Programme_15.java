package homework_week_6;

import java.util.Scanner;

public class Programme_15 {
    /**Write a Java program to swap two variables.
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first=s.nextInt();
        System.out.println("Enter the second variable value : ");
        int second=s.nextInt();
    }
    public void swapTheValue(int a,int b){
        int c;
        System.out.println("Before the swapping, The value of first variable is : " +a+ "and second variable is : " +b);
        c=a;
        a=b;
        b=c;
        System.out.println("After the swapping, The values of first variable is : "+a+ "and second variable is : " +b);

    }
}
