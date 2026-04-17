package twoPoints;

public class b680ValidPalindrome {
    public static boolean helper(String s,int left,int right){
        char[] a= s.toCharArray();
        while(left<right){
            if(a[left]!=a[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        char[] a= s.toCharArray();
        while(left<right){
            if(a[left]!=a[right]){
                return helper(s,left+1,right)||helper(s,left,right-1);

            }
            left++;
            right--;
        }
        return true;
    }
}
