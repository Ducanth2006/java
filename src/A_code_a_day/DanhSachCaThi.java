package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class caThi {
    String id;
    String ngayThi;
    String hThi;
    long idPhong;

    public caThi(int id, String ngayThi, String hThi, long idPhong) {
        this.id = sinhId(id);
        this.ngayThi = ngayThi;
        this.hThi = hThi;
        this.idPhong = idPhong;
    }

    private String sinhId(int i) {
        return String.format("C%03d", i);
    }

    // hàm kết hơpj h và ngày để lấy được thời gian sớm nhát
    public LocalDateTime gophourvaday() {
        LocalDate d = LocalDate.parse(this.ngayThi, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalTime h = LocalTime.parse(this.hThi, DateTimeFormatter.ofPattern("HH:mm"));
        return d.atTime(h);
    }

    public String toString() {
        return id + " " + ngayThi + " " + hThi + " " + idPhong;
    }
}

public class DanhSachCaThi {
    public static void main(String[] args) {
        ArrayList<caThi> ds = new ArrayList<>();
        try {
            Scanner reader = new Scanner(new File("CATHI.in"));
            int test = reader.nextInt();
            reader.nextLine();
            for (int i = 1; i <= test; i++) {
                int id = i;
                String ngayThi = reader.nextLine();
                String gioThi = reader.nextLine();
                long idPhong = Long.parseLong(reader.nextLine());
                ds.add(new caThi(id, ngayThi, gioThi, idPhong));
            }
            ds.sort(Comparator.comparing(caThi::gophourvaday));
            for (caThi x : ds) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {

        }
    }
}
