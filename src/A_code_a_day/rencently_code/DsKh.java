package A_code_a_day.rencently_code;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class kh {
    private final String id;
    private final String name;
    private final String gioiTinh;
    private final String bd;
    private final String dc;

    public kh(int id, String name, String gioiTinh, String bd, String dc) {
        this.id = sinhId(id);
        this.name = chuanHoaName(name);
        this.gioiTinh = gioiTinh;
        this.bd = chuanHoaDate(bd);
        this.dc = dc;
    }

    private String sinhId(int i) {
        return String.format("KH%03d", i);
    }

    private String chuanHoaName(String name) {
        String[] mang = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : mang) {
            String wordChuan = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
            sb.append(wordChuan).append(" ");
        }
        return sb.toString().trim();
    }

    private String chuanHoaDate(String bd) {
        LocalDate date = LocalDate.parse(bd, DateTimeFormatter.ofPattern("d/M/yyyy"));
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String toString() {
        return id + " " + name + " " + gioiTinh + " " + dc + " " + bd;
    }

    // nó định dạng chuẩn theo quốc tế là yyyy/MM/đd vì vâyuj phải đinj dạn lại
    public LocalDate getBd() {
        return LocalDate.parse(this.bd, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

public class DsKh {
    public static void main(String[] args) {
        ArrayList<kh> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= test; i++) {
            String name = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String bd = sc.nextLine();
            String ad = sc.nextLine();
            ds.add(new kh(i, name, gioiTinh, bd, ad));
        }
        ds.sort(Comparator.comparing(kh::getBd));
        for (kh x : ds) {
            System.out.println(x);
        }
    }
}
