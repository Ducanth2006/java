package A_code_a_day.baitoancon;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class gamer{
    String id;
    String name;
    LocalTime gioVao;
    LocalTime  gioRa;
    String timeChoi;
    long sum_minute;
    public gamer(String id,String name,String gioVao,String gioRa){
        this.id=id;
        this.name=name;
        this.gioVao=LocalTime.parse(gioVao);
        this.gioRa=LocalTime.parse(gioRa);
        this.sum_minute=tinhSoPhut(this.gioVao,this.gioRa);
        this.timeChoi=tinhTimeChoi(this.gioVao,this.gioRa);
    }
    public long getSum_minute(){
        return sum_minute;
    }
// do trình duyệt code dùng java 8
//    private String tinhTimeChoi(LocalTime in, LocalTime out){
////        LocalTime giovao =LocalTime.parse(in);
////        LocalTime giora=LocalTime.parse(out);
//        Duration duration=Duration.between(in,out);
//        long h=duration.toHours();
//        long m=duration.toMinutesPart();
//        return String.format("%d gio %d phut",h,m);
//    }
private String tinhTimeChoi(LocalTime in, LocalTime out){
    Duration duration = Duration.between(in, out);

    // Bước 1: Lấy tổng số phút (Java 8 hỗ trợ tốt hàm này)
    long totalMinutes = duration.toMinutes();

    // Bước 2: Dùng toán học để tách giờ và phút
    long h = totalMinutes / 60;   // Lấy phần nguyên là số giờ
    long m = totalMinutes % 60;   // Lấy phần dư là số phút lẻ

    return String.format("%d gio %d phut", h, m);
}
    private long tinhSoPhut(LocalTime in, LocalTime out){
        Duration duration=Duration.between(in,out);
        long k=duration.toMinutes();
        return k;
    }
    public String toString(){
        return id+" "+name+" "+timeChoi;
    }

}
public class TinhGio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<gamer> ds=new ArrayList<>();
        int test=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<test;i++){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String gioVao=sc.nextLine();
            String gioRa=sc.nextLine();
            ds.add(new gamer(id,name,gioVao,gioRa));

        }
        ds.sort(Comparator.comparing(gamer::getSum_minute).reversed());
        for(gamer x:ds){
            System.out.println(x);
        }
    }
}
