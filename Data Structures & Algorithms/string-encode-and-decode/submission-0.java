class Solution {

    public String encode(List<String> strs) {
     if(strs.size()==0)
     return "";
     List<Integer>size=new ArrayList<>();
     StringBuilder res=new StringBuilder();
     for(String s:strs)
     {
        size.add(s.length());
        
     }
     for(int si:size)
     {
        res.append(si).append(',');
     }
     res.append('#');
     for(String s:strs)
     res.append(s);
     return res.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==0)
        return new ArrayList<>();
        List<String>res=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#')
        {
          StringBuilder cur=new StringBuilder();
          while(str.charAt(i)!=',')
          {
            cur.append(str.charAt(i));
            i++;
          }
          l.add(Integer.parseInt(cur.toString()));
          i++;
        }
        i++;
        for(int sz:l)
        {
            res.add(str.substring(i,i+sz));
            i+=sz;
        }
        return res;

    }
}
