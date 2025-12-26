package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class doanh_nghiep {
    String id;
    String tendn;
    int n;

    public String getId() {
        return id;
    }

    public String getTenDn() {
        return tendn;
    }

    public int getN() {
        return n;
    }

    public doanh_nghiep(String id, String tendn, int n) {
        this.id = id;
        this.n = n;
        this.tendn = tendn;
    }

    public String toString() {
        return id + " " + tendn + " " + n;
    }
}

public class Danh_sach_doanh_nghiep {
    public static void main(String[] args) {
        ArrayList<doanh_nghiep> ds = new ArrayList<>();
        try {
            Scanner reader = new Scanner(new File("DN.in"));
            int test = reader.nextInt();
            reader.nextLine();
            for (int i = 0; i < test; i++) {
                String id = reader.nextLine();
                String tendn = reader.nextLine();
                int n = Integer.parseInt(reader.nextLine());
                ds.add(new doanh_nghiep(id, tendn, n));
            }
            ds.sort(Comparator.comparing(doanh_nghiep::getId));
            for (doanh_nghiep x : ds) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {

        }
    }
}
