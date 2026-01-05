package A_code_a_day.forget;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong> {
    String line; // Lưu nguyên cả dòng để in ra cho đúng ý đề bài
    String name; // Lưu tên để sắp xếp

    public LoaiPhong(String line) {
        this.line = line; // 1. Lưu lại nguyên gốc

        // 2. Xử lý tách tên (Logic: Tên là phần ở giữa Mã và 2 số cuối)
        String[] a = line.trim().split("\\s+");

        // Tên bắt đầu từ phần tử thứ 1 (sau mã) đến phần tử (length - 3)
        // Ví dụ: [STD, Phòng, Tiêu, Chuẩn, 500, 0.05]
        // a[0]=STD; a[length-2]=500; a[length-1]=0.05.
        // Vậy tên là từ a[1] đến a[length-3]

        String tmpName = "";
        for (int i = 1; i <= a.length - 3; i++) {
            tmpName += a[i] + " ";
        }
        this.name = tmpName.trim(); // Xóa khoảng trắng thừa ở cuối
    }

    @Override
    public String toString() {
        return line; // In ra nguyên dòng gốc, không cần ghép lại
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name); // Sắp xếp xuôi A->Z
    }
}

public class Loai_phong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}

