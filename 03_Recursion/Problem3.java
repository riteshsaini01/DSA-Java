import java.util.*;

public class Problem3 {

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int maxPieces(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        
        if (n < 0) {
            return -1;
        }

        int res = max(
            maxPieces(n - a, a, b, c),
            maxPieces(n - b, a, b, c),
            maxPieces(n - c, a, b, c)
        );

        if (res == -1) {
            return -1;
        }

        return res + 1;
    }

    public static void main(String[] args) {
        int n = 5; // Total length
        int a = 2; // Length of piece a
        int b = 5; // Length of piece b
        int c = 1; // Length of piece c

        System.out.println(maxPieces(n, a, b, c));
    }
}
