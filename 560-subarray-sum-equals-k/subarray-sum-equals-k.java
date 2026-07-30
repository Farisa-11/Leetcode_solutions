class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int num:nums){ //num=1,sum=1
            sum+=num;
            if(map.containsKey(sum-k)){ //-1
                count+=map.get(sum-k); 
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
