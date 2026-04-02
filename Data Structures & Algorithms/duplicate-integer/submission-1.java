class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item: nums){
            if (map.containsKey(item)){
                return true;
            }
            map.put(item, 1);
        }
        return false;
        
    }
}