import java.util.Scanner;

public class MainClass {

    private static String original;
    private static Scanner scanner;
    private static int length;

    public static void main (String[] strings){

        scanner = new Scanner(System.in);

        System.out.println("Enter a string or a number to check if the it's a palindrome: ");

        original = scanner.nextLine();

        length = original.length();

        if (isPalindrome(original)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static boolean isPalindrome(String value) {
        int n = value.length();
        for (int i = 0; i < (n/2); ++i) {
            if (value.charAt(i) != value.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
