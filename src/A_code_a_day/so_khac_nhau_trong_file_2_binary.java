package A_code_a_day;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class so_khac_nhau_trong_file_2_binary {
    public static void main(String[] args) {
        // Sử dụng TreeMap để tự động sắp xếp các số tăng dần
        Map<Integer, Integer> map = new TreeMap<>();

        try {
            // 1. Mở file nhị phân DATA.in
            DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("DATA.IN")));// giảm 50% time luôn mà

            // 2. Đọc cho đến khi hết dữ liệu trong file
            while (dis.available() > 0) {
                int x = dis.readInt(); // Đọc 4 byte và chuyển thành 1 số nguyên

                // 3. Cập nhật số lần xuất hiện vào Map
                // Nếu x đã tồn tại, tăng giá trị lên 1. Nếu chưa, đặt là 1.
                map.put(x,map.getOrDefault(x, 0) + 1);
            }

            // Đóng luồng sau khi dùng xong
            dis.close();

            // 4. In kết quả theo định dạng: [Giá trị] [Số lần xuất hiện]
            map.forEach((key, value) -> {
                System.out.println(key + " " + value);
            });

        } catch (IOException e) {
            // Xử lý lỗi đọc file hoặc file không tồn tại
        }
    }
}

