class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'L': balance++; break;
                case 'R': balance--; break;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}