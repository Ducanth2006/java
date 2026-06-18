package binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class reviewDuyetCay1 {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    private static final Map<Integer,Integer> mapIn= new HashMap<>();
    private static int preIndex;
    private static Node buildTree(int[]preorder,int startIn,int endIn){
        if(startIn>endIn) {
            return null;
        }
        int valueCur=preorder[preIndex];
        preIndex++;
        int index= mapIn.get(valueCur);
        Node root= new Node(valueCur);
        root.left=buildTree(preorder,startIn,index-1);
        root.right=buildTree(preorder,index+1,endIn);

        return root;

    }
    private static void postorder(Node root){
        if(root==null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            mapIn.clear();
            preIndex=0;
            int n=Integer.parseInt(br.readLine());
            int [] inorder= new int[n];
            int [] preorder=new int[n];
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                int value=Integer.parseInt(st.nextToken());
                inorder[i]=value;
                mapIn.put(value,i);
            }
            st= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                preorder[i]=Integer.parseInt(st.nextToken());
            }
            // build tree thôi
            Node root=buildTree(preorder,0,n-1);
            postorder(root);
            System.out.println();

        }
    }
}
