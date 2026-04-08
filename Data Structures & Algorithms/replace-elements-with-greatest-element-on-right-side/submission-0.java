class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                arr[i] = -1;
            }else{
                int[] c = Arrays.copyOfRange(arr,i+1,arr.length);
                Arrays.sort(c);
                arr[i] = c[c.length-1]  ;              
            }

        }
        return arr;
    }
}