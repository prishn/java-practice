package exceptiondemo;

public class ExceptionDemo1 {
    public static void division() {
        int a = 10;
        int b = 0;
        System.out.println("Hi");
        try{
            System.out.println(a/b);
        }catch (Exception e){
            //throw new ArithmeticException();
            System.out.println(e.getMessage());
        }

        //System.out.println(a/b);
        System.out.println("Hello world");

    }
    public static void calculation(){
        division();
    }

    public static void main(String[] args) {

    }
}
