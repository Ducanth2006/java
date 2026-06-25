package queuCodePtit;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class giaTriNhoNhatCuaXau {
    private static  final PriorityQueue<Integer> prio= new PriorityQueue<>(Collections.reverseOrder());
    private static void solve(String str,int k){
        prio.clear();
        int [] arr= new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch-'A']++;
        }
        for(int i:arr){
            if(i>0){
                prio.add(i);
            }
        }
        for(int i=0;i<k;i++){
            if(!prio.isEmpty()){
                int max=prio.poll();
                max-=1;
                if(max>0){
                    prio.add(max);
                }
            }
        }
        long ans=0;
        while(!prio.isEmpty()){
            long val= prio.poll();
            ans+=val*val;
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test -->0){
            int k= sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            solve(str,k);

        }
    }
}
