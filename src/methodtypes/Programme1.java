package methodtypes;

public class Programme1 {
    // with return type with no params method
    public double areaCircle(){
        double r = 16.0;
        double area = (3.14 * r * r);
        return area;
    }
    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        obj.areaCircle();
        System.out.println(obj.areaCircle());
    }
}
