package twoPoints;



public class b1768mergeStringAlternative {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        int i=0;
        int j=0;
        while(i<n1||j<n2){
            if(i<n1){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j<n2){
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return String.valueOf(sb);
    }
}
//Đừng phức tạp hóa vấn đề nhé nhìn vào thấy chỉ là xếp chồng thôi có điều kiện một ít thôi mà
