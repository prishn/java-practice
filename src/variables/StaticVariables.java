package variables;

public class StaticVariables {
    /**variable which is declared outside method and inside class with static keyword called static variable
     * static variable - class name
     * scope - within the class
     * Memory allocation - when class is loaded
     * store - non heap memory
     * do not need to declare any object
     */
        static int a =10;
       static String name = "Prime Testing";
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticVariables.a);
        System.out.println(name);
        System.out.println(StaticVariables.name);
    }
    public void m1(){
        System.out.println(a);
        System.out.println(StaticVariables.a);
        System.out.println(name);
        System.out.println(StaticVariables.name);
    }
}

