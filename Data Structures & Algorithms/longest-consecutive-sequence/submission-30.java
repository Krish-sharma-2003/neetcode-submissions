// import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int longest = 0 ;  
        for(int i=0; i<nums.length; i++){
            map.add(nums[i]);
        }       
        // int count = 0;
        // || map.contains(1 - nums[i])
     
        for(int i=0; i<nums.length; i++){
            
            if (!map.contains(nums[i] - 1) ){
                int length = 0; 
                while(map.contains(nums[i]+length)){
                    
                        length +=1;
                    
                }
                longest = Math.max(length, longest);
            }
            
        }
        return longest;
    }
}
