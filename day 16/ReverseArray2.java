
public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int i =0;
        int j = arr.length - 1 ;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
