package arrays;

public class ArraysDemo {
    //    int a = 10;
    //    int b =20;
   //    int c = 30;
    //Array declaration
    int a[]; // int array a
    int[] number; //array number
    String studentName[]; // array studentName

    public static void main(String[] args) {
        //Approach1
        int x[] = {10, 20, 30, 40, 50}; //Array x
        System.out.println(x[0]);//10
        System.out.println(x[1]);//20
        System.out.println(x[2]);//30
        System.out.println(x[3]); //40
        System.out.println(x[4]);// 50
        System.out.println(x.length); //5
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]); //10, 20, 30, 40, 50

            //Approach2
            int z[] = new int[5];
            z[0] =100;
            z[1] =200;
            z[2] =300;
            z[3] =400;
            z[4] =500;
            System.out.println(z[4]);
            String names[] = {"Java", "c++", "Python"};
            System.out.println(names[1]);
            System.out.println(names[0]);
            System.out.println(names[2]);
        }
    }
}