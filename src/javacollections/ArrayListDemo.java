package javacollections;
// homogenous data only
import java.util.ArrayList;

public class ArrayListDemo {
    // Array
    int [] a = new int[5];
    public static void main(String[] args) {
        //Array list declaration
        ArrayList <String> carList = new ArrayList();
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Ford");
        carList.add("Toyota");
        carList.add("Audi");
        carList.add(null);
         //carList.size();
        System.out.println(carList.size());
        System.out.println(carList.get(1));
        System.out.println(carList.contains("Audi"));
        //for loop

        for( String car : carList){
            System.out.println("The item is " + car);
        }
        carList.remove("Toyota");
        for( String car : carList){
            System.out.print(car + " ");
        }
        //carList.removeAll(Collections.unmodifiableCollection("Audi"));
    }
}
