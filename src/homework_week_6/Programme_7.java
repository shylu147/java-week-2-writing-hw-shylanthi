package homework_week_6;

import java.util.Scanner;

public class Programme_7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit :");
        float temp=s.nextFloat();
        Programme_7 obj=new Programme_7();
        obj.convertTempToDegreeCelcius(temp);
        s.close();

    }
    public void convertTempToDegreeCelcius(float temp){
        float c=((temp-32)*5/9);
        System.out.println("The temperature" +temp+ "farrenheit is equal to" +c+ "degree celsius");
    }
}
