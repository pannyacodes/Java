import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int newNumber = 0;
        while (n>0){
            int digit = n%10;
            newNumber = newNumber * 10 + digit;
            n=n/10;
        }
        System.out.println(newNumber);
    }
}
