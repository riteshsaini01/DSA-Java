
public class Factorial {

    // Iterative
    static int fact(int n)
    {
        int res=1;
        for(int i=2;i<=n;i++)
        res=res*i;
        return res;                    //Time complexity=Theta(n)
    }
    // Reccursive
    static int fact1(int n)
    {
        if(n==0)
        return 1;

        return n*fact1(n-1);
    }
    public static void main(String args[])
    {
        int a=21;
        System.out.println(fact(a));

        System.out.println(fact1(a));
    }
    
}
