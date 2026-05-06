class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) { //if the left character is not a charcter then shift the left +1
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;

    }
}