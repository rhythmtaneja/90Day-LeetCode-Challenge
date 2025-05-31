class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            area = width * minHeight;
            if (maxArea < area){
            maxArea = area;
        }
         if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
    
        return maxArea;

    }
}
