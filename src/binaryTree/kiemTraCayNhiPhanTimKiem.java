package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kiemTraCayNhiPhanTimKiem {
    private static void check(List<Integer> arr){
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=arr.get(i-1)){
                System.out.println(0);
                return ;
            }
        }
        System.out.println(1);
    }

    private static final ArrayList<Integer> inorder = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            inorder.clear();
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                 inorder.add(sc.nextInt());
            }
            check(inorder);

        }
    }


}
