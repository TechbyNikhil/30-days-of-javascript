class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length, sm = Integer.MAX_VALUE, lar = Integer.MIN_VALUE;
        for(int ele : nums){
            sm = Math.min(sm, ele);
            lar = Math.max(lar, ele);
        }

        return gcd(sm, lar);
    }

    int gcd(int num1, int num2){
        for(int i=Math.min(num1, num2);i>=0;i--){
            if(num1%i==0 && num2%i==0) return i;
        }
        return 0;
    }
}