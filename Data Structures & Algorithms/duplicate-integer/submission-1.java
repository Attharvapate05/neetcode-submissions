class Solution {
    public boolean hasDuplicate(int[] nums) {
        int j = 0;
        int n = nums.length; 
        for(int i = 0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}