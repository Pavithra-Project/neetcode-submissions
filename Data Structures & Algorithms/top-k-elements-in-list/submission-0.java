class Solution {
    public int[] topKFrequent(int[] num, int k) {
        int n=num.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
          map.put(num[i],map.getOrDefault(num[i],0)+1);

        }
        List<Map.Entry<Integer,Integer>>l=new ArrayList<>(map.entrySet());
       l.sort((a,b)->b.getValue()-a.getValue());
        int a[]=new int[k];
        int in=0;
      for(int i=0;i<k;i++)
      a[i]=l.get(i).getKey();
        return a;
    }
}
