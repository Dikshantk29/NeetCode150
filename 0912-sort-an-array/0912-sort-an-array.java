
class Solution {
    public int[] sortArray(int[] nums) {
        int si = 0;
        int ei = nums.length - 1;

        mergeSort(nums, si, ei);
        return nums;
    }

    static void mergeSort(int[] nums, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(nums, si, mid);
        mergeSort(nums, mid + 1, ei);

        merge(nums, si, mid, ei);
    }

    static void merge(int[] nums, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[si + x] = temp[x];
        }
    }
}


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

        // //for negative number
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // // Find min and max
        // for (int i = 0; i < n; i++) {
        //     min = Math.min(min, nums[i]);
        //     max = Math.max(max, nums[i]);
        // }

        // // Count array size
        // int[] count = new int[max - min + 1];

        // // Store frequencies
        // for (int i = 0; i < n; i++) {
        //     count[nums[i] - min]++;
        // }

        // // Rebuild sorted array
        // int index = 0;
        // for (int i = 0; i < count.length; i++) {
        //     while (count[i] > 0) {
        //         nums[index++] = i + min;
        //         count[i]--;
        //     }
        // }

        // return nums;