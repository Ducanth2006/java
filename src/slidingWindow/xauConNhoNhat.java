package slidingWindow;

import java.util.*;

public class xauConNhoNhat {
    private static int solve(char[]arr){
        Map<Character,Integer> map= new HashMap<>();
        Set<Character> set= new HashSet<>();
        int min=Integer.MAX_VALUE;
        int count=0;
        int left=0;
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int r=0;r<arr.length;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if(map.get(arr[r])==1){
                count++;
            }
            while(count==set.size()){
                if(min>r-left+1){
                    min=r-left+1;
                }
                char leftChar= arr[left];
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    count--;
                }
                left++;
            }
        }
        return min ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<test;t++){
            char[] arr= (sc.nextLine()).toCharArray();
            System.out.println(solve(arr));
        }
    }
}
