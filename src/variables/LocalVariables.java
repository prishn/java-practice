package variables;

public class LocalVariables {
    /**
     *  local variable   - variables which are declared inside the method or inside constructors are called
     *                    local variables
     *  Scope             - within the method
     *  Memory allocation - when method starts
     *  Memory            - stack
     */
    public static void main(String[] args) {
        // a is a local variable
        int a = 2;
        System.out.println(a);
        a =3;
        System.out.println(a);
    }
}
