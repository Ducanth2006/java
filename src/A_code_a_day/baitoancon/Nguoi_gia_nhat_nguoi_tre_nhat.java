package A_code_a_day.baitoancon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class person {
    String name;
    LocalDate bd;

    public person(String name, String bd) {
        this.name = name;
        this.bd = epLocalDate(bd);
    }

    public LocalDate epLocalDate(String bd) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(bd, formatter);
        return date;
    }

    public LocalDate getBd() {
        return bd;
    }

    public String toString() {
        return name;
    }
}

public class Nguoi_gia_nhat_nguoi_tre_nhat {
    public static void main(String[] args) {
        ArrayList<person> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= test; i++) {
            String name = sc.next();
            String bd = sc.next();
            sc.nextLine();
            ds.add(new person(name, bd));
        }
        ds.sort(Comparator.comparing(person::getBd).reversed());
        int stt = 1;
        for (person x : ds) {
            if (stt == 1) {
                System.out.println(x);
            }
            if (stt == ds.size()) {
                System.out.println(x);
            }
            stt += 1;
        }
    }

}
