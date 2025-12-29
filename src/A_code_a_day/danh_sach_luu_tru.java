package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class  guest{
    String maKh;
    String fullName;
    String idRoom;
    String ngayVao;
    String ngayRa;
    Long lengthOfStay;
    // Constructor
    public guest(String maKh,String fullName,String idRoom,long lengthOfStay){
        this.maKh=maKh;
        this.fullName=fullName;
        this.idRoom=idRoom;
        this.lengthOfStay=lengthOfStay;

    }
    // toString
    @Override
    public String toString(){
        return maKh+" "+fullName+" "+idRoom+" "+lengthOfStay;
    }

    public String getMaKh(){
        return maKh;
    }

    public Long getLengthOfStay() {
        return lengthOfStay;
    }

    // ham sinh ra ma sinh vien
    public static String sinhMaKh(int s){
        return String.format("KH%02d",s);
    }


}
// mới này tính thời gian này này
public class danh_sach_luu_tru {
    public static  Long tinhLengthOfStay(String ngayVao,String ngayRa){
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateIn =LocalDate.parse(ngayVao,formatter);
        LocalDate dateOut=LocalDate.parse(ngayRa,formatter);
        return ChronoUnit.DAYS.between(dateIn,dateOut);
    }
    public static void main(String[] args) {
        ArrayList<guest> ds= new ArrayList<>();
        try{
            Scanner reader=new Scanner(new File("file23.txt"));
            int maKh=reader.nextInt();
            reader.nextLine();
            for (int i =1;i<=maKh;i++){
                String fullName=reader.nextLine();
                String idRoom=reader.nextLine();
                String ngayVao=reader.nextLine();
                String ngayRa=reader.nextLine();
                // reader sucess
                ds.add(new guest(guest.sinhMaKh(i),fullName,idRoom,tinhLengthOfStay(ngayVao,ngayRa)));
            }
            ds.sort(Comparator.comparing(guest::getLengthOfStay ).reversed());
            for (guest x:ds){
                System.out.println(x);
            }


        }catch(FileNotFoundException e){

        }
    }


}
