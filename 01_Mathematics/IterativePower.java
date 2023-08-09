public class IterativePower 
{
    static int power(int x,int n)
    {
        int res=1;
        while(n>0)
        {
            if(n%2!=0)
            res=res*x;
            
            x=x*x;
            n=n/2;
            
        }
        return res;       //TC=O(Log n)
    }                     //Auxiliary space=O(1)
    public static void main(String args[])
    {
        int a=12,b=4;

        System.out.println(power(a, b));
    }
}
