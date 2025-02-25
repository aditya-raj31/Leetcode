class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // Prefix sum of 0 is even
        int prefixSum = 0;
        int result = 0;

        for (int num : arr) {
            prefixSum += num;
            if (prefixSum % 2 == 1) {
                // If prefixSum is odd, count the number of even prefix sums
                result = (result + prefixCount.getOrDefault(0, 0)) % MOD;
            } else {
                // If prefixSum is even, count the number of odd prefix sums
                result = (result + prefixCount.getOrDefault(1, 0)) % MOD;
            }
            // Update the frequency of the current prefixSum (odd or even)
            prefixCount.put(prefixSum % 2, prefixCount.getOrDefault(prefixSum % 2, 0) + 1);
        }

        return result;
    }
}