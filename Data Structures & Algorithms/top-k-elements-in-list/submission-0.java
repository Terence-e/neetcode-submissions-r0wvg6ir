

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> t = new HashMap<>();
        HashMap<Integer, List<Integer>> ts = new HashMap<>();
        List<Integer> p = new ArrayList<>();
        int[] ht = new int[k];
        int lht = 0;

        // number -> frequency
        for (int i = 0; i < nums.length; i++) {
            if (t.get(nums[i]) == null) {
                t.put(nums[i], 1);
                p.add(nums[i]);
            } else {
                int oldCount = t.get(nums[i]);
                t.put(nums[i], oldCount + 1);
            }
        }

        // frequency -> list of numbers
        for (int j : p) {
            int freq = t.get(j);
            if (ts.get(freq) == null) {
                List<Integer> ps = new ArrayList<>();
                ps.add(j);
                ts.put(freq, ps);
            } else {
                List<Integer> ps = ts.get(freq);
                ps.add(j);
            }
        }

        // collect from highest frequency to lowest
        for (int q = nums.length; q >= 1; q--) {
            List<Integer> hs = ts.get(q);
            if (hs != null) {
                for (int num : hs) {
                    ht[lht] = num;
                    lht++;
                    if (lht == k) {
                        return ht;
                    }
                }
            }
        }

        return ht;
    }
}