// Subset sum problem

public class Problem4 {
    static int countSubsets(int arr[],int x,int sum)
    {
        if(x==0)
        return(sum==0)? 1:0;

        return countSubsets(arr,x-1,sum)+countSubsets(arr,x-1,sum-arr[x-1]);
    } 
    
    public static void main(String args[])
    {
        int[] arr={10,5,2,3,6};
        int x=5;
        int sum=8;

        System.out.println(countSubsets(arr, x, sum));
    }

}
