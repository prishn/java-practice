package javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> carMap = new HashMap();
        carMap.put(1, "BMW");
        carMap.put(2, "Audi");
        carMap.put(3, "Toyota");
        carMap.put(4, "Skoda");
        carMap.put(5, "BMW");

        for (Map.Entry<Integer, String> car : carMap.entrySet()) {
            System.out.println(car.getKey() + " " + car.getValue());
        }

        Iterator<Map.Entry<Integer, String>> carList = carMap.entrySet().iterator();
        while (carList.hasNext()) {
            System.out.print(carList.next() + ", ");
        }

    }
}
