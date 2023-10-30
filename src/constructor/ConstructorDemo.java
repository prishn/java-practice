package constructor;

public class ConstructorDemo {
    public ConstructorDemo() {
        System.out.println("Zero args constructors");
    }

    public ConstructorDemo(int a) {
        System.out.println("1 args constructor " + a);
    }

    public ConstructorDemo(String name) {
        System.out.println("1 args constructor " + name);
    }

    public ConstructorDemo(int a, int b) {
        System.out.println("This is 2 args Constructor " + a +b);
    }

    public ConstructorDemo(int a, int b, String name) {
        System.out.println("This is 3 args Constructor " + a + " " + b + " " +name);
    }
    public void addition(){
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        //Constructor is called when object is created
        ConstructorDemo t = new ConstructorDemo();// Zero args params
        ConstructorDemo t1 = new ConstructorDemo(5); // parameterised constructor
        ConstructorDemo t2 = new ConstructorDemo("Asha"); //param constructor
        ConstructorDemo t3 = new ConstructorDemo(10, 20);
        ConstructorDemo t4 = new ConstructorDemo(10, 20, "Asha");
        t.addition();
    }
}
