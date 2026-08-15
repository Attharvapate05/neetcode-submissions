class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            HashMap<Character,Integer> mapS = new HashMap<>();
            HashMap<Character,Integer> mapT = new HashMap<>();
            for(int i = 0;i<s.length();i++){
                mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            }
             for(int j = 0;j<t.length();j++){
                mapT.put(t.charAt(j), mapT.getOrDefault(t.charAt(j), 0) + 1);
            }
            if(mapS.equals(mapT)){
                return true;
            }
            else{
            return false;
          }
        }
        else{
            return false;
        }
    }
}
