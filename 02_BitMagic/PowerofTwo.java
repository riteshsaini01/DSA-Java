public class PowerofTwo {
    
    // Method 1
    static boolean isPow1(int n)
    {
        if(n==0)
        return false;

        while(n!=1)
        {
            if(n%2!=0)
            return false;
            n=n/10;
        }
        return true;
    }

    // Method 2 (Efficient)
    static boolean isPow2(int n)
    {
        if (n==0)
        return false;

        return((n & (n-1))==0);
    }

    public static void main(String args[])
    {
        int a=7;

        System.out.println(isPow1(a));

        System.out.println(isPow2(a));
    }
}
