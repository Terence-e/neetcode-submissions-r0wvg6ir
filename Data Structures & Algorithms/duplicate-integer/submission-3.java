class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i : nums){
            int n = 0;
            for(int j : nums){
                if (i == j ) {
                    n++;
                    if (n==2)return true;
                }
            }
        }
      return false;}
    }