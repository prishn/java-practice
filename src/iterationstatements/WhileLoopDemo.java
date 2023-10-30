package iterationstatements;

public class WhileLoopDemo {

    public static void main(String[] args) {
        // print number 1 to 5
//        int a = 1;
//        while (a <= 5) {
//            System.out.println(a);
//            a++;
        // print number between 1 to 10
//            int b = 0;
//            while (b < 11) {
//                System.out.println(b);
//                b++;
//            }
        // print number from 10 to 1
//            int c = 10;
//            while (c >= 1) {
//                System.out.println(c);
//                c--;
//            }
//            System.out.println("Outside while loop");
//            boolean ans = true;
//            while (true) {
//                if (ans) {
//                    System.out.println("Prime");
//                    break;
//                }
        // print even number between 1 to 10
        int x = 2; // start with the first even number
        while (x <= 10) { // condition
            System.out.println(x + " is even number"); // print even numbers
            x += 2; // move to the next even number
        }
        // print odd number between 1 to 10
        int y = 1;// start with first odd number
        while (y <= 10) {
            System.out.println(y + " is odd number");
            y += 2; // move to the next odd number
        }
        // find even number using while and if together
        int z = 2;// start with the first even number
        while (z <= 10){ // condition
            if(z % 2 == 0){ // formula to find even number
                System.out.println(z + " is even number"); //print even number
            }
            z++; // move to the next even number
        }

    }
}
//    }
//}
