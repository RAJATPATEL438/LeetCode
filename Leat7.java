// Reverse Integer

class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            reversed = reversed * 10 + pop;
        }
        return reversed;
    } 
}
public static void main(String[] args) {
        Solution sol = new Solution();xzczxc
        
        int x1 = 123;
        int result1 = sol.reverse(x1);
        System.out.println("Input: " + x1 + " Output: " + result1); // Output: 321

        int x2 = -123;
        int result2 = sol.reverse(x2);
        System.out.println("Input: " + x2 + " Output: " + result2); // Output: -321

        int x3 = 120;
        int result3 = sol.reverse(x3);
        System.out.println("Input: " + x3 + " Output: " + result3); // Output: 21
}
