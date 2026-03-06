package Arrayandhasing;

import java.util.Scanner;

class Solutionb14 {
    public String longestCommonPrefix(String[] strs) {
        // tìm cách tối ưu bài này nhé chậm qúa
        int n=strs.length;
        int i=0;
        String finalres="";
        // vòng while chạy các phần tử trong mảng ban đầu
            int size=strs[i].length();
            // vòng for có tác dụng lặp qua các từ trong chuỗi ở phần tử ban đầu
            for(int k=0;k<size;k++){
                String cut=finalres+strs[i].substring(k,k+1);
                int kt=0;
                // vòng for kiểm tra tra các từng từ trong phần tử đầu tiên có thỏa mãn trong các phần tử sau hay ko
                for(int o=i+1;o<n;o++){
                    if(strs[o].startsWith(cut)){
                        kt+=1;
                    }
                }
                if(kt==(n-1)){
                    finalres=cut; // gán thì chỉ cần để dấu bằng thôi nhé
                }
                else{

                    break;
                }

            }
            return finalres;
    }
}

public class b14_longest_prefex_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String x=sc.nextLine();

    }
}
