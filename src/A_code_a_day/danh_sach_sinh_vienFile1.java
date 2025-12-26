package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class sinhVien{
    String msv;
    String name;
    String lop_sv;
    String email;
    sinhVien(String msv,String name,String lop_sv,String email){
        this.msv=msv;
        this.name=chuanHoaName(name);
        this.lop_sv=lop_sv;
        this.email=email;
    }

    public static String chuanHoaName(String s ){
        String [] mang=s.split("\\s+");
        StringBuilder sb= new StringBuilder();
        for (String x:mang){
            String wordchuan=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase();
            sb.append(wordchuan).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return msv+" "+name+" "+lop_sv+" "+email;
    }
}
public class danh_sach_sinh_vienFile1 {


    public static void main(String[] args) {
        Set<Integer> treeset= new TreeSet<>();
        File file= new File("file23.txt");
        try{
            Scanner reader=new Scanner(file);
            ArrayList<sinhVien> danhsach= new ArrayList<>();

            if(reader.hasNextLine()){
                int test=reader.nextInt();
                reader.nextLine();
                for (int i=1;i<=test;i++){
                    String msv=reader.nextLine();
                    String fullName=reader.nextLine().toLowerCase().trim();
                    String lop=reader.nextLine();
                    String email=reader.nextLine();
                    // Đọc thành công
                    danhsach.add(new sinhVien(msv,fullName,lop,email));


                }
            }
// rất lạ cần tìm hiểu sâu
//            Collections.sort(danhsach, new Comparator<sinhVien>() {
//                @Override
//                public int compare(sinhVien o1, sinhVien o2) {
//                    // So sánh chuỗi MSV (String), không so sánh số cuối
//                    return o1.msv.compareTo(o2.msv);
//                }
//            });
            // VIẾT DÒNG NÀY VÀO THAY THẾ
            danhsach.sort(Comparator.comparing(sv -> sv.msv));
            for (sinhVien sv:danhsach){
                System.out.println(sv);
            }
        }catch(FileNotFoundException e){

        }

    }
}
