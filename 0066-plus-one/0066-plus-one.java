import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        
        int lastIndex =digits.length-1;
        int lastValue= digits[lastIndex];
        int digits_new [] ={0};

        if( lastValue<9)
        {
            digits[lastIndex]= lastValue+1;
            return digits;
        }
        else {
        StringBuilder sb= new StringBuilder ();
        for ( int i=0;  i<= lastIndex; i++){
            sb.append(String.valueOf(digits[i]));
        }
        BigInteger number = new BigInteger(sb.toString());
        number = number.add(BigInteger.ONE);
        String str= String.valueOf(number);
        char ch[]= str.toCharArray();
        digits_new = new int[ch.length];             
        for ( int i=0; i<=lastIndex; i++){
            digits_new[i] = ch[i]-'0';
        }
    }
        digits = digits_new;
        return digits;
    }      
}
