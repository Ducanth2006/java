package A_code_a_day.file3;

import java.io.File;
import java.io.IOException;
import java.util.*;

class giangVien {
    private String id;
    private String name;
    private String maDay;
    private String monDay;
    Double gio;

    public giangVien(String id, String name) {
        this.id = cutId(id);
        this.name = name;
        this.maDay = "";
        this.monDay = "";
        this.gio = 0.0;
    }

    private String cutId(String id) {
        return id.trim().substring(0, 4);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaDay() {
        return maDay;
    }

    public void setMaDay(String maDay) {
        this.maDay = maDay;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String toString() {
        return name + " " + String.format("%.2f", gio);
    }
}

class gioChuan {
    String id;
    String maMon;
    double gio;

    public gioChuan(String id, String maMon, double gio) {
        this.id = id;
        this.maMon = maMon;
        this.gio = gio;
    }
}

public class TinhGioChuan {
    public static void main(String[] args) throws IOException {
        Scanner readerMH = new Scanner(new File("MONHOC.in"));
        Scanner readerGV = new Scanner(new File("GIANGVIEN.in"));
        Scanner readerGC = new Scanner(new File("GIOCHUAN.in"));
        ArrayList<giangVien> ds = new ArrayList<>();

        Map<String, String> mapMh = new HashMap<>();
        Set<gioChuan> dsFile3 = new HashSet<>();


        int test1 = Integer.parseInt(readerMH.nextLine());
        int test2 = Integer.parseInt(readerGV.nextLine());
        int test3 = Integer.parseInt(readerGC.nextLine());
        for (int i = 1; i <= test1; i++) {
            mapMh.put(readerMH.next(), readerMH.nextLine());
        }
        for (int i = 1; i <= test2; i++) {
            ds.add(new giangVien(readerGV.next(), readerGV.nextLine().trim()));
        }
        for (int i = 1; i <= test3; i++) {
            dsFile3.add(new gioChuan(readerGC.next(), readerGC.next(), Double.parseDouble(readerGC.nextLine())));
        }
        // đọc thành công
        for (giangVien x : ds) {
            for (gioChuan k : dsFile3) {
                if (x.getId().equals(k.id)) {
                    x.setMaDay(k.maMon);
                    x.gio += k.gio;
                    
                }
            }
        }
        for (giangVien x : ds) {
            if (mapMh.containsKey(x.getMaDay())) {
                x.setMonDay(mapMh.get(x.getMaDay()));
            }
        }
        for (giangVien x : ds) {
            System.out.println(x);
        }

    }
}
