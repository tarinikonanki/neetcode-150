class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numList = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(numList.contains(nums[i])){
                return true;
            }
            numList.add(nums[i]);
        }
        return false;
    }
}