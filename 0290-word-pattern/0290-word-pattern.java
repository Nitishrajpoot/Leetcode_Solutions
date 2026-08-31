class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] letter=s.split(" ");
        if(pattern.length()!=letter.length)  return false;
        HashMap<Character,String>map1=new HashMap<>();
        HashMap<String,Character>map2=new HashMap<>();
        
        int i=0;
         for(String st: letter){
          char ch=pattern.charAt(i);
           if(map1.containsKey(ch)&& !map1.get(ch).equals(st)){
            return false;
           }
           if(map2.containsKey(st)&&map2.get(st)!=ch){
            return false;
           }
           map1.put(ch,st);
           map2.put(st,ch);
           i++;
         }
         return true;
    }
}