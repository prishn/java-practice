package reversestring;

public class ReverseStringAndNumbers {
    public static void main(String[] args) {
        // reverse string
        String name = "Gopal Krishna";
        String name1 = "";
        for(int i = name.length()-1; i >= 0; i--){
            name1 = name1 + name.charAt(i);
        }
        System.out.println(name1);
        // reverse the numbers
        int a = 123456789;
        int b = 0;
        while( a != 0){
            int c = a % 10;
            b = b * 10 + c;
            a = a/10;
        }
        System.out.println("Original number is: 123456789");
        System.out.println("Reverse number is: " + b);
    }
}
