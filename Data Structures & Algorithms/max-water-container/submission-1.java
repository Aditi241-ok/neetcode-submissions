class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            // Calculate width and height
            int width = right - left;
            int h = Math.min(heights[left], heights[right]);
            
            // Update maximum area
            maxArea = Math.max(maxArea, width * h);
            
            // Move the pointer pointing to the shorter line inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}