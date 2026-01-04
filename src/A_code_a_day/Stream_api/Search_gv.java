package A_code_a_day.Stream_api;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class giangVien2{
    String id;
    String name;
    String monDay;
    String kyHieuMon;

    public giangVien2(int id, String name,String monDay){
        this.id=sinhId(id);
        this.name=name;
        this.monDay=monDay;
        this.kyHieuMon=layKyHieu(monDay);

    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    private String sinhId(int id){
        return String.format("GV%02d",id);
    }
    public static String layKyHieu(String name){
        String [] mang=name.toUpperCase().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String x:mang){
            String kytudau=x.substring(0,1);
            sb.append(kytudau);
        }
        return sb.toString().trim();
    }
    public String toString(){
        return id+" "+name+" "+kyHieuMon;
    }
    public String getKyHieuMon(){
        return kyHieuMon;
    }

}
public class Search_gv {
    public static void main(String[] args) {
        ArrayList<giangVien2> ds=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            int id=i;
            String name=sc.nextLine();
            String monDay=sc.nextLine();
            ds.add(new giangVien2(id,name,monDay));
        }
        int q=Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            String input=sc.nextLine();
            String chuanInput=input.toLowerCase();
            List<giangVien2> dsLoc1= ds.stream().filter(sv->sv.getName().toLowerCase().contains(chuanInput))
                    .collect(Collectors.toList());
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n",input);
            System.out.println();
            for(giangVien2 x:dsLoc1){
                System.out.println(x);
            }


        }
    }
}
