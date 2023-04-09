import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr); //O(nlogn)

        ArrayList<int[]> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){  //O(n^2)
            int[] res = new int[2];
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    res[0]=arr[i];
                    res[1]=arr[j];
                    ans.add(res);
                }
            }
        }

        return ans; //O(n^2)
    }
}
