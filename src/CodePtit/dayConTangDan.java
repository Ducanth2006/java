package CodePtit;

import java.util.*;

public class dayConTangDan {
    private static List<String> mangKeQua =new ArrayList<>();
    private static String change(ArrayList<Integer> mang){
        StringBuilder s=new StringBuilder();
        for(int x :mang){
            s.append(x).append(" ");
        }
        return s.toString().trim();
    }
    private static void bt(int [] mang,int n,int index,ArrayList<Integer> mangHienTai){
        if(mangHienTai.size()>=2){
            mangKeQua.add(change(mangHienTai));
        }
        for(int i=index;i<n;i++){
            if(mangHienTai.isEmpty()||mang[i]>mangHienTai.get(mangHienTai.size()-1)){
                mangHienTai.add(mang[i]);
                bt(mang,n,i+1,mangHienTai);
                mangHienTai.remove(mangHienTai.size()-1);
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []mang=new int[n];
        for(int i=0;i<n;i++){
            mang[i]=sc.nextInt();
        }
        bt(mang,n,0,new ArrayList<>());
        Collections.sort(mangKeQua);
        for(String x:mangKeQua){
            System.out.println(x);
        }


    }
}
