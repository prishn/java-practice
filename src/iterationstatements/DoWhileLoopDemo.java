package iterationstatements;

public class DoWhileLoopDemo {

    public static void main(String[] args) {
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=5);
        //print number between 10 to 20
//        int j = 10;
//        do{
//            System.out.println(j);
//            j++;
//        }while(j<=20);
        // print even number 1 to 10
        int k = 2; // start with first even number
        do {
            System.out.println(k);// print the even numbers
            k += 2; // move to the next even number
        } while (k <= 10); // condition

        // print odd number 1 to 10
        int l = 1; // start with first odd number
        do {
            System.out.println(l); // print odd number
            l += 2; // move to the next odd number
        } while (l <= 10); // condition

    }
}
