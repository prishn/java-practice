package interfacedemo;
// child class
// calling Interfacedemo and interfacedemo1
public class Test implements InterfaceDemo, InterfaceDemo1 {
    public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m2 method");
    }
    public void m3(){
        System.out.println("m3 method");
    }
}
