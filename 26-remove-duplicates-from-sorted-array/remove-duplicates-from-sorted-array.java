class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> s = new HashSet<>();
       int id = 0,cn = 0;
       for(int i=0;i<nums.length;i++){
        if(!s.contains(nums[i])){
            cn++;
            s.add(nums[i]);
            nums[id++] = nums[i];
        }
       } 
       return cn;
    }
}