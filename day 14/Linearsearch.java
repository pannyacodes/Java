import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int[] arr = { 10, 20, 30, 40, 50 };
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("the number is found");
                break;
            }
        }

        if (i == arr.length) {
            System.out.println("element not found");
        }
    }
}
