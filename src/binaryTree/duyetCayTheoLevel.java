package binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class duyetCayTheoLevel {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            Map<Integer,Node> map= new HashMap<>();
            Node root=null;
            for(int i=0;i<n;i++){
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                char x=st.nextToken().charAt(0);
                if(!map.containsKey(u)){
                    map.put(u,new Node(u));
                    if(root==null){
                        root=map.get(u);
                    }
                }
                if(!map.containsKey(v)){
                    map.put(v,new Node(v));
                }
                Node parent= map.get(u);
                Node child=map.get(v);
                if(x=='L'){
                    parent.left=child;
                }
                else{
                    parent.right=child;
                }
            }
            // duyệt here
            bfs(root);

            System.out.println();
        }
    }
    private static final Deque<Node> deque= new ArrayDeque<>();
    private static void bfs(Node root){
        deque.clear();
        if(root==null) return ;
        deque.offer(root);
        while(!deque.isEmpty()){
            Node cur= deque.poll();
            System.out.print(cur.val+" ");
            if(cur.left!=null){
                deque.offer(cur.left);
            }
            if(cur.right!=null){
                deque.offer(cur.right);
            }
        }

    }
}
