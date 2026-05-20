//we use kadane's algorithm 
// we can do one thing that is to understand the brute force approach

/*
  for(int i=0;i<n;i++){
    sum=0;
    for(int j=i;j<n;j++){
      sum+=arr[i]
      update maxsum at each step
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            maxsum=Math.max(sum,maxsum);            
        }
        return maxsum;
    }
}
//update to check whether we want to add the element so take the maximum of the current element and the previous contigous sum. 
