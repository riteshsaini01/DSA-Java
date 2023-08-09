
public class TrailingZeroesinFactorial {
    static int countZeroes(int n)
    {
        int fact=1;

        for(int i=2;i<=n;i++)
        fact=fact*i;

        int res=0;
        while(fact%10==0)
        {
            res++;
            fact=fact/10;
        }
        return res;
    }

    // Effective Method
    static int countTrailingZeroes(int n)
    {
        int res=0;
        for(int i=5;i<=n;i=i*5)
        res=res+(n/i);

        return res;                          //Theta(log n)
    }
    public static void main(String args[])
    {
        int a=5;
        System.out.println(countZeroes(a));

        System.out.println(countTrailingZeroes(a));
    }
}
