
public class Highestnumber {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 2, 67, 39, 34, 190 };
        int i, max, min;
        max = arr[0];
        min = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("highest number: " + max);
        System.out.println("lowest number: " + min);
    }
}
