// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
public class KthBit {
    public static void main(String[] args) {
        System.out.println(findKthBit(4, 11));
    }
    public static char findKthBit(int n, int k) {
        if(k==1){
            return '0';
        }

        return findNthString("0", n).charAt(k-1);
    }
    public static String findNthString(String s, int n){
        if(n==0){
            return s;
        }
        s = s + "1" + reverseInverse(s);

        return findNthString(s, n-1);
    }

    public static String reverseInverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }

        return sb.reverse().toString();
    }
}