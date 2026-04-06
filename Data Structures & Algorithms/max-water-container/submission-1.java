class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int pointer1 = 0;
        int pointer2 = heights.length - 1;
        while(pointer1 < pointer2){
            int newArea = (pointer2 - pointer1) * Math.min(heights[pointer1],heights[pointer2]);
            if(newArea > area){
                area = newArea;
            }
            if(heights[pointer1] > heights[pointer2]){
                pointer2--;
            }
            else{
                pointer1++;
            }
        }
        return area;
    }
}
