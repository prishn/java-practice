package arrays;

public class StringArrayLength {
    public static void main(String[] args) {
        // Create an array of strings
        String[] stringArray = {"Hello", "World", "Java", "Programming"};

        // Specify the index of the element you want to find the length of
        int index = 2; // Change this to the index of the element you want to check

        // Check if the index is within bounds
        if (index >= 0 && index < stringArray.length) {
            // Use the length() method to find the length of the string at the specified index
            int length = stringArray[index].length();
            System.out.println("Length of the string at index " + index + " is: " + length);
        } else {
            System.out.println("Invalid index. Please choose a valid index within the array bounds.");
        }
    }
}