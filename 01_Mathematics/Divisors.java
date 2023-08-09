//All Divisors of Number

public class Divisors {
    
    // Naive Solution
    static void printDivisors(int n)
    {
        for(int i=1;i<=n;i++)
        if(n%i==0)
        System.out.println(i);              //Theta(n)
    }                                       //Theta(1)--Auxiliary space

    // Efficient Solution
    static void printDivisors1(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                if(i!=n/i)
                System.out.println(n/i);
            }
        }
    }

    // More Efficient Solution
    static void printDivisors2(int n)
    {
        int i;
        for(i=1;i*i<n;i++)
        if(n%i==0)
        System.out.println(i);

        for( ;i>=1;i--)
        if(n%i==0)
        System.out.println(n/i);    //Theta(root n)
     }                              //Theta(1)--Auxiliary space

     public static void main(String args[])
     {
        int a=20;
        
        printDivisors(a);
        System.out.println("...");
        printDivisors1(a);
        System.out.println("...");
        printDivisors2(a);
     }

}
