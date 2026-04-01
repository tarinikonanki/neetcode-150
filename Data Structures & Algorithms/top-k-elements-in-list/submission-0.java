class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsList = new HashMap<>();
        int[] kFrequent = new int[k];
        for(int i = 0; i < nums.length; i++){
            if(numsList.containsKey(nums[i])){
                numsList.put(nums[i], numsList.get(nums[i]) + 1);
            }
            else{
                numsList.put(nums[i],1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> numsList.get(b) - numsList.get(a));
        pq.addAll(numsList.keySet());

        for (int i = 0; i < k; i++) {
            kFrequent[i] = pq.poll();
        }
        return kFrequent;

    }
}
