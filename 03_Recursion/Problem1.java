//Print n to 1
class Problem1
{
    static void print(int n)
    {
        if(n==0)
        return;
        System.out.println(n+" ");
        print(n-1);
    }

    public static void main(String args[])
    {
        int n=4;
        print(n);        //-->T(n)=T(n-1)+Theta(1)
    }
}