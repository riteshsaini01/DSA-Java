public class MaximumDifference {
    // Naive Solution
    static int maxDiff(int arr[],int n) 
    {
        
        int res = arr[1] - arr[0];

        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                res = Math.max(res, (arr[j] - arr[i]));
            }
        }
        return res;
    }

    //Efficient solution
    static int maxDiff1(int arr[],int n)
    {
        
        int res=arr[1]-arr[0];
        int minVal=arr[0];

        for(int j=1;j<n;j++)
        {
            res=Math.max(res , (arr[j]=minVal));

            minVal=Math.min(minVal,arr[j]);
        }

        return res;
    }

    public static void main(String args[])
    {
        int n=3;
        int arr[]={30,20,10};
        
        System.out.println(maxDiff(arr,n));

        System.out.println(maxDiff1(arr, n));


    }

}
