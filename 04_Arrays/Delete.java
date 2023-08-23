public class Delete {
     static int Delete(int arr[],int n,int x)
    {
        int i;
        for( i=0;i<x;i++)
        {
            if (arr[i]==x)
            break;
        }
        if(i==n)
        return n;

        for(int j=i;j<n-1;j++)
        {
        arr[j]=arr[j+1];
        }
        return (n-1);

        
    }
    public static void main(String args[])
    {
        int arr[]={1,23,43,12,10,8};
        int n=6;

        int x=43;
        System.out.println(Delete(arr, n, x));
    }
    
}
/*
 * public class Delete {
    static int[] Delete(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }

        if (i == n) {
            return arr; // Element not found, return the original array unchanged
        }

        int[] newArr = new int[n - 1]; // Create a new array to hold the modified elements

        for (int j = 0, k = 0; j < n; j++) {
            if (j != i) {
                newArr[k++] = arr[j];
            }
        }

        return newArr;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 23, 43, 12, 10, 8 };
        int n = 6;
        int x = 43;

        int[] result = Delete(arr, n, x);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

 */
