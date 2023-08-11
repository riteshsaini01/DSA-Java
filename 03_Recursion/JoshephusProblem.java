//Killing kth person in circle if n members

public class JoshephusProblem {
    static int jos(int n,int k)
    {
        if(n==1)
        return 0;

        return (jos(n-1,k)+k)%n;
    }
    public static void main(String args[])
    {
        int n=5;
        int k=3;

        System.out.println(jos(n, k));
    }
}
