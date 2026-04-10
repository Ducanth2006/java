package twoPoints;

public class b680ValidPalindrome {
    public boolean validPalindrome(String s){
        char[] a= new char[s.length()];
        int limit=0;
        int size=a.length-1;
        for(int i=0;i<a.length/2;i++){
            if(limit==1){
                break;
            }
            // ko biết skip kiểu j giờ skip left hay right
            if(a[i]!=a[size]){
                limit++;


            }
        }



        return true;
    }
}
