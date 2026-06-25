package failure.CodePtit;
import java.util.Scanner;
import java.util.ArrayList;

public class lietKeHoanViCodeForce {
    static int n, m;
    static boolean[] isUsed;
    static ArrayList<Integer> currentPermutation;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        isUsed =new boolean[n+1];
        currentPermutation= new ArrayList<>();
        currentPermutation.add(m);
        isUsed[m]=true;
        long startTime = System.nanoTime();
        bt();
        // 2. Lấy thời gian SAU khi hàm chạy xong
        long endTime = System.nanoTime();

        // 3. Tính toán khoảng chênh lệch
        long durationNano = endTime - startTime;
        double durationMega = (double) durationNano / 1_000_000; // Đổi sang mili giây (ms)

        // 4. In kết quả ra màn hình
        System.out.println("--------------------------------------");
        System.out.println("Thoi gian chay tinh bang nano giay: " + durationNano + " ns");
        System.out.println("Thoi gian chay tinh bang mili giay: " + durationMega + " ms");
    }
    private static void bt(){
        if(currentPermutation.size()==n){
            print();
            return;
        }
        for(int j=1;j<=n;j++){
            if(!isUsed[j]){
                isUsed[j]=true;
                currentPermutation.add(j);
                bt();
                isUsed[j]=false;
                currentPermutation.remove(currentPermutation.size()-1);
            }
        }
    }
    private static void print(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<currentPermutation.size();i++){
            sb.append(currentPermutation.get(i));
            if(i!= currentPermutation.size()-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
