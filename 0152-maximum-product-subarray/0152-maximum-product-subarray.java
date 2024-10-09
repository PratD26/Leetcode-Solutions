class Solution {
    public int maxProduct(int[] nums) {
        
        int max_prod = Integer.MIN_VALUE;
        int prod = 1;

        for (int i=0;i<nums.length;i++){
            
            max_prod = Math.max(prod *= nums[i], max_prod);
            if (nums[i] == 0) prod = 1;

        }

        prod = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            max_prod = Math.max(prod *= nums[i], max_prod);
            if (nums[i] == 0) prod = 1;
        }

        return max_prod;
    }
}