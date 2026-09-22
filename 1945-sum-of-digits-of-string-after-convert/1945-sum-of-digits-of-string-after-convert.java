class Solution {

    public static String transform(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum = sum + Integer.parseInt(str.charAt(i) + "");
        }

        return Integer.toString(sum);
    }

    public int getLucky(String s, int k) {

        String restr = "";

        for (int i = 0; i < s.length(); i++) {
            restr = restr + (s.charAt(i) - 96);
        }

        for (int i = 0; i < k; i++) {
            restr = transform(restr);
        }

        return Integer.parseInt(restr);
    }
}