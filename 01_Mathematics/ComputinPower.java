public class ComputinPower {
    
    // Naive Solution
    static int power(int x,int n)
    {
        int res=1;

        for(int i=0;i<n;i++)
        res=res*x;

        return res;                    //TC=Theta(n)
    }

    //Efficient Solution
    static int Power(int x,int n)
    {
        if(n==0)
        return 1;

        int temp=power(n,n/2);
        temp=temp*temp;

        if(n%2==0)
        return temp;
        else
        return temp*x;            //TC=>T(n)=T(floor(n/2))+Theta(1)
    }

    public static void main(String args[])
    {
        int a=15,b=6;

        System.out.println(power(a, b));

        System.out.println("....");

        System.out.println(Power(a, b));
    }
}
