public class Subsets {

    static void subsets(String s, String curr, int i) {
        if (i == s.length()) {
            System.out.println(curr);  // Print the current subset
            return;
        }
        subsets(s, curr, i + 1);  // Exclude current character
        subsets(s, curr + s.charAt(i), i + 1);  // Include current character
    }

    public static void main(String[] args) {
        String input = "abc";
        subsets(input, "", 0);
    }
}
