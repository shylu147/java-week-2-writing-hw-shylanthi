package homework_week_6;

import java.util.Scanner;

public class Programme_8 {
    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
        System.out.println("Please enter the height of the triangle :" );
        int height=s.nextInt();
        System.out.println("Please enter the length of the triangle : ");
        int length=s.nextInt();
        s.close();
    }
    public static void areaOfTriangle(int height,int length){
        int area= (length*height)/2;
        System.out.println("The area of triangle is :" +area);

    }

}
