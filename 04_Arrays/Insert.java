public class Insert {
    static int[] Insert(int arr[], int n, int x, int cap, int pos) //--->Cap=capacity
    {
        if (n == cap)
            return arr; // Return the original array unchanged

        int[] newArr = new int[cap]; // Create a new array to hold the modified elements
        int idx = pos - 1;

        for (int i = 0; i < idx; i++) {
            newArr[i] = arr[i];
        }

        newArr[idx] = x;

        for (int i = idx; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 10, 20 };
        int n = 3; // Corrected the initial size
        int x = 7; // No. to be inserted

        int cap = 4;
        int pos = 2;

        int[] result = Insert(arr, n, x, cap, pos);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
