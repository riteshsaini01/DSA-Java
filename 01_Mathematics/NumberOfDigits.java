import java.util.Scanner;

// Iterative Solution
public class NumberOfDigits
{
static int countDigit(long n)
{
    int count=0;
    while(n!=0)
    {
        n=n/10;
        ++count;
    }
    return count;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    long l;
    l=sc.nextLong();
    System.out.println(countDigit(l));
}

}
/*
// Reccursive Solution
public class NumberOfDigits
{
static int countDigit(long n)
{
   if(n==0)
   return 0;

   return 1 + countDigit(n/10);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    long l;
    l=sc.nextLong();
    System.out.println(countDigit(l));
}

}
 */


 /*
// Logarithmic Solution
public class NumberOfDigits
{
static int countDigit(long n)
{
   return floor(log(n)+1);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    long l;
    l=sc.nextLong();
    System.out.println(countDigit(l));
}

}
 */

