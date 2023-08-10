// Find the only odd occurring number

public class Problem2 {
    
    // Naive Solution
    static void findOdd1(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j < n;j++)
            {
                if(arr[j]==arr[i])
                count++;
            }

            if(count % 2!=0)
            System.out.println(arr[i]);                //O[n*n]
        }
    }

    // Efficient Solution        -->O[n]
                //Auxiliary space-->O[1]
    static int findOdd2(int arr[],int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        res=res ^ arr[i];

        return res;
    }
    public static void main(String args[])
    {
        int[] arr={3,13,23,10,9};
        int a=4;

        findOdd1(arr, a);

        System.out.println(findOdd2(arr, a));

    }
}
