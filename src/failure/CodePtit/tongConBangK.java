package failure.CodePtit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tongConBangK {
    static boolean check;

    private static void inMang(ArrayList<Integer> mang){
        System.out.print("[");
        for(int i=0;i<mang.size();i++){
            System.out.print(mang.get(i));
            if(i<mang.size()-1){
                System.out.print(" ");
            }
        }
        System.out.print("] ");
    }
    // Gợi ý cấu trúc lại hàm đệ quy

    private static void backTrack(int k, int index, int currentSum, ArrayList<Integer> temp, int[] mangDb) {

        if (currentSum == k) {
            // 1. Chuyển temp thành String định dạng [a b c] và lưu vào danh sách kết quả
            inMang(temp);
            check=true;
            return;
        }
        for (int i = index; i < mangDb.length; i++) {
            if (currentSum + mangDb[i] <= k) { // Cắt tỉa (Pruning)
                // 2. Thêm vào temp
                temp.add(mangDb[i]);
                // 3. Đệ quy với index mới là gì?
                backTrack(k,i+1,currentSum+mangDb[i],temp,mangDb);

                // 4. Xóa phần tử cuối cùng của temp để quay lui
                temp.remove(temp.size()-1);
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] mangDB=new int[n];
            for(int i=0;i<n;i++){
                mangDB[i]=sc.nextInt();
            }
            check=false;
            Arrays.sort(mangDB);
            backTrack(k,0,0,new ArrayList<>(),mangDB);
            if(!check){
                System.out.println(-1);
            }
            System.out.println();


        }
    }
}
// bài này là back track tức là phải dùng đến tree nhé , nó sẽ th hết trường hợp rồi quay lui nhé có cái if prunning
// rất tiện để đỡ lặp quay lui nhé
// bài này sẽ đc code lại vào tối nay , 12-05 , sau đó là 14-05