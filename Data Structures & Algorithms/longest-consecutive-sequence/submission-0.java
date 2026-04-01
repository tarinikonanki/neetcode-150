class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        HashSet<Integer> seq = new HashSet<>();
        int seqLength = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) continue;
            if(nums[i] - 1 == nums[i - 1]){
                seqLength++;
            }
            else{
                seq.add(seqLength);
                seqLength = 1;
            }
        }
        seq.add(seqLength);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.addAll(seq);
        return pq.poll();
    }
}
