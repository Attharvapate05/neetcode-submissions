class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] temp = new int[nums.length * 2];
        int n = nums.length * 2;

        for (int i = 0; i < n; i++) {
            temp[i] = nums[i % nums.length];
        }

        return temp;
    }
}
