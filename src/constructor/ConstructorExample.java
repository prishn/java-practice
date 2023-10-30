package constructor;
//Constructor is used to assign the value to the instance variable
//It is called when object created
public class ConstructorExample {
    int empID; //10
    String empName; // Asha
    public ConstructorExample(int empID, String empName){
        //this keyword is used for when local and global variable name is same
                this.empID = empID;
                this.empName = empName;
    }
    public void display(){
        System.out.println(empID);
        System.out.println(empName);
    }

    public static void main(String[] args) {
        ConstructorExample t = new ConstructorExample(10, "Asha");
        t.display(); //10, Asha
        ConstructorExample t1 = new ConstructorExample(20, "Prime");
        t1.display();// 20, Prime
    }
}
