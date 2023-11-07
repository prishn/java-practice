package reversestring;
public class ReverseString {
    public static void main(String[] args) {
        // Input string to be reserved
        String input = "Asha Kakadiya";
        // initialising an empty string to store the reverse string
        String output = "";
        //loop through the character of the input string in the reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            // appends the character at the current index to the output string
            output = output + input.charAt(i);
        }
        // print the reversed string
        System.out.println(output);

        String str1 = "Good Evening";
        String str2 = "";
        for (int j = str1.length() -1; j >= 0; j--){
            str2 = str2 + str1.charAt(j);
        }
        System.out.println(str2);
    }
}
