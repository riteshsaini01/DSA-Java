public class CountsetBits {
    
    // Naive Solution
    static int countSet(int n) {
        int res = 0;
        while (n > 0) {
            if (n % 2 != 0)
                res++;
            n = n / 2;
        }
        return res;
    }

    // Brian Kernighan's Algorithm
    static int countBits(int n) {
        int res = 0;
        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }
        return res;
    }

    // Lookup Table Method for 32 bit numbers
    static int[] Table = new int[256]; // Initialize the Table array

    void initialize() {
        Table[0] = 0;
        for (int i = 1; i < 256; i++)
            Table[i] = (i & 1) + Table[i / 2];
    }

    static int count(int n) {
        int res = Table[n & 0xff];
        n = n >> 8;
        res = res + Table[n & 0xff];
        n = n >> 8;
        res = res + Table[n & 0xff];
        n = n >> 8;
        res = res + Table[n & 0xff];

        return res;
    }

    public static void main(String args[]) {
        CountsetBits counter = new CountsetBits();
        counter.initialize(); //Initialize a table

        System.out.println(countSet(7));
        System.out.println(countBits(7));
        System.out.println(count(7));
    }
}
