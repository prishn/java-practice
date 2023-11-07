package trial;

public class Programme_1 {
    public static void main(String[] args) {
        String s1 = "Asha";
        s1 = "Asha";
        String s2 = "Asha";
        System.out.println("s1 = " + s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("Asha");
        s3 = s3.intern();
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        s1 = s1 + "Kakadiya";
        System.out.println("s1 = " + s1);

    }
}
