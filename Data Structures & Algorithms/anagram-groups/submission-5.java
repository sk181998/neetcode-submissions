class Solution {
    private boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (visited[i])
                continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;
            for (int j = i + 1; j < strs.length; j++) {

                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(group);
        }
        return ans;
    }
}
