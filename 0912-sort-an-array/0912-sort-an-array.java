class Solution {
    public int[] sortArray(int[] nums) {

        int n = nums.length;
        //bubble sort
        // for(int i= 0;i<n-1;i++){
        //     for(int j =0;j<n-i-1;j++){
        //         if(nums[j]>nums[j+1] ){
        //             int temp = nums[j];
        //             nums[j]= nums[j+1];
        //             nums[j+1]= temp;
        //         }
        //     }
        // }

        //selection sort o(nlogn)
        // for(int i=0;i<n-1;i++){
        //     int minPos= i;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[j] < nums[minPos]){
        //             minPos= j;
        //         }
        //     }
        //     int temp = nums[i];
        //     nums[i]= nums[minPos];
        //     nums[minPos] = temp;
        // }

        //insertion sort
        // for (int i = 1; i < n; i++) {
        //     int curr = nums[i];
        //     int prev = i - 1;
        //     while (prev >= 0 && nums[prev] > curr) {
        //         nums[prev + 1] = nums[prev];
        //         prev--;
        //     }
        //     nums[prev + 1] = curr;
        // }

        // counting sort

        // int largest = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        //     largest = Math.max(nums[i], largest);
        // }
        // int[] count = new int[largest + 1];
        // for (int i = 0; i < n; i++) {
        //     count[nums[i]]++;
        // }
        // int j = 0;
        // for (int i = 0; i < count.length; i++) {
        //     while (count[i] > 0) {
        //         nums[j] = i;
        //         j++;
        //         count[i]--;

        //     }
        // }

        //for negative number
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Count array size
        int[] count = new int[max - min + 1];

        // Store frequencies
        for (int i = 0; i < n; i++) {
            count[nums[i] - min]++;
        }

        // Rebuild sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[index++] = i + min;
                count[i]--;
            }
        }

        return nums;
    }
}