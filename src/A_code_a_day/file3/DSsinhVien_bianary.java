package A_code_a_day.file3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class SinhVien implements Serializable {
    private final String ma;
    private final String ten;
    private final String lop;
    private Date ngaysinh;
    private final float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) {
        this.ma = String.format("B20DCCN%03d", id + 1);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaysinh = sdf.parse(ngaysinh);
        } catch (Exception e) {

        }
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + sdf.format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}

public class DSsinhVien_bianary {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream tho = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> ds = (ArrayList<SinhVien>) tho.readObject();
        for (SinhVien x : ds) {
            System.out.println(x);
        }

    }
}
