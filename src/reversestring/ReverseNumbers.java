package reversestring;

/**
 * The condition while (number != 0) is used to continue reversing the number until
 * there are no more digits left to reverse. When you reverse a number,
 * you repeatedly extract the last digit of the original number, add it to the reversed number,
 * and then remove that digit from the original number. This process continues until there are no
 * more digits left in the original number.
 * The condition number != 0 ensures that the loop keeps running as long as there are more digits to reverse
 * When all the digits have been reversed, the original number becomes 0, and the loop terminates.
 * This condition is a way to iterate through each digit of the original number from right to left.
 */
public class ReverseNumbers {
    public static void main(String[] args) {
        // define the original number to be reversed
        int num1 = 12345;
        // initialise a variable to store the reverse number
        int reverseNum2 = 0;
        // reverse using while loop
        while(num1 != 0){
            // extract the last digit of the number
            int digit = num1 % 10;
            //add digit to the reverse number after shifting digit to the left
            reverseNum2 = reverseNum2 * 10 + digit;
            // remove the last digit from the original number
            num1 = num1 /10;
        }//print both original and reverse number
        System.out.println("Original number is 12345");
        System.out.println("Reversed number: " + reverseNum2);
    }
}
