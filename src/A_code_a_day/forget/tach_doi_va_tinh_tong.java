package A_code_a_day.forget;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class tach_doi_va_tinh_tong {
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try {
            Scanner reader = new Scanner(x);
            BigInteger a = reader.nextBigInteger();
            //toString tạo giá trị tạm thời là string , ko làm thay đổi giá trị ban đâu của a
            while (a.toString().length() > 1) {
                int n = a.toString().length();
                BigInteger s1 = new BigInteger(a.toString().substring(0, n / 2));
                BigInteger s2 = new BigInteger(a.toString().substring(n / 2, n));
                a = s1.add(s2);//với BigInteger bắt buộc phải dùng cái này để cộng nhé
                System.out.println(a);
            }
        } catch (FileNotFoundException e) {

        }
    }
}
// ta có s=1289434 s có số các chữ số là 7
//đi vào điều kiện while thỏa mãn nên chạy a = cắt từ vị trí 0 đến vị trị 7/2 do subString(int,int) suy ra phép chia kia về nguyên là =3
// suy ra a là số bắt đầu bằng (0 và kết thúc bằng 2(3-1) tương tự như vậy với b
// vì a và b là bigintegẻr là kiểu đối tượng nên phải dùng s=a.add(b); để tính tổng nhé