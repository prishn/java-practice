package methodtypes;

public class WithReturnTypeWithNoParameters {
    public static void main(String[] args) {
        int result = addition();
        System.out.println(result);
        System.out.println(addition());
        WithReturnTypeWithNoParameters obj = new WithReturnTypeWithNoParameters();
        String fullName = obj.myName();
        System.out.println(obj.myName());
        System.out.println(fullName);
       /* NoReturnNoParameters t1 = new NoReturnNoParameters();
        t1.subtraction();*/
        isRight();
        System.out.println(isRight());
    }

    /**
     * This is with return with no parameters method
     *
     * @return - it returns int type data -e.g ans
     */
    public static int addition() {
        int a = 10;
        int b = 20;
        int ans = a + b;
        return ans;
    }

    public String myName() {
        String firstName = "Asha";
        String lastName = "Kakadiya";
        return (firstName + " " + lastName);
    }

    public static boolean isRight() {
        boolean a = true;
        boolean b = false;
        return (a);
    }
}
