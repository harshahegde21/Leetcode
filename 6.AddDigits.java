class Solution {
    public int digitSum(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n = n/10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int digsum = num;
        while(digsum>=10){
            digsum = digitSum(digsum);
        }
        return digsum;
    }
}
