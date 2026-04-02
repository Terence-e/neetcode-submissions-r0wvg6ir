
public class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(String.format("%03d", s.length()));
            res.append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int len = Integer.parseInt(str.substring(i, i + 3));
            i += 3;

            res.add(str.substring(i, i + len));
            i += len;
        }

        return res;
    }
}