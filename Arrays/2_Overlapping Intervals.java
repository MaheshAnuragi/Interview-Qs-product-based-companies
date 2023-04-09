public class Solution {
    public static boolean checkOverlappingIntervals (long[] startTime, long[] endTime) {
        // Your code goes here.

        int i=1,j=0;

        int n = startTime.length;

        if(n==1 || n==0){
            return false;
        }

        while(i<n && j<n){
            if(endTime[j]>startTime[i] && endTime[j+1]>startTime[i-1]){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}
