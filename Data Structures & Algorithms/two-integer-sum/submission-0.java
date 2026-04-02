class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();  //map of Number and index that we needed;
        // Set<Integer> set = new HashSet<>(); //to keep track of of differences 
        int count = 0;
        for (int item : nums){
            int complement = target - item;
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), count};
            }
            map.put(item, count);
            count +=1;
        }
        return new int[] {-1, -1};
    }
}
