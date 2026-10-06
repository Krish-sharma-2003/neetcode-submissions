class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<=nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if (nums[i] + nums[j] == target){
        //             // System.out.println("["+ i + "," + j + "]");
        //           return  new int[] {i,j};
        //         }
        //         // else{
        //         //     i+=1;
        //         // }
        //     }
        // } 
        // return new int[] {-1,-1};
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[] {-1,-1};
    }
}
