package CodePtit;

import java.util.*;

public class datTen {

    private static void bt(ArrayList<String> mang,int n,int k,int index,ArrayList<String> mangKeQua){
        if(mangKeQua.size()==k){
            for(int i=0;i<k;i++){
                System.out.print(mangKeQua.get(i)+" ");
            }
            System.out.println();
            return;
        }
        for(int i=index;i<mang.size();i++){
            mangKeQua.add(mang.get(i));
            bt(mang,n,k,i+1,mangKeQua);
            mangKeQua.remove(mangKeQua.size()-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        TreeSet<String> treeSet= new TreeSet<>();

        for(int i=0;i<n;i++){
            treeSet.add(sc.next());
        }
        //Filter
        ArrayList<String> mang=new ArrayList<>();
        for(String x:treeSet){
            mang.add(x);
        }
        bt(mang,n,k,0,new ArrayList<>());





    }
}
