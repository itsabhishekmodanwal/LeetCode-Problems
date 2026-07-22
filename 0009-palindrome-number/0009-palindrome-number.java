class Solution {
    public boolean isPalindrome(int x) {
        int palindrome=x;
        int reverse=Integer.MIN_VALUE;

        while(palindrome != 0){
            int reminder=palindrome % 10;
            reverse=reverse*10 + reminder;
            palindrome=palindrome/10;
        }
        if(x == 0){
            return true;
        }
        if(x==reverse && x>0){
            return true;
        }else{
            return false;
        }
    }
}