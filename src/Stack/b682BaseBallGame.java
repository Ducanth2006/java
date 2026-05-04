package Stack;

import java.util.ArrayList;

public class b682BaseBallGame {
    static boolean isInteger(String x){
        try {
            int k= Integer.parseInt(x);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    public int calPoints(String[] operations) {
        ArrayList<Integer> mang=new ArrayList<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(isInteger(operations[i])){
                mang.add(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("C")){
                int n=mang.size();
                mang.remove(n-1);
            }
            else if(operations[i].equals("D")){
                int n=mang.size();
                mang.add(mang.get(n-1)*2);
            }
            else{
                int n=mang.size();
                mang.add(mang.get(n-1)+mang.get(n-2));
            }
        }
//      Vòng for để cộng tổng các phần tử trong mảng
        for(int n:mang){
            sum+=n;
        }

        return sum;


    }
}
//Đầu bài yêu cầu nếu gặp int thì thêm int vào mảng
//Nếu gặp cộng thì thêm sum của 2 số liền kề vào cuối
//Nếu gặp C thì loại bỏ phần tử trước đó
//Nếu gặp D thì lấy số= (2* phần tử trước đó) thêm vào cuối của mảng