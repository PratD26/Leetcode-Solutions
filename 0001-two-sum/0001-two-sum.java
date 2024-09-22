class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result[] = new int[2];
        Map<Integer, Integer> resMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            
            int j = target - nums[i];
            if(resMap.containsKey(j)){
                result[0] = i;
                result[1] = resMap.get(j);
            }
            resMap.put(nums[i],i);
        }
        return result;
    }
}