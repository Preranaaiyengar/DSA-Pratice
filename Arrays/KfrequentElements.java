/* Problem: Top K Frequent Elements
Topic: Arrays / HashMap / Heap
Find the k most frequent elements in an array
Status: Solved */

import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(k==nums.length){
            return nums;
        }

        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n, m.getOrDefault(n,0)+1);
        }

        Queue<Integer> q = new PriorityQueue<>((a,b) -> m.get(a)-m.get(b));
        
        for(int n : m.keySet()){
            q.add(n);
            if(q.size()>k)
            q.poll();
        }

        int[] ans = new int[k];
        for(int i=0;i<ans.length;i++){
            ans[i]=q.poll();
        }

        return ans;
    }
}
