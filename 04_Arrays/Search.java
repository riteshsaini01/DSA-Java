public class Search {
    static int Search(int arr[],int n,int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={20,4,32,12,31,23,45,65};
        int n=8;

        int x=12;
        System.out.println(Search(arr, n, x));
    }
}
