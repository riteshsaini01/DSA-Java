//Find Two Odd Appearing Number

public class Problem3 {

    // Naive Solution  --->Theta(n*n)
    static void oddAppearing1(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
            if(arr[i]==arr[j])
            count++;
            if(count%2!=0)
            System.out.println(arr[i]);
            }
        }
    }

    // Efficient      --->Theta(n)
    static void oddAppearing2(int arr[],int n)
    {
        int xor=0,res1=0,res2=0;
        for(int i=0;i<n;i++)
        {
            xor=xor ^ arr[i];
        }
        n=xor & ~(xor-1);


        for(int i=0;i<n;i++)
        {
            if((arr[i] & n)!=0)
            res1=res1 ^ arr[i];

            else
            res2=res2 ^ arr[i];
        }

        System.out.println(res1);

        System.out.println("....");

        System.out.println(res2);
    }

    public static void main(String args[])
    {
        int a=5;
        int arr[]={2,23,45,11,9};

        oddAppearing1(arr, a);

        oddAppearing2(arr, a);
    }
    
}
