class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        int product2 = 1;
        int numZeroes = 0;
        for(int i = 0; i < nums.length; i++){
            product *= nums[i];
            if(nums[i] != 0){
                product2 *= nums[i];
            }
            else{
                numZeroes++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(numZeroes > 1){
                    output[i] = 0;
                }
                else{
                    output[i] = product2;
                }
            }
            else{
                output[i] = product / nums[i];
            }
        }
        return output;
    }
}  
