package A_code_a_day;

import java.util.Scanner;

public class Boi_cua_n_so_nguyen_duong_dau_tien {
    public static long GCD(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static long check(Long a) {
        long res = 1;
        for (long i = 1; i <= a; i++) {
            res = (res / GCD(res, i)) * i;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int j = 0; j < test; j++) {
            Long n = sc.nextLong();
            System.out.println(check(n));

        }
    }
}
// mã giải
// đầu tiên ta viết hàm gcd (a,b) ta lấy r= a%b sau đó gán a=b và b=r  , điều kiện dừng là b=0 trả về a
// sau đó ta sử dụng công thức bcnn lặp theo thứ tự n là ta để nó trong vòng for i=1 i<=n , do n bắt đầu từ 1
// sử dụng coong thức với bcnn=1  bcnn=(bcnn/ucln(bcnn,i))*i cứ như vậy nó sẽ lặp đến 1,2,3...n n phần tử rồi tính đc bcnn của dãy đó
