class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            int n = i&1;
            if(n!=0) count++;
        }
        return count;
    }
}
