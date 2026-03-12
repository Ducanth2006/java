package bttrenlop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class solutionThreeSum{
    public ArrayList<int[]> threesum(int n, int m){

        ArrayList<Integer> mang= new ArrayList<>(n);
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<int[]> mangLuu= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            mang.add(k);
            map.put(k,i);
        }
        // đã có mảng tạo sẵn
        for(int i =0;i<n;i++){
          for(int j=i+1;j<n;j++){
              int a=mang.get(i);
              int b= m-mang.get(j);
              int c= m-(a+b);
              if(map.containsKey(c)){
                  int indexc =map.get(c);
                  if(indexc>j){
                      mangLuu.add(new int[]{a,b,c});
                  }
              }
          }
        }
        return mangLuu;

    }

}
public class threesum {

}
