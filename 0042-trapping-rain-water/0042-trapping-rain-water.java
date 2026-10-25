
class Solution {
    public int trap(int[] height) {

        int h = height.length;

        int[] leftMax = new int[h];
        leftMax[0] = height[0];

        for (int i = 1; i < h; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int[] rightMax = new int[h];
        rightMax[h - 1] = height[h - 1];

        for (int i = h - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        for (int i = 0; i < h; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]) - height[i];
            trappedWater += waterLevel;
        }

        return trappedWater;
    }
}
