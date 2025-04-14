/*Brayden Hanshew
 * CS 122
 */



import java.util.Scanner;

public class PalindromeIdentifier {
    

    public static boolean isPalindrome(String s) {
       
        String cleanedString = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleanedString += Character.toLowerCase(ch);
            }
        }

        int left = 0;
        int right = cleanedString.length() - 1;
        
        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
    
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
}
