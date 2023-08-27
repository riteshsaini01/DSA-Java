//Check if an array is sorted
public class checkSorted 
{
    // Naive solution
    static boolean isSorted(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                return false;      //--->O(n*n)
                
            }
        }
        return true;
    }
    // Efficient solution
    boolean isSorted1(int[]arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
            return false;
            }
        }
        return true;
    }



    public static void main(String args[])
    {
        int []arr={5,8,20,10};

        System.out.println(isSorted(arr));

        System.out.println(isSorted(arr));

    }
    
}
