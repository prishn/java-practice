package datatype;

public class DataType {
    public static void main(String [] args) {

        //byte, short, int long -for numerical value
       int a =10;
       int b =30;
        // size is 8 and value is -128 to 127

        int result = a+b;
       System.out.println(result);  //40

       // double and float - for decimal value
       double c = 5.65d;  //more size than float and more precise, double is more prisize than float
       float d =5.90f;  //
        System.out.println(c);
        System.out.println(d);

        // character -for single character
        char e ='K';
        System.out.println(e);

        // boolean  -for true or false
        boolean f =true;
        System.out.println(f);
        // String - for word, or series of characters
        String name = "Good Evening";
        System.out.println(name);
    }
}
