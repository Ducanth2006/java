package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class guest2{
    String maKh;
    String name;
    int soPhong;
    String ngayNhan;
    String ngayTra;
    long soNgayO;
    int phiPhu;
    long fee;

    public long getFee(){
        return fee;
    }
    public guest2(String maKh,String name,int soPhong,long soNgayO,long fee){
        this.maKh=maKh;
        this.fee=fee;
        this.soPhong=soPhong;
        this.name=name;
        this.soNgayO=soNgayO;
    }
    @Override
    public String toString(){
        return maKh+" "+name+" "+soPhong+" "+soNgayO+" "+fee;
    }
    // chuan hoa date hơi chưa chắc nhé
    public static String chuanHoaDate(String x){
        DateTimeFormatter input= DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date= LocalDate.parse(x,input);
        DateTimeFormatter output=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(output);
    }
    // tinh so ngay o
    public static Long tinhSongayo(String x, String y){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayNhan=LocalDate.parse(x,formatter);
        LocalDate ngayRa=LocalDate.parse(y,formatter);
        return ChronoUnit.DAYS.between(ngayNhan,ngayRa);
    }
    // sinh makh
    public static String sinhMaKh(int x){
        return String.format("KH%02d",x);
    }
    // chuan Hoa name đang chưa chắc nhé tý sẽ hoc thuộc
    public static String chuanHoaName(String x){
        String [] s=x.trim().toLowerCase().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for (String i:s){
            String wordChuan=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase();
            sb.append(wordChuan).append(" ");
        }
        return sb.toString().trim();
    }
    // xử lý tính tiền , bao gồm cắt đầu để xem tầng mấy
    public static long tinhTien(Long ngayo,int fee,String soPhong){
        int n=Integer.parseInt(soPhong.substring(0,1));
        if (n==1){
            int tienPhong=25;
            return ngayo*tienPhong+fee;
        }
        if(n==2){
            int tienPhong=34;
            return ngayo*tienPhong+fee;
        }
        if(n==3){
            int tienPhong=50;
            return ngayo*tienPhong+fee;
        }
        if(n==4){
            int tienPhong=80;
            return ngayo*tienPhong+fee;
        }
        else {
            return 0;
        }
    }

}
public class Tinh_tien_phong {
    public static void main(String[] args) {
        ArrayList<guest2> ds=new ArrayList<>();
        try{
            Scanner reader=new Scanner (new File("file23.txt"));
            int test=reader.nextInt();
            reader.nextLine();
            for(int g=1;g<=test;g++){
                String maKh=guest2.sinhMaKh(g);
                String fullName=guest2.chuanHoaName(reader.nextLine());
                int soPhong=Integer.parseInt(reader.nextLine());
                String dateIn=guest2.chuanHoaDate(reader.nextLine());
                String dateOut=guest2.chuanHoaDate(reader.nextLine());
                int fee=Integer.parseInt(reader.nextLine());
                // đọc thành công
                long soNgayo=(guest2.tinhSongayo(dateIn,dateOut))+1;
                long tienThanhToan=guest2.tinhTien(soNgayo,fee,String.valueOf(soPhong));
                ds.add(new guest2(maKh,fullName,soPhong,soNgayo,tienThanhToan));

            }
            ds.sort(Comparator.comparing(guest2::getFee).reversed());
            for (guest2 gst:ds){
                System.out.println(gst);
            }
        }catch(FileNotFoundException e){

        }
    }
}
