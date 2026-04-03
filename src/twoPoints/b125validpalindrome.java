package twoPoints;

public class b125validpalindrome {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        String filtered=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n=filtered.length()-1;
        for(int i=0;i<filtered.length()/2;i++){
            if(filtered.charAt(i)!=filtered.charAt(n)){
                return false;
            }
            n--;

        }
        return true;
    }
}
