package CodePtit;

import java.util.*;

public class nganXep1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Deque<Integer> stack= new ArrayDeque<>();
        while(sc.hasNext()){
            String nameFunc=sc.next();
            if(nameFunc.equals("push")){
                int i=sc.nextInt();
                stack.push(i);
            }
            else if(nameFunc.equals("pop")){

                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if (nameFunc.equals("show")){
                if(stack.isEmpty()){
                    System.out.println("empty");
                }
                else{
                    List<Integer> list0= new ArrayList<>(stack);
                    Collections.reverse(list0);
                    for(int x:list0){
                        System.out.print(x+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
