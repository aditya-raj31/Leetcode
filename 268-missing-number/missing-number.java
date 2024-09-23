class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+1];
        
        for(int i=0; i<ans.length; i++){
            ans[i] = i;
        }
        Arrays.sort(nums);
        if(n!=nums[n-1]){
            return n;
        }
        for(int i=0; i<ans.length-1; i++){
        if(nums[i]!= ans[i]){
            return ans[i];
        }
        }
        return -1;
    }
}