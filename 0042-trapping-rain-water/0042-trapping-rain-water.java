class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftMB = new int[n];
        leftMB[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMB[i] = Math.max(leftMB[i - 1], height[i]);
        }

        int[] rightMB = new int[n];
        rightMB[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMB[i] = Math.max(rightMB[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMB[i], rightMB[i]);
            trappedWater += (waterLevel - height[i]);
        }

        return trappedWater;
    }
}