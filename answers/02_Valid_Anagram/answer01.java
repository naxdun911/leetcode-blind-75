class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map_s = new HashMap<>();
        Map<Character, Integer> map_t = new HashMap<>();
        
        for (int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            map_s.put(letter, map_s.getOrDefault(letter, 0)+1);
        }

        for (int i=0; i<t.length(); i++){
            char letter = t.charAt(i);
            map_t.put(letter, map_t.getOrDefault(letter, 0)+1);
        }

        return map_s.equals(map_t);

    }
}
