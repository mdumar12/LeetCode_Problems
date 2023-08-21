class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res=0;
        for(int i=0;i<hours.length;i++){ if(hours[i]>=target)res++; }
        return res;
        }
     /*
        int res=0;
        for(int hrs:hours){ if(hrs>=target)res++; }
        return res;
        }
      */
}
