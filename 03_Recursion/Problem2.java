// Print 1 to  n

public class Problem2 {
    static void print(int n)
    {
        if(n==0)
        return;
        print(n-1);
        System.out.println(n+" ");

    }   
    public static void main(String args[])       //-->T(n)=T(n-1)+Theta(1)
    {                                            //-->Theta(n)
        int n=4;                                 //-->Aux space=O(n)
        print(n);
    }
}
