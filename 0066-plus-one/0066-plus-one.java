class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9
            if(digits[i] < 9) {

                digits[i]++;   // increment
                return digits; // return immediately
            }

            // If digit is 9
            digits[i] = 0;
        }

        // If all digits were 9
        int[] result = new int[digits.length + 1];

        result[0] = 1;

        return result;
    }

}