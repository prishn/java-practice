package encapsulation;

public class EncapsulationDemo {
    // private field/private variable or member
    private int id;
    private String name;

    // get method is return type
    public int getId() {
        return id;
    }

    // set method require parameters and no return type
    public void setId(int id) {

        this.id = id;
    }

    // get method is return type
    public String getName() {

        return name;
    }

    // set method require parameters and no return type
    public void setName(String name) {

        this.name = name;
    }
}
