class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // map: number -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // [frequency, number]
        List<int[]> res = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res.add(new int[] {
                entry.getValue(),
                entry.getKey()
            });
        }

        // Sort by frequency: highest -> lowest
        res.sort((a, b) -> b[0] - a[0]);

        // Store top k numbers
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = res.get(i)[1];
        }

        return arr;
    }
}