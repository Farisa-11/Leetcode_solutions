class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                int v=t.get(i-1).get(j-1)+t.get(i-1).get(j);
                row.add(v);
            }
            if(i>0){
                row.add(1);
            }
            t.add(row);
        }
        return t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numRows=sc.nextInt();
        Solution obj=new Solution();
        List<List<Integer>> res=obj.generate(numRows);
        System.out.println(res);
    }
}