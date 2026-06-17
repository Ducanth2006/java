package binaryTree;

import java.util.Scanner;

public class hauToTienToTree {
    static class Node{
        char val;
        Node left,right;
        Node(char value){
            this.val=value;
            this.left=null;
            this.right=null;
        }
    }
    private static int index;
    private static boolean isOper(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    private static Node constructTree(String x){
        if(index<0){
            return null;
        }
        char c=x.charAt(index);
        index--;
        Node root= new Node(c);
        if(isOper(c)){
            root.right=constructTree(x);
            root.left=constructTree(x);
        }
        return root;
    }
    private static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String x=sc.nextLine();
            index=x.length()-1;
            Node node= constructTree(x);
            inorder(node);
            System.out.println();
        }
    }
}
