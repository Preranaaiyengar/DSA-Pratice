/*
Problem: Two Sum
Topic: Arrays / HashMap
Input: int[] nums, int target
Output: indices of two numbers such that they add up to target
Status: Solved
*/

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr = new int[2];
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             arr[0]=i;
        //             arr[1]=j;
        //         }
        //     }

        Map<Integer,Integer> h =new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];

            if(h.containsKey(rem)){
            return new int[] {h.get(rem), i};
           }

           h.put(nums[i],i);
        }
        return new int[] {};

    }
    //  return arr;
    
}
