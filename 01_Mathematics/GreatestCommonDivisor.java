/*
// Naive Solution
public class GreatestCommonDivisor
{
 static int gcd(int a,int b)
{
    int res=Math.min(a,b);
    while(res>0)
    {
        if(a%res==0 && b%res==0)
        {
            break;
        }
        res--;
    }
    return res;                               // Time Complexity=O(min(a,b))
}

}
*/

// Euclidean Algorithm---- let 'b' be smaller than 'a'
//                         gcd(a,b)=gcd(a-b,b)

public class GreatestCommonDivisor
{
 static int gcd(int a,int b)
{
    while(a!=b)
    {
        if(a>b)
          a=a-b;
        else
          b=b-a;
    }
    return a;                               
}
public static void main(String args[])
{
    int m=23,n=32;

    System.out.println(gcd(m,n));

}
}
