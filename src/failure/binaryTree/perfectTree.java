package failure.binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class perfectTree {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    private static int leftLevel;
    private static boolean checkPerfect(Node root,int level){
        if(root==null) return true;
        if(root.left==null&&root.right==null){
            if(leftLevel==-1){
                leftLevel=level;
                return true;
            }
            return level==leftLevel?true:false;
        }
        if(root.left==null||root.right==null){
            return false;
        }
        return checkPerfect(root.left,level+1)&&checkPerfect(root.right,level+1);
    }
    private static final Map<Integer,Node> mapBst = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            mapBst.clear();
            int n=Integer.parseInt(br.readLine());
            Node root=null;
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                char c=st.nextToken().charAt(0);
                if(!mapBst.containsKey(u)){
                    mapBst.put(u,new Node(u));
                    if(root==null){
                        root=mapBst.get(u);
                    }
                }
                if(!mapBst.containsKey(v)){
                    mapBst.put(v,new Node(v));
                }
                Node parent=mapBst.get(u);
                Node child =mapBst.get(v);
                if(c=='L'){
                    parent.left=child;
                }
                else{
                    parent.right=child;
                }
            }
            // build completed waiting check perfect;s
            leftLevel=-1;
            if(checkPerfect(root,0)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
    }
}
