package binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class duyetCay1 {
    private static final Map<Integer,Integer> inorderMap =new HashMap<>();
    private static int preIndex;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int [] inorder= new int[n];
            int [] preorder = new int[n];
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                inorder[i]=Integer.parseInt(st.nextToken());
            }
            st= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                preorder[i]=Integer.parseInt(st.nextToken());
            }
            inorderMap.clear();
            for(int i=0;i<n;i++){
                inorderMap.put(inorder[i],i);
            }
            preIndex=0;
            // bt here
            changePostOrder(inorder,preorder,0,n-1);
            System.out.println();
        }
    }
    private static void changePostOrder(int[] inorder,int[]preorder,int inStart,int inEnd){
        if(inStart>inEnd){
            return ;
        }
        int rootVal=preorder[preIndex++];
        int indexRoot=inorderMap.get(rootVal);
        changePostOrder(inorder,preorder,inStart,indexRoot-1);
        changePostOrder(inorder,preorder,indexRoot+1,inEnd);
        System.out.print(rootVal+" ");
    }
}
