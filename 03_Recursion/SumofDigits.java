public class SumofDigits {

    static int getSum(int n)
    {
        if(n==0)
        return 0;

        else
        return getSum(n/10)+(n%10);

    }

    public static void main(String args[])
    {
        int a=12343;

        System.out.println(getSum(a));
    }
}
