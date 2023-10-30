package polymorphism;

/**
 * Compile time polymorphism
 * Early binding
 * static binding
 */
public class MethodOverloadingExample {
    /**
     * 1.with different data type can overload the method
     * 2.with different number of arguments we can achieve overload
     * 3. different sequence of arguments
     * @param a
     */
    public void m1(int a){

    }
    //with different data type can overload the method
    public void m1(String name){

    }
    //with different number of arguments we can achieve overload
    public void m1(String name, int a){

    }
    //different sequence of arguments
    public void m1(int a, String name){

    }
    public void addition(int a, int b){

    }
    public void addition(int a, int b, int c){

    }


}
