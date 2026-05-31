package stackCodePtit;

import java.util.*;

public class phanTuBenPhaiDauTienLonHon {
    private static void solve(int [] arr){
        Deque<Integer> stack= new ArrayDeque<>();
        int [] res= new int[arr.length];
        Arrays.fill(res,-1);
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty()&&arr[i]>arr[stack.peek()]){
                int index= stack.pop();
                res[index]=arr[i];
            }
            stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int x : res) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int t=0;t<test;t++){
            int n=sc.nextInt();
            int []arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            solve(arr);
        }
    }
}
