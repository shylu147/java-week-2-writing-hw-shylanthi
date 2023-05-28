package homework_week_6;

public class Programme_11 {
    /** Write a Java program to display the following pattern.
     Sample Pattern :
     J a v v a
     J a a v v a a
     J J aaaaa V V aaaaa
     J J a a V a a
     */
    public static void main(String[] args) {
        Programme_11 obj=new Programme_11();
        System.out.println("---------------------------------------------");
        obj.javaPattern();
    }

    // Printing the Java Pattern
    public void javaPattern() {
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");
    }
}
