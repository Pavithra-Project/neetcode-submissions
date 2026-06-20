class Solution {
    public boolean isAnagram(String s, String t) {
    List<Character>l=new ArrayList<>();
    for(char c:s.toCharArray())
    {
        l.add(c);
    }
    Collections.sort(l);
    List<Character>l2=new ArrayList<>();
    for(char c:t.toCharArray())
    {
        l2.add(c);
    }
    Collections.sort(l2);
    if(l.equals(l2))
    return true;
    return false;
    }

}
