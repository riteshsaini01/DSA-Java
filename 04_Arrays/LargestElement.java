

public class LargestElement
{
    // Naive Approach
    static int getLargest(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean flag=true;
            for(int j=0;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    flag= false;
                    break;
                }
            }
            if(flag==true)
            {
                return i;
            }
        }    
        return -1;                         //-->O(n*n)
    }
    static int getLargest1(int arr[])
    {
        int res=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[res])
            res=i;
        }
        return res;

    }
    public static void main(String args[])
    {
        int []arr={5,8,20,10};
        System.out.println("Index of largest element is:"+getLargest(arr));

        System.out.println("Index of largest element is:"+getLargest1(arr));
    }
}