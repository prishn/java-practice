package iterationstatements;

public class ForLoopDemo {
    public static void main(String[] args) {
        // print the number 0 to 10
//        for (int i = 0; i <= 10; i++) {
//            // System.out.println("Hello");
//            System.out.println("Print the result of i: " + i); //0, 1, 2, 3, 4 ----10

            // print the number 5 to 10
//            for (int j = 5; j <= 10; j++) {
//                // System.out.println("Hello");
//                System.out.println("Print the result of j: " + j); //5, 6, 7 ----10
//            }
            //print 10 to 1 using for loop
//            for (int k = 10; k > 0; k--) {
//                //for(int k = 10; k>=1; k--)
//                // System.out.println("Hello");
//                System.out.println("Print the result of k: " + k);
//            }
            //print odd  number between 1 to 10 ( 1, 3, 5, 7, 9)
//            for (int l = 1; l <= 10; l++) {
//                // l = i+1;
//                if (l % 2 == 1) {
//                    //if (l % 2 !=0){
//                    System.out.println("Print the result of l: " + l);
//                }
//            }
            // print even number between 1 to 20
            for (int m = 1; m <= 20; m++) {
                if (m % 2 == 0) {
                    System.out.println("Print the result of m: " + m);
                }
            }
            // print number 1,2,3,4,6,8,9,10
            for (int n = 1; n <= 10; n++) {
                if (n != 5 && n != 7) {
                    System.out.println("Print the result of n: " + n);
                } else {
                    System.out.println("This is not required number");
                }
            }
        }
    }

