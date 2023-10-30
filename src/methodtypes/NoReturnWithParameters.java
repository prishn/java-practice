package methodtypes;

public class NoReturnWithParameters {
        // No return with parameters
    public static void addition(int a, int b) {
        int answer = a+b;
        System.out.println(answer);
    }
    public static void printName(String name){
        System.out.println(name);
    }

    // Instance variable
    public void printCourse(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        addition(5, 10);
        addition(100, 200);
        printName("Prime Testing");
        printName("Java");
        printName("Python");
        NoReturnWithParameters t1 = new NoReturnWithParameters();
        t1.printCourse("Java script");
    }
}
