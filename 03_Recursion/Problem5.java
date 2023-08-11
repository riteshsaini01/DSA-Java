public class Problem5 {

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void permute(char[] s, int i) {
        if (i == s.length - 1) {
            System.out.println(new String(s));
            return;
        }
        for (int j = i; j < s.length; j++) {
            swap(s, i, j);
            permute(s, i + 1);
            swap(s, i, j); // Backtrack to restore the original order
        }
    }

    public static void main(String args[]) {
        String input = "abc";
        permute(input.toCharArray(), 0);
    }
}
