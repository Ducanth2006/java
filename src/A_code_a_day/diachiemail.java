package A_code_a_day;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
// tôi toàn quên bước này vức nó ra ngoài test để deal và nó có thể lưu tất cả các testcase
        // Bước 1: Đưa Map ra ngoài vòng lặp để nó "nhớ" được dữ liệu của tất cả các lần nhập
        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < test; i++) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] mang = s.split("\\s+");
            int n = mang.length;

            String mainName = mang[n - 1]; // Tên chính (vinh)
            String hodem = "";             // Viết tắt họ đệm (nq)
            for (int j = 0; j < n - 1; j++) {
                hodem += mang[j].substring(0, 1);
            }
// phải so sánh ccacsi thằng full name này chứ ko phải mỗi họ đâu nhé vinhnq  chứ ko phải nq ?
            // Bước 2: Tạo Key đầy đủ (ví dụ: "vinhnq")
            String fullEmailName = mainName + hodem;

            // Bước 3: Cập nhật số lần xuất hiện vào Map
            if (!countMap.containsKey(fullEmailName)) {
                countMap.put(fullEmailName, 1);
                // Lần đầu xuất hiện: không có số
                System.out.println(fullEmailName + "@ptit.edu.vn");
            } else {
                int count = countMap.get(fullEmailName) + 1;
                countMap.put(fullEmailName, count);
                // Từ lần thứ 2 trở đi: thêm số vào sau
                System.out.println(fullEmailName + count + "@ptit.edu.vn");
            }
        }
    }
}
