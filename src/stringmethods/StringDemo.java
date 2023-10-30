package stringmethods;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "This is my first string";
        String s2 = "This is my second string";
        String s3 = "";
        int l = s1.length();
        System.out.println(l);
        System.out.println(s2.length());

        System.out.println(s1.contains("first"));
        System.out.println(s2.contains("second"));

        System.out.println(s2.toUpperCase());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));

        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

        System.out.println(s1.charAt(3));
        System.out.println(s1.toLowerCase());
    }
}
