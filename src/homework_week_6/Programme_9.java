package homework_week_6;

import java.util.Locale;
import java.util.Scanner;

/**Write a program to convert the upper case to lower case.
*/
public class Programme_9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the uppercase string :" );
        String uppercase=s.nextLine();
        Programme_9 obj=new Programme_9();
        obj.convertUppercaseToLowercase(uppercase);
    }
    public void convertUppercaseToLowercase(String text){
        System.out.println("The lowercase value is :" +text.toLowerCase());

    }
}
