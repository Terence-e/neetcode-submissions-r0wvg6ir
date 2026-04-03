class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
           
            
               
                if(nums[i]== 1){
                    j = j + 1;
                }else {
                    j =0;
                }
                
            
            if (j>n){
                    n = j;
                }


        }
        return n;
    }
}