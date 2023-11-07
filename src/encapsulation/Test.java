package encapsulation;

public class Test {
    // the class you want to access create for that class object
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        // set the value firsts and then get the method
        obj. setId(50);
        System.out.println(obj.getId());
        obj.setName("Asha");
        System.out.println(obj.getName());
        obj.setId(75);
        System.out.println(obj.getId());
        obj.setName("Kakadiya");
        System.out.println(obj.getName());
    }
}
