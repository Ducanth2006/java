package failure.binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class duyetCayNhiPhanTimKiem1 {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    private static int index;
    private static Node buildTree(List<Integer> preorder, int min,int max){
        if(index>=preorder.size()) return null;
        int val=preorder.get(index);
        if(val<min||val>max){
            return null;
        }
        index++;
        Node root= new Node(val);
        root.left=buildTree(preorder,min,val);
        root.right=buildTree(preorder,val,max);
        return root;
    }
    private static void dfs(Node root){
        if(root==null) return ;
        dfs(root.left);
        dfs(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            List<Integer> preorder= new ArrayList<>();
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                preorder.add(Integer.parseInt(st.nextToken()));
            }
            index=0;
            Node root= buildTree(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
            // duyệt postOrder thôi
            dfs(root);
            System.out.println();


        }
    }
}
