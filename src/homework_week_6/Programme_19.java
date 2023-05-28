package homework_week_6;

import java.util.Scanner;

public class Programme_19 {
    /**rite a Java program to convert a given string into lowercase.
     * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     * Output: the quick brown fox jumps over the lazy dog.
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the uppercase sentence : ");
        String uppercase=s.nextLine();
        Programme_19 obj=new Programme_19();
        obj.covertToLowercase(uppercase);
    }
    public void covertToLowercase(String str){
        System.out.println("The lowercase string is :" +str.toLowerCase());

    }
}
