class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lb=new ArrayList<Boolean>();
        int sum=0,max=candies[0];
        for(int j=0;j<candies.length;j++)
            {
                if(candies[j]>=max)
                {
                    max=candies[j];
                }
            }
        for(int i=0;i<candies.length;i++)
        {
            sum=candies[i]+extraCandies;
            if(sum>=max)
            {
                lb.add(i,true);
            }
            else
            {
                lb.add(i,false);
            }
        }
        return lb;
    }
}
