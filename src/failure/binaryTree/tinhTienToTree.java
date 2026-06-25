package failure.binaryTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class tinhTienToTree {
    static class Node{
        String val;
        Node right,left;
        Node(String value){
            this.val=value;
            this.right=null;
            this.left=null;
        }
    }
    private static final Deque<Node> deque= new ArrayDeque<>();

    private static boolean isOper(String x) {
        if (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")) return true;
        return false;
    }
    private static Node constructTree(String [] str){
        deque.clear();
        if(str.length==0) return null;
        Node node= new Node(str[0]);
        deque.offer(node);
        int i=1;
        while(i<str.length&&!deque.isEmpty()){
            Node cur=deque.poll();
            if(i<str.length){
                cur.left=new Node(str[i]);
                deque.offer(cur.left);
                i++;
            }
            if(i<str.length){
                cur.right=new Node(str[i]);
                deque.offer(cur.right);
                i++;
            }
        }
        return node;
    }
    private static int evaluate(Node root){
        if(root.val==null) return 0;
        if(!isOper(root.val)) return Integer.parseInt(root.val);
        int leftCur=evaluate(root.left);
        int rightCur=evaluate(root.right);
        switch(root.val){
            case "+":return leftCur+rightCur;
            case "-": return leftCur-rightCur;
            case "*":return leftCur*rightCur;
            case "/":return leftCur/rightCur;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String [] tokens= sc.nextLine().split("\\s+");
            Node root= constructTree(tokens);
            System.out.println(evaluate(root));
        }
    }
}
