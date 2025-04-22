import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int arr[], int n) {
        int l = 0, r = arr.length -1;
        while (l<=r) {
            int s = l + (r-l)/2;
            if(arr[s] == n) return s;
            if(arr[s] < n){
                l = s + 1;
            } else {
                r = s - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number of elements in the array");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the elements of the array (in ascending order)");
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("enter the element to search for");
        int x = scn.nextInt();

        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(arr, x);

        if (result == -1){
            System.out.println("element not present in array");
        } else {
            System.out.println(result);
        }
    }
}
