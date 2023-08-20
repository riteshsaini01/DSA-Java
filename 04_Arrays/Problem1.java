public class Problem1
{
     static int minJumps(int arr[] ,int n)
    {
        n = arr.length;
        if (n<= 1) { return 0; }

    
    int count = 1;  
    int max = arr[0]; 
    int step = arr[0]; 

    for (int i = 1; i < n; i++) {
    if (i > max) {
        return -1;  
    }
    
    if (i == n - 1) {
        return count;  
    }
    
    max = Math.max(max, i + arr[i]); 
    
    step--;  
    
    if (step == 0) {
        count++;
        step = max - i;
    }
}

return -1;  
} 
public static void main(String args[])
    {
        int a=6;
        int arr[]={1, 4, 3, 2, 6, 7};

        System.out.println(minJumps(arr, a));
    }
}


