package failure.binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class cayBieuThuc2 {
    private static final Deque<Node> deque= new ArrayDeque<>();
    static class Node{
        String val;
        Node left,right;
        public Node(String val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    private static Node constructTree(String [] arr){
        deque.clear();
        if(arr.length==0) return null;
        String x=arr[0];
        Node root=new Node(x);
        int index=1;
        deque.offer(root);
        while(index<arr.length&&!deque.isEmpty()){
            Node cur= deque.poll();
            if(index<arr.length){
                cur.left=new Node(arr[index]);
                deque.offer(cur.left);
                index++;
            }
            if(index<arr.length){
                cur.right= new Node(arr[index]);
                deque.offer(cur.right);
                index++;
            }
        }
        return root;

    }
    private static boolean isOper(String x){
        return x.equals("+")||x.equals("-")||x.equals("*")||x.equals("/")?true:false;
    }
    private static int postOrder(Node root){
        if(root==null) return 0;
        if(!isOper(root.val)) return Integer.parseInt(root.val);
        int leftNode=postOrder(root.left);
        int rightNode=postOrder(root.right);
        switch (root.val){
            case "+":return leftNode+rightNode;
            case "-":return leftNode-rightNode;
            case "*":return leftNode*rightNode;
        }
        return 0;




    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n=Integer.parseInt(br.readLine().trim());
            String [] arr=new String[n];
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i]=st.nextToken();
            }
            // hàm xây cây
            Node root =constructTree(arr);
            // hàm tính cách số trong cây
            System.out.println(postOrder(root));
        }
    }
}
