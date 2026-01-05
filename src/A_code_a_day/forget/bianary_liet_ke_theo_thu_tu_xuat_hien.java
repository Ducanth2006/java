package A_code_a_day.forget;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// ở bài này chúng ta cần thứ nhất đổi NHIPHAN.in về từ nhị phần về dạng chữ thường
// dùng contains để so sánh thằng Vanban.ins với thằng file nhị phân s
public class bianary_liet_ke_theo_thu_tu_xuat_hien {
    public static void main(String[] args) {
        try {
            // Xử lý và đọc xong thằng file nhi phan
            // vì đầu bài cho file nhiphan chứa một arraylist ==> phải sử dụng ObjectInputStream
            ObjectInputStream filenp = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
            ArrayList<String> tuTho = (ArrayList<String>) filenp.readObject();
            filenp.close();
            // tạo hashset để truy vấn nhanh và tự động xóa ký tự lặp
            Set<String> dulieuXin = new HashSet<>();
            // xử lý chuyển về chữ thường file nhi phan
            for (String x : tuTho) {
                String[] cacTu = x.toLowerCase().split("\\s+");
                for (String tu : cacTu) {
                    if (!tu.isEmpty()) {
                        dulieuXin.add(tu);
                    }
                }
            }

            // end xong file nhi phan với set duLieuXin

            // đọc file VanBan
            HashSet<String> daIn = new HashSet<>();// thằng này có tác dụng cho thằng add(K)
            // trong java add sử dụng với set sẽ trả về true nếu add(k) k chưa có trong set và ngược lại
            File file = new File("VANBAN.in");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String k = reader.next().toLowerCase();// k đọc từ file văn bản
                // kiểm tra xem thằng file văn bản có chưa xâu của thằng nhi phan ko ?
                if (dulieuXin.contains(k)) {
                    if (daIn.add(k)) {
                        System.out.println(k);// in theo thang file van ban
                    }
                }
            }


        } catch (Exception e) {

        }

    }

}
