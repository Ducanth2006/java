package binaryTree;

import java.io.BufferedReader;
import java.util.*;

public class duyetCay2 {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    private static Node buildTree(List<Integer> levelorder,int startIn,int endIn){
        if(startIn>endIn) return null;
        int value=levelorder.get(0);
        int index=mapIn.get(value);
        ArrayList<Integer> arrLeft=new ArrayList<>();
        ArrayList<Integer> arrRight= new ArrayList<>();
        for(int i=1;i<levelorder.size();i++){
            int valueLev=levelorder.get(i);
            if(mapIn.get(valueLev)<index){
                arrLeft.add(valueLev);
            }
            else{
                arrRight.add(valueLev);
            }
        }
        Node root= new Node(value);
        root.left=buildTree(arrLeft,startIn,index-1);
        root.right=buildTree(arrRight,index+1,endIn);
        return root;
    }

    private static void dfs(Node root){
        if(root==null)return ;
        dfs(root.left);
        dfs(root.right);
        System.out.print(root.val+" ");

    }
    private static final Map<Integer,Integer> mapIn= new HashMap<>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            mapIn.clear();
            int n=sc.nextInt();
            List<Integer> inorder= new ArrayList<>();
            List<Integer> levelorder= new ArrayList<>();
            for(int i=0;i<n;i++) {
                int k=sc.nextInt();
                inorder.add(k);
                mapIn.put(k,i);
            }
            for(int i=0;i<n;i++){
                levelorder.add(sc.nextInt());
            }
            Node root=buildTree(levelorder,0,n-1);
            // duyệt thôi
            dfs(root);
            System.out.println();
        }
    }
}
