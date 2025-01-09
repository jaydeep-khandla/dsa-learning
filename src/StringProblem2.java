public class StringProblem2 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areAnagrams(s1, s2));
    }

    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        int len = s1.length();
        int idxA = 0, idxB = 0;

        while (idxA < len && idxB < len) {
            freq[s1.charAt(idxA) - 97] += 1;
            freq[s2.charAt(idxB) - 97] -= 1;

            idxA++;
            idxB++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
