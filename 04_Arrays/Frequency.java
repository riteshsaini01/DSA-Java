import java.lang.reflect.Array;
import java.util.Arrays;

//Frequencies in a sorted array(How many times a number appear in a array)
public class Frequency 
{
    static void printFreq(int[] arr)
    {
        int n=arr.length;
        int freq=1,i=1;
        while(i<n)
        {
            while(i<n && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }

            System.out.println(arr[i-1]+" "+freq);
            
            i++;
            freq=1;
        }

        if(n==1||arr[n-1]!=arr[n-2])
        {
            System.out.println(arr[n-1]+" "+1);
        }
        
        
    }   
    public static void main(String args[])
    {
        int n=5;
        int arr[]={10,10,10,30,30,40};
        
        printFreq(arr);
        
    }
}
