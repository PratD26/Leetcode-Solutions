class Solution {
    public int maxProduct(int[] nums) {
        
        int max_prod = Integer.MIN_VALUE;
        int maxloc = 1;
        int minloc = 1;

        for (int i=0;i<nums.length;i++){
            
            int p1 = maxloc*nums[i];
            int p2 = minloc*nums[i];
            maxloc = Math.max(nums[i], Math.max(p1,p2));
            minloc = Math.min(nums[i], Math.min(p1,p2));
            max_prod = Math.max(max_prod, maxloc);

        }

        return max_prod;
    }
}