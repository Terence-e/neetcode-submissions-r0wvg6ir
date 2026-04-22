class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        int[] r = new int[1000];
        int o = 0;
        for(int i = 0; i < operations.length;i++){
            if (operations[i].equals("C")){
                score = score - r[o-1];
                o--;
            }else if(operations[i].equals("D")){
                r[o] = r[o-1]*2;
                score = score + r[o];
                o++;
            }else if(operations[i].equals("+") ){
                r[o]= (r[o-1])+ (r[o-2]);
                score = score + r[o];
                o++;
            }else{
                r[o] = Integer.parseInt(operations[i]);
                score = score + r[o];
                o++;
            }
            
        }
        return score;
    }
}