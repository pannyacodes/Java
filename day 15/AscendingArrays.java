
public class AscendingArrays {
    public static void main(String[] args) {
        int[] arr = { 17, 58, 72, 73 };
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                continue;
            } else {
                System.out.println("the array is not ascending");
                break;
            }
        }
        if (i == arr.length) {
            System.out.println("the array is ascending");
        }
    }
}
