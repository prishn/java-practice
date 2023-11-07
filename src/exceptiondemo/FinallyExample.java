package exceptiondemo;

// finally block we can execute with only try and catch block
public class FinallyExample {
    public static void division() {
        int a = 10;
        //int b = 5;
        int b = 0;
        // exception handling with try-catch block plus finally block
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());// captured the error message in get method
            System.out.println("I am in catch block");
            System.out.println("Enter different number or try again");
        } finally {
            System.out.println("I am in finally block");
        }

        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        division();
    }
}
