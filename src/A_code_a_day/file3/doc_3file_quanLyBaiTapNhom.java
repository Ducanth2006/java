package A_code_a_day.file3;

import java.io.File;
import java.io.IOException;
import java.util.*;

class sinhVien4 {
    String id;
    String name;
    String soDienThoai;
    int stt;
    String tenBt;

    sinhVien4(String id, String name, String soDienThoai) {
        this.id = id;
        this.name = name;
        this.soDienThoai = soDienThoai;
        this.stt = 0;
        this.tenBt = "";
    }

    public String toString() {
        return id + " " + name + " " + soDienThoai + " " + stt + " " + tenBt;
    }

    public String getId() {
        return id;
    }
}

class bt4 {
    String tenBt;
}

class nhom4 {
    String id;
    int stt;
}

public class doc_3file_quanLyBaiTapNhom {
    public static void main(String[] args) throws IOException {
        Scanner readersv = new Scanner(new File("SINHVIEN.in"));
        Scanner readerbt = new Scanner(new File("BAITAP.in"));
        Scanner readernhom = new Scanner(new File("NHOM.in"));
        // đọc file sv
        ArrayList<sinhVien4> ds = new ArrayList<>();
        int nsv = readersv.nextInt();
        readersv.nextLine();
        for (int i = 1; i <= nsv; i++) {
            String id = readersv.nextLine();
            String name = readersv.nextLine();
            String soDienThoai = readersv.nextLine();
            ds.add(new sinhVien4(id, name, soDienThoai));

        }
        // đọc thành công

        //doc file bt
        Map<Integer, String> bt = new HashMap<>();
        int nbt = readerbt.nextInt();
        readerbt.nextLine();
        for (int i = 1; i <= nbt; i++) {
            String tenBt = readerbt.nextLine();
            bt.put(i, tenBt);
        }
        // ta gọi một cái hashmap ra để lưu key (msv) và value(stt nhóm)
        Map<String, Integer> nhom = new HashMap<>();
        // doc file nhom
        while (readernhom.hasNextLine()) {
            String[] mang = (readernhom.nextLine()).trim().split("\\s+");
            String id = mang[0];
            int stt = Integer.parseInt(mang[1]);
            nhom.put(id, stt);
        }
        //đọc thành công
        for (sinhVien4 x : ds) {
            if (nhom.containsKey(x.id)) {
                x.stt = nhom.get(x.id);
            }
        }
        // thêm thành công số thứ tự
        for (sinhVien4 h : ds) {
            if (bt.containsKey(h.stt)) {
                h.tenBt = bt.get(h.stt);
            }
        }
        ds.sort(Comparator.comparing(sinhVien4::getId));
        for (sinhVien4 h : ds) {
            System.out.println(h);
        }


    }
}
