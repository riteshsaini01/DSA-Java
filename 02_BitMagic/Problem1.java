// Check if Kth bit is set(1)

public class Problem1 {
    
    // Method 1
    static void kthbit1(int n, int k) 
    {
        if ((n & (1 << (k - 1))) != 0) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
    
    // Method 2
    static void kthbit2(int n, int k)
    {
        if(((n >> (k - 1)) & 1)==1)
        System.out.println("yes");

        else
        System.out.println("No");
    }

    public static void main(String args[])
    {
        int a=5,b=3;

        kthbit1(a, b);

        kthbit2(a, b);
    }
}
