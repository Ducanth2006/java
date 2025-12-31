package A_code_a_day;

import java.util.*;

class student4 {
    String id;
    String name;
    String sdt;
    int thuTuNhom;

    public student4(String id, String name, String sdt, int thuTuNhom) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.thuTuNhom = thuTuNhom;
    }

    public String toString() {
        return id + " " + name + " " + sdt + " " + thuTuNhom + " ";
    }

    public String getId() {
        return id;
    }


}

public class quanLyBaiTapNhom2 {
    public static void main(String[] args) {
        ArrayList<student4> ds = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int soSv = sc.nextInt();
        int soNhom = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= soSv; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            int thuTuNhom = Integer.parseInt(sc.nextLine());
            ds.add(new student4(id, name, sdt, thuTuNhom));
        }
        // có nhiều cách làm , cách thứ nhất tách ra thành riêng xong cộng theo for
        for (int i = 1; i <= soNhom; i++) {
            String tenDeTai = sc.nextLine();
            map.put(i, tenDeTai);
        }
        // đọc thành công
        ds.sort(Comparator.comparing(student4::getId));
        for (student4 st : ds) {
            System.out.println(st + map.get(st.thuTuNhom));
        }


    }
}
