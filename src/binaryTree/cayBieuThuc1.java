package binaryTree;

import java.util.Scanner;

public class cayBieuThuc1 {
    private static int index;
    static class Node{
         char val;
         Node left,right;
         public Node(char value){
             this.val=value;
             this.left=null;
             this.right=null;
         }
    }
    private static boolean isOper(char x){
        return x=='+'||x=='-'||x=='*'||x=='/'?true:false;
    }
    private static Node constructTree(String x){
        if(index<0) return null;
        char c=x.charAt(index);
        index--;
        Node root= new Node(c);
        if(isOper(c)){
            root.right=constructTree(x);
            root.left=constructTree(x);
        }
        return root;
    }
    // hàm duyệt duyệt theo inOrder trái gốc phải
    private static void inorder(Node root){
        if(root!=null) {
            inorder(root.left);
            System.out.print(root.val);
            inorder(root.right);

        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String x=sc.next();
            index=x.length()-1;
            Node root= constructTree(x);
            inorder(root);
            System.out.println();

        }
    }

}
