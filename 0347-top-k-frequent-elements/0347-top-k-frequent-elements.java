
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a Min Heap based on frequency
        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>(
                    (a, b) -> Integer.compare(map.get(a), map.get(b))
                );

        // Step 3: Keep only the k most frequent elements
        for (int num : map.keySet()) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Store the result
        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll();
        }

        return res;
    }
}

// import java.util.*;

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         // Step 1: Count frequency
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         // Step 2: Create buckets based on frequency
//         List<Integer>[] bucket = new List[nums.length + 1];

//         for (int num : map.keySet()) {
//             int freq = map.get(num);

//             if (bucket[freq] == null) {
//                 bucket[freq] = new ArrayList<>();
//             }

//             bucket[freq].add(num);
//         }

//         // Step 3: Collect k most frequent elements
//         int[] res = new int[k];
//         int index = 0;

//         for (int freq = bucket.length - 1; freq >= 1; freq--) {
//             if (bucket[freq] != null) {
//                 for (int num : bucket[freq]) {
//                     res[index++] = num;

//                     if (index == k) {
//                         return res;
//                     }
//                 }
//             }
//         }

//         return res;
//     }
// }














// // import java.util.*;

// // class Solution {
// //     public int[] topKFrequent(int[] nums, int k) {

// //         HashMap<Integer, Integer> map = new HashMap<>();

// //         // Count frequency
// //         for (int num : nums) {
// //             map.put(num, map.getOrDefault(num, 0) + 1);
// //         }

// //         // Sort numbers by frequency (highest first)
// //         List<Integer> list = new ArrayList<>(map.keySet());

// //         list.sort((a, b) -> map.get(b) - map.get(a));

// //         // Take first k elements
// //         int[] res = new int[k];

// //         for (int i = 0; i < k; i++) {
// //             res[i] = list.get(i);
// //         }

// //         return res;
// //     }
// // }
