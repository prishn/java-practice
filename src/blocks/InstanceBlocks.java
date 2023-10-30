package blocks;

public class InstanceBlocks {
    String eName;
    // this is instance block
    {
        System.out.println("I am in instance block");
        eName = "Vijay";
    }
    // this is constructor
    InstanceBlocks(){
        this.eName = eName;
        System.out.println("I am in constructor");
    }

    public static void main(String[] args) {
        InstanceBlocks obj = new InstanceBlocks();
        System.out.println(obj.eName);
    }
}

