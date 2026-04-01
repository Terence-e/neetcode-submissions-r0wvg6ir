class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> mk = new HashMap<String, List<String>>();
      List<String> key = new ArrayList<>();
      
      List<List<String>> p = new ArrayList<>();
      for(int i=0 ; i < strs.length ; i++){
        char[] s =strs[i].toCharArray();
        Arrays.sort(s);
        String k = new String(s);
        if (mk.get(k) == null){
            List<String> ar = new ArrayList<>();
            ar.add(strs[i]);
            mk.put(k,ar);
            key.add(k);
            
            }else{
                List<String> ar = mk.get(k);
                ar.add(strs[i]);

         }

      }
      for(String st : key){
        p.add(mk.get(st));
      }
      return p;
    }
}
