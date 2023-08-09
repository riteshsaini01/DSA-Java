public class LCM {
    static int lcm(int a,int b)
    {
        int res=Math.max(a,b);
        
        while(true)
        {
            if(res%a==0 && res%b==0)
            return res;

            res++;
        }
        //return res;            //O(a*b-max(a,b))
        
    }

    // Efficient solution
    static int gcd(int a,int b)
    {
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
    static int lcm1(int a,int b)
    {
        return (a*b)/gcd(a,b);

    }

    public static void main(String args[])
    {
        int a=20,b=25;

        System.out.println(lcm(a,b));

        System.out.println(lcm1(a,b));
    }
}