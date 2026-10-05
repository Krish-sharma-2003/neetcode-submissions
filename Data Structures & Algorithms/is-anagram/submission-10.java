class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap <Character,Integer> map  = new HashMap<>();
      HashMap <Character,Integer> val = new HashMap<>();

         if (s.length() != t.length()){
            return false;
         }
         for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            val.put(t.charAt(i), val.getOrDefault(t.charAt(i), 0) + 1);

         }
         return map.equals(val);

}
}
