class Solution {
    public int reverse(int num){
        int rev = 0;
        while(num>0){
            rev = rev*10+num%10;
            num/=10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int n1 = reverse(num);
        int n2 = reverse(n1);
        if(num==n2) return true;
        return false;
    }
}
