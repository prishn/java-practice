package iterationstatements;

public class WhileLoopDemo {

    public static void main(String[] args) {
        // print number t to 5
//        int a = 1;
//        while(a<=5){
//            System.out.println(a);
//            a++;
        // print number between 1 to 10
//            int b = 0;
//            while(b<11){
//                System.out.println(b);
//                b++;
//            }
        // print number from 10 to 1
        int c = 10;
        while(c>=1){
            System.out.println(c);
            c--;
        }
        System.out.println("Outside while loop");
        boolean ans = true;
        while(ans){
            if (ans){
                System.out.println("Prime");
                break;
            }
        }
    }
}
