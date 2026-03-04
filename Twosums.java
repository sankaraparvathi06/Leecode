import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Value -> Index
        Map<Integer, Integer> prevMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the required complement is already in the map
            if (prevMap.containsKey(complement)) {
                return new int[] { prevMap.get(complement), i };
            }
            
            // Store current number and its index
            prevMap.put(nums[i], i);
        }
        
        // Return empty array if no solution is found (though the problem guarantees one)
        return new int[] {};
    }
}
