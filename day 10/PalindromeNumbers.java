import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int temp = n;
        int newNumber = 0;
        while (temp > 0) {
            int digit = temp % 10;
            newNumber = newNumber * 10 + digit;
            temp = temp / 10;
        }

        if (newNumber == n) {
            System.out.println("the number is a palindrome");
        } else {
            System.out.println("the number is not a palindrome");
        }
    }
}
