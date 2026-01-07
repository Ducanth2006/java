package A_code_a_day.rencently_code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class thiSinh1{
    String id;
    String name;
    String bd;
    double diemLyThuyet;
    double diemThucHanh;
    int age;
    int diemTb;
    String xepLoai;
    double diemThuong;
    public thiSinh1(int id,String name,String bd,double diemLyThuyet,double diemThucHanh){
        this.id=sinhId(id);
        this.name=name;
        this.bd=bd;
        this.diemLyThuyet=diemLyThuyet;
        this.diemThucHanh=diemThucHanh;
        this.diemThuong=tinhDiemThuong(this.diemThucHanh,this.diemLyThuyet);
        this.diemTb=tinhTong(this.diemLyThuyet,this.diemThucHanh,this.diemThuong);
        this.age=tinhAge(bd);
        this.xepLoai=tinhxepLoai(this.diemTb);

    }
    private double tinhDiemThuong(double diemThucHanh, double diemLyThuyet) {
        double diemThuong = 0;
        if (diemLyThuyet >= 8 && diemThucHanh >= 8) {
            diemThuong = 1;
        } else if ((diemLyThuyet >= 7.5 && diemLyThuyet < 8) && (diemThucHanh >= 7.5 && diemThucHanh < 8)) {
            diemThuong = 0.5;
        } else {
            diemThuong = 0;
        }
        return diemThuong;
    }
    private int tinhTong(double diemLyThuyet, double diemTh, double diemThuong) {
        long diemTong = Math.round(((diemLyThuyet + diemTh) / 2) + diemThuong);
        if (diemTong > 10) {
            return 10;
        } else {
            return (int) diemTong;
        }
    }
    private int tinhAge(String bd) {
        int x = Integer.valueOf(bd.substring(6));
        return 2021 - x;
    }
    private String tinhxepLoai(int diem) {
        String ketQua = "";

        if (diem < 5) {
            ketQua = "Truot";
        } else if (diem <= 6) {
            // Trường hợp này bao gồm điểm 5 và điểm 6
            ketQua = "Trung binh";
        } else if (diem == 7) {
            ketQua = "Kha";
        } else if (diem == 8) {
            ketQua = "Gioi";
        } else {
            // Trường hợp còn lại là điểm 9 hoặc 10
            ketQua = "Xuat sac";
        }

        return ketQua;
    }
    private String sinhId(int i) {
        return String.format("PH%02d", i);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + diemTb + " " + xepLoai;
    }
    public int getDiemTb(){
        return diemTb;
    }
    public String getId(){
        return id;
    }

}
public class Kq_xetTuyen {
    public static void main(String[] args) {
        ArrayList<thiSinh1> ds=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){
            String name=sc.nextLine();
            String bd=sc.nextLine();
            double dLT=Double.parseDouble(sc.nextLine());
            double dTH=Double.parseDouble(sc.nextLine());
            ds.add(new thiSinh1(i,name,bd,dLT,dTH));
        }
        ds.sort(Comparator.comparing(thiSinh1::getDiemTb).reversed().thenComparing(thiSinh1::getId));
        for(thiSinh1 x:ds){
            System.out.println(x);
        }

    }
}
