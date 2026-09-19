class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mapSet = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];
            if (mapSet.containsKey(diff))
                return new int[]{mapSet.get(diff), i};
            
            mapSet.put(nums[i], i);
        }
        return new int[]{0,0};
        
    }
}
