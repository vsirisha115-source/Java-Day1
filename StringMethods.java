
import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        
        // Corrected spelling: nextInt()
        // System.out.println("Enter a number index:");
        // int a = sc.nextInt(); 

        System.out.println("Concatenation: " + str.concat(" Manasa"));
        System.out.println("Contains 'Manasa': " + str.contains("Manasa"));
        System.out.println("To Uppercase: " + str.toUpperCase());
        System.out.println("To Lowercase: " + str.toLowerCase());
        
        // Corrected spelling: indexOf()
        System.out.println("Index of 'M': " + str.indexOf('M'));
        
        // Added a check to prevent error if string is too short
        if (str.length() > 5) {
            System.out.println("Char At index 5: " + str.charAt(5));
            // Corrected: substring requires an index
            System.out.println("Sub String (from index 2): " + str.substring(2)); 
        }
        
        System.out.println("Trim: " + str.trim());
        System.out.println("Replace 'j' with 'p': " + str.replace('j', 'p'));
        System.out.println("Length of the String: " + str.length());
        System.out.println("Is Empty: " + str.isEmpty());
        
        sc.close(); // Good practice to close the scanner
    }
}