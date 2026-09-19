class Solution {
    public boolean hasDuplicate(int[] nums) {

        // Set<Integer> set = new HashSet<>();
        // for(int number : nums) {
        //     if(!set.add(number))
        //     return true;
        // }
        // return false;
         Hashtable<Integer,Integer> ht= new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(ht.containsKey(nums[i])==false){
                ht.put(nums[i],1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}