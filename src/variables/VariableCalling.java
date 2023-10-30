package variables;

public class VariableCalling {

    String name = "Prime";  // Instance variable
    static int number= 100;  // static variable

    public static void main(String[] args) {
        VariableCalling t = new VariableCalling();
        System.out.println(t.name);
        System.out.println(number);
        System.out.println(VariableCalling.number); //
        t.m1();
        t.m2();   // instance method
        m3();  //direct
    }
    //m1 is non-static method (instance method)
    public void m1() {
        VariableCalling obj =new VariableCalling();
        System.out.println(obj.name);
        System.out.println(name);
        System.out.println(VariableCalling.number);
        System.out.println(number);
    }
    public void m2(){
        System.out.println(name);
        m3();
    }
    public static void m3(){
        System.out.println(number);
    }
}
