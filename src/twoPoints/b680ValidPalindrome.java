package twoPoints;

public class b680ValidPalindrome {
    public static boolean helper(String s,int left,int right){
        char [] mangChar= s.toCharArray();
        while(left<right){
            if(mangChar[left]!=mangChar[right]){
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
        char[] mangChar= s.toCharArray();
        while(left<right){
            if(mangChar[left]!=mangChar[right]){
                return helper(s,left+1,right)||helper(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
}
