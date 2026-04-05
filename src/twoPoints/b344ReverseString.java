package twoPoints;

public class b344ReverseString {
    public void reverseString(char[] s) {

        int right=s.length-1;
        for(int i=0;i<s.length/2;i++){
            if(i==right){
                break;
            }
            char temp=s[i];
            s[i]=s[right];
            s[right]=temp;
            right--;
        }
    }
}
