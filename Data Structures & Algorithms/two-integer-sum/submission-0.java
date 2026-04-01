class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numList = new HashMap<>();
        int[] newArr = new int[2];
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numList.containsKey(complement)){
                newArr[0] = Math.min(numList.get(complement),i);
                newArr[1] = Math.max(numList.get(complement),i);
            }
            numList.put(nums[i],i);
        }
        return newArr;
    }
}
