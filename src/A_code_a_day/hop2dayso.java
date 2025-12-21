package A_code_a_day;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class hop2dayso {
    public static ArrayList<Long> check(ArrayList<Long> A, ArrayList<Long> B) {
        TreeSet<Long> hopnhau = new TreeSet<>(A);// Cho tất cả A vào trước
        hopnhau.addAll(B);// Sau đó "hợp" thêm tất cả B vào
        return new ArrayList<>(hopnhau);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Long> A = new ArrayList<>();
        ArrayList<Long> B = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextLong());
        }
        for (int i = 0; i < m; i++) {
            B.add(sc.nextLong());
        }
        ArrayList<Long> C = check(A, B);
        for (Long x : C) {
            System.out.print(x + " ");
        }


    }
}
// ta dùng treeset cho những bài yêu cầu thứ tự , và hợp , ta chỉ cần sử dụng addAll(mảng thứ 2) để tìm đc hợp