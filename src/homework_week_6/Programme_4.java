package homework_week_6;

/**Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 *
 */

public class Programme_4 {
    String Name="Prime";
    String surname="Testing";
    static boolean a=true;
    static boolean b=false;

    public void instanceMethod(){
        System.out.println(Name);
        System.out.println(surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }
    public static void staticMethod(){
        Programme_4 obj =new Programme_4();

        System.out.println(obj.Name);
        System.out.println(obj.surname);
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        Programme_4.staticMethod();
        Programme_4 obj =new Programme_4();
        obj.instanceMethod();

    }
}