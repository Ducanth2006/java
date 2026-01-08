package A_code_a_day.rencently_code;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class sv23 {
    private final String id;
    private final String name;
    private final String lop;
    private final String bd;
    private final double gpa;

    public sv23(int id, String name, String lop, String bd, double gpa) {
        this.id = String.format("B20DCCN%03d", id);
        this.name = chuanHoaName(name);
        this.lop = lop;
        this.bd = chuanHoaDate(bd);
        this.gpa = gpa;
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
        return id + " " + name + " " + lop + " " + bd + " " + String.format("%.2f", gpa);
    }
}

public class ChuanHoadsSv {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("SINHVIEN.in"));
        ArrayList<sv23> ds = new ArrayList<>();
        int test = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= test; i++) {
            String name = reader.nextLine();
            String lop = reader.nextLine();
            String bd = reader.nextLine();
            double gpa = Double.parseDouble(reader.nextLine());
            ds.add(new sv23(i, name, lop, bd, gpa));
        }
        for (sv23 x : ds) {
            System.out.println(x);
        }

    }
}
