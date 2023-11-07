package javacollections;

import java.util.ArrayList;

// heterogeneous data
public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList  list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add(50);
        list.add(true);
        list.add('K');
        list.add(50.50);

        System.out.println(list);

        for (Object name : list){
            System.out.print(name + " ");
        }
        ArrayList<Integer> numberList = new ArrayList();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
       // System.out.println(" ");
        System.out.println("\n" +numberList.get(0));
        System.out.println(numberList.get(2));
    }
}
