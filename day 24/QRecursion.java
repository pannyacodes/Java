import java.util.Scanner;

public class QRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();
        printdes(n);
    }

    public static void printdes(int n){
        if(n==0) return;
        System.out.println(n);
        printdes(n-1);
    }
}
