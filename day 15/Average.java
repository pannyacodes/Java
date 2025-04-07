
public class Average {
    public static void main(String[] args) {
        int[] arr = { 20, 23, 17, 29 };
        int i;
        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = sum / (float) arr.length; // casting
        System.out.println("the average is " + avg);
    }
}
