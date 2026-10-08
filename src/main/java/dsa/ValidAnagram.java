package dsa;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        int[] count = new int[26];

        if (s.length() != t.length()) {
            System.out.println("Not an anagram");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                System.out.println("Not an anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
