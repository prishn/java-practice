package variables;

public class Variables {
    int a = 100;
    String programme;
    public static void main(String[] args) {
        // Variables declaration
        // int x;
        // int y;
        // int z;
        int x,y,z;
        x =10;
        y =20;
        z =30;
        int a  =10;
        String name ="Prime";
        System.out.println(x+y+z);
        System.out.println(name);

        Variables obj = new Variables();
        System.out.println(obj.a);
        System.out.println(obj.programme = "Java");
    }
}
