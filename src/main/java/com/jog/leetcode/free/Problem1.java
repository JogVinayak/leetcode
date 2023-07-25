package com.jog.leetcode.free;


import java.util.*;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        int [] answer = new int[2];
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            tempMap.put(val, i);
            if( tempMap.get(target - val) != null ){
                answer[0] = tempMap.get(target - val);
                answer[1] = i;
                return answer;
            } else{
                tempMap.put(val, i);
            }
        }
        return answer;
    }
}
