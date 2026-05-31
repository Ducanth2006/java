package Review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reviewDayConTangDan {
    private static List<String> mangKQ= new ArrayList<>();
    private static String convertToArrayString(ArrayList<Integer> mang){
        StringBuilder sb=new StringBuilder();
        for(int x=0;x<mang.size();x++){
           if(x==mang.size()-1){
               sb.append(mang.get(x));
           }
           else{
               sb.append(mang.get(x)).append(" ");
           }
        }
        return sb.toString().trim();

    }
    private static void bt(int[] mangDb,int index,ArrayList<Integer> mangTam){
        if(mangTam.size()>=2){
            mangKQ.add(convertToArrayString(mangTam));

        }
        for(int i=index;i<mangDb.length;i++){
            if(mangTam.isEmpty()||mangDb[i]>mangTam.get(mangTam.size()-1)){
                mangTam.add(mangDb[i]);
                bt(mangDb,index+1,mangTam);
                mangTam.remove(mangTam.size()-1);
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] mang=new int[n];
        for(int i=0;i<n;i++){
            mang[i]=sc.nextInt();
        }
        bt(mang,0,new ArrayList<>());
        Collections.sort(mangKQ);
        for(String x : mangKQ){
            System.out.println(x);
        }


    }
}
