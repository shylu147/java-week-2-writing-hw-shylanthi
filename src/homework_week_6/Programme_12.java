package homework_week_6;

public class Programme_12 {
    /**Write a Java program to compute the specified expressions and print the
     output.
     Test Data:
     ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     Expected Output : 2.138888888888889
     */
    public static void main(String[] args) {
        Programme_12 obj=new Programme_12();
        obj.printExpression();
    }
    public void printExpression(){
        double a= ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }

}
