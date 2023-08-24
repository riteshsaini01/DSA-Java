public class Reverse {
    static void reverse(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String args[]) {
        int[] arr = {5, 8, 20, 10};
        int n = 4;
        
        // Call the reverse method to reverse the array
        reverse(arr, n);
        
        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
