package arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int a [][] = new int[3][2];  //3 is raw and 2 is column
        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;
        System.out.println(a[1][0]);//300
        System.out.println(a[2][0]);//500
        System.out.println(a[0][0]);//100
        System.out.println(a[1][1]);//400
        System.out.println(a[0][1]);//200
        System.out.println(a[2][1]);//600
    }
}

