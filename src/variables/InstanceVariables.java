package variables;

public class InstanceVariables {
    /** Instance variable - can declared out side of method and within the class called instance variable
     * Instance variable - object name
     * Scope - within the class
     * Memory allocation - when object is created
     * memory - heap
     */
    int a = 10;   // a is a instance or global variable
    String name = "Prime Testing"; // name is a instance or global variable

    public static void main(String[] args) {
         InstanceVariables obj = new InstanceVariables();
              System.out.println(obj.a);
              System.out.println(obj.name);
         }
    public void mymethod(){
        InstanceVariables v1 =new InstanceVariables();
        System.out.println(v1.a);
        System.out.println(v1.name);
    }
}
