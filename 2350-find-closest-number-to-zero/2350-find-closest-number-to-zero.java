class Solution {
    public int findClosestNumber(int[] nums) {
        
        int closenum = nums[0];
        int mindist = Math.abs(closenum);
        
        for(int i = 1; i < nums.length; i++) {
            int currdist = Math.abs(nums[i]);
            if (currdist < mindist || (currdist == mindist && nums[i] > closenum)) {
                closenum = nums[i]; 
                mindist = currdist; 
            }
        }
        return closenum;
    }
}