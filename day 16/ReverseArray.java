
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] brr = new int[arr.length];
        int j = 0;
        for(int i=arr.length - 1; i>=0; i--, j++){
            brr[j] = arr[i];
        }
        for(int i=0; i< arr.length; i++){
            System.out.println(brr[i]); 
        }
    }
}
