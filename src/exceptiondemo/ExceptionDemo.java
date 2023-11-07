package exceptiondemo;

public class ExceptionDemo {

    public static void division() {
        int a = 10;
        //int b = 2;
        int b = 0;
        // exception handling with try-catch block
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());// captured the error message in get method
            System.out.println("I am in catch block");
            System.out.println("Enter different number or try again");
        }
        //System.out.println(a / b);

        System.out.println("Hello world");
    }
        public static void main(String[]args){
            division();
        }
    }

