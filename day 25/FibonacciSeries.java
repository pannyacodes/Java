import java.util.Scanner;

public class FibonacciSeries {
    static int n1 = 0, n2 = 1, n3 = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of terms to print");
        int n = scn.nextInt();
        System.out.print(n1 + " " + n2);
        fibonacci(n - 2);
    }

    public static void fibonacci(int n) {
        if(n>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacci(n-1);
        }
    }
}
