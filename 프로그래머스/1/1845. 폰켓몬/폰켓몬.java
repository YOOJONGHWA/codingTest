import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        
        int pick = nums.length / 2;
        
        return Math.min(set.size(), pick);
    }
}