package A_code_a_day.rencently_code;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class kh1 {
    private final String id;
    private final String name;
    private final String gioiTinh;
    private final String bd;
    private final String ad;

    public kh1(int id, String name, String gioiTinh, String bd, String ad) {
        this.id = String.format("KH%03d", id);
        this.name = chuanHoaName(name);
        this.gioiTinh = gioiTinh;
        this.bd = chuanHoaDate(bd);
        this.ad = ad;
    }

    private String chuanHoaName(String name) {
        String[] mang = name.trim().toLowerCase().split("\\s+");
        StringBuilder bd = new StringBuilder();
        for (String x : mang) {
            String wordChuan = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
            bd.append(wordChuan).append(" ");
        }
        return bd.toString().trim();
    }

    private String chuanHoaDate(String bd) {
        LocalDate date = LocalDate.parse(bd, DateTimeFormatter.ofPattern("d/M/yyyy"));
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String toString() {
        return id + " " + name + " " + gioiTinh + " " + ad + " " + bd;
    }

    public LocalDate getBD() {
        return LocalDate.parse(bd, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

public class DsKhachHangtrongfile {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("KHACHHANG.in"));
        ArrayList<kh1> ds = new ArrayList<>();
        int test = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= test; i++) {
            String name = reader.nextLine();
            String gioiTinh = reader.nextLine();
            String bd = reader.nextLine();
            String ad = reader.nextLine();
            ds.add(new kh1(i, name, gioiTinh, bd, ad));
        }
        ds.sort(Comparator.comparing(kh1::getBD));
        for (kh1 x : ds) {
            System.out.println(x);
        }


    }
}
