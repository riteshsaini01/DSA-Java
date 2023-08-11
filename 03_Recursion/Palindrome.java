public class Palindrome {

    static boolean isPalindrome(String str,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }

        return(str.charAt(start)==str.charAt(end) && isPalindrome(str,start+1,end-1));
    }

    public static void main(String args[])           //-->T(n)=T(n-2)+Theta(1)
    {                                               //-->O(n)
              String s="12213"  ;                     //-->Auxiliary Space->O(n)
              int start=0;
              int end=s.length()-1;

              System.out.println(isPalindrome(s, start, end));
    }

    
}
