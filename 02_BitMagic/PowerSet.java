public class PowerSet {

    // Theta(2n*n)
    static void printpowerSet(String str)
    {
        int n=str.length();
        int powsize=(int)Math.pow(2,n);

        for(int counter=0;counter<powsize;counter++)
        {
        for(int j=0;j<n;j++)
        {
            if((counter & (1<<j))!=0 )
            {
            System.out.print(str.charAt(j));
            }
        }
        System.out.print("\n");
        }
    }

    public static void main(String args[])
    {
        String s="Ritesh";

        printpowerSet(s);
    }
}
