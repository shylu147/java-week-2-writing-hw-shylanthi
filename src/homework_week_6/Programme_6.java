package homework_week_6;

import java.util.Scanner;

/**Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius=s.nextDouble();
        m1(radius);
        s.close();
    }
    public static void m1(double radius){
        double pi=Math.PI;
        double area=(pi*radius*radius);
        System.out.println("The area of circle ic : " +area);

    }

}
