import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number of elements in the array");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the " + n + " elements of the array");

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx){
        if (idx == arr.length) return;
        System.out.print(arr[idx]);

        displayArr(arr, idx + 1);
    }
}
