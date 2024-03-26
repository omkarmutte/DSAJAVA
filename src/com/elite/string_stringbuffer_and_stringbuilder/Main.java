public class Main {

    static void permute(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf); // Print the permutation
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            // Swap characters
            char ch = str.charAt(i);
            String lp = str.substring(0, i);
            String rp = str.substring(i + 1);
            String ros = lp + rp;
            permute(ros, asf + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, "");
    }
}
