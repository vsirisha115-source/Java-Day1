import java.util.Scanner;

public class Method {
    public boolean isPalindrome(int num) {
        if (num < 0) return false; 

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num value: ");
        int num = sc.nextInt();

        Method ob = new Method();
        boolean result = ob.isPalindrome(num);

        if (result) {
            System.out.println("True - It is a palindrome");
        } else {
            System.out.println("False - Not a palindrome");
        }
    }
}