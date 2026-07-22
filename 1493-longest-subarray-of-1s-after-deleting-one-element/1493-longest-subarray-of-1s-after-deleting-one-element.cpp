class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int n = nums.size();
        int l=0, r=0;
        int k=0;

        int maxLen= INT_MIN;

        while(r<n)
        {
            if(nums[r] == 0)k++;
            if(k>1)
            {
                maxLen=max(maxLen, r-l);
                while(nums[l]!=0)l++;

                l++;
                k--;
            }
            r++;
        }
        maxLen=max(maxLen, r-l);
        return maxLen-1;
    }
};