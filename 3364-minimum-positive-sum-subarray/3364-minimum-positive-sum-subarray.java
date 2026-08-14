class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {
            int windowSum = 0;

            // first window
            for (int i = 0; i < k; i++) {
                windowSum += nums.get(i);
            }

            if (windowSum > 0) {
                ans = Math.min(ans, windowSum);
            }

            // slide the window
            for (int j = k; j < nums.size(); j++) {
                windowSum += nums.get(j);
                windowSum -= nums.get(j - k);

                if (windowSum > 0) {
                    ans = Math.min(ans, windowSum);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}