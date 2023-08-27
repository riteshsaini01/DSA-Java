//Remove duplicates from a sorted array
public class Remove {
    static int remDups(int arr[], int n) {
        if (n == 0) {
            return 0; // No elements in the array
        }

        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;
        
        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }
        
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }
        
        return res;
    }

    public static void main(String args[]) {
        int n = 6;
        int arr[] = { 5, 12, 22, 22, 32, 45 }; // Sorted array

        int newSize = remDups(arr, n);

        System.out.println("New size of array after removing duplicates: " + newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
