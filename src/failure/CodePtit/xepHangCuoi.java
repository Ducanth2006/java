package failure.CodePtit;

import java.util.*;

public class xepHangCuoi {
    private static int n;
    private static String []mangDb;
    private static ArrayList<String> mang;
    private static boolean[] isUsed;
    private static String lastEl;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        mang= new ArrayList<>();
        isUsed= new boolean[n];
        mangDb= new String[n];
        for(int i=0;i<n;i++){
            mangDb[i]=sc.next();
        }
        lastEl=sc.next();
        Arrays.sort(mangDb);
        bt();
    }
    private static void bt(){
        if(mang.size()==n-1){
            print();
            return;
        }
        for(int i=0;i<n;i++){
            if(!isUsed[i]&&!mangDb[i].equals(lastEl)){
                mang.add(mangDb[i]);
                isUsed[i]=true;
                bt();
                isUsed[i]=false;
                mang.remove(mang.size()-1);
            }
        }

    }
    private static void print(){
        StringBuilder sb = new StringBuilder();
        // SỬA 3: In n - 1 phần tử kèm dấu cách liền sau tuần tự
        for (String x : mang) {
            sb.append(x).append(" ");
        }
        // Nối nốt người cuối hàng và xuống dòng
        sb.append(lastEl);
        System.out.println(sb.toString());

    }
}
