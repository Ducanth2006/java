package A_code_a_day;

import java.util.*;

class sinhVien21 {
    String id;
    String name;
    String lop;
    String nk;
    int diemcc;
    String note;

    public sinhVien21(String id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.nk = "";
        this.diemcc = 0;
        this.note = "";
    }


    public String toString() {
        return id + " " + name + " " + lop + " " + diemcc + " " + note + " ";
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

}

public class diemDanh1 {
    public static int tinhDiemcc(String x) {
        int diemcc = 10;
        for (int i = 0; i < x.length(); i++) {
            String s = x.substring(i, i + 1);
            if (s.equals("v")) {
                diemcc -= 2;
            }
            if (s.equals("m")) {
                diemcc -= 1;
            }
        }
        if (diemcc < 0) {
            diemcc = 0;
        }
        return diemcc;
    }

    public static String traVeNote(int i) {
        String note = "";
        if (i == 0) {
            note = "KDDK";
        }
        return note;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien21> ds = new ArrayList<>();
        Map<String, String> mapds = new HashMap<>();
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= test; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            ds.add(new sinhVien21(id, name, lop));
        }
        for (int i = 1; i <= test; i++) {
            String line = sc.nextLine();
            String[] s = line.trim().split("\\s+");
            mapds.put(s[0], s[1]);
        }

        for (sinhVien21 x : ds) {
            if (mapds.containsKey(x.id)) {
                x.nk = mapds.get(x.id);
                int diemCc = diemDanh1.tinhDiemcc(x.nk);
                x.diemcc = diemCc;
                x.note = diemDanh1.traVeNote(diemCc);
            }
        }
        String q = sc.nextLine();
        List<sinhVien21> dsLoc = ds.stream().filter(sv -> sv.getLop().equals(q)).collect(java.util.stream.Collectors.toList());

        for (sinhVien21 x : dsLoc) {
            System.out.println(x);
        }


    }

}
