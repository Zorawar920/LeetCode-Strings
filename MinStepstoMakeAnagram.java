class Solution {
    public int minSteps(String s, String t) {
     int[] letters = new int[26];
     int minSteps=0;
     char[] first_s= s.toCharArray();
     char[] second_t=t.toCharArray();
      
     for(char ch: first_s){
         letters[ch-'a']++;
     }
     
     for(char ch: second_t){
         letters[ch-'a']--;
         if(letters[ch-'a'] < 0){
             minSteps++;
         }
     }
        return minSteps;
        
    }
}
