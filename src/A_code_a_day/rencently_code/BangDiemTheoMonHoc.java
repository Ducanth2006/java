package A_code_a_day.rencently_code;

import java.io.File;
import java.io.IOException;
import java.util.*;

class subject{
    private String maMon;
    private String tenMon;
    int soTin;
    public subject(String maMon,String tenMon){
        this.maMon=maMon;
        this.tenMon=tenMon;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
}
class sinhvien1111 {
    private String id;
    private String name;
    private String lop;
    private String email;

    public sinhvien1111(String id, String name, String lop, String email) {
        this.id=id;
        this.name=chuanHoaName(name);
        this.lop=lop;
        this.email=email;
    }
    private String chuanHoaName(String n){
        String [] mang=n.trim().toLowerCase().split("\\s+");
        StringBuilder sb= new StringBuilder();
        for(String x:mang){
            String wordChuan=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase();
            sb.append(wordChuan).append(" ");
        }
        return sb.toString().trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
class BangDiem2 {
    String msv;
    String maMonHoc;
    double diem;
    String tenSV;
    String lop;
    public BangDiem2(String msv, String maMonHoc, double diem, String tenSV, String lop){
        this.msv=msv;
        this.maMonHoc=maMonHoc;
        this.diem=diem;
        this.tenSV=tenSV;
        this.lop=lop;

    }
    private String kt(double x){
        if (x==(int) x){
            return String.format("%d",(int) x);
        }
        else{
            return String.format("%.1f",x);
        }
    }
    public String toString(){
        return msv+" "+tenSV+" "+lop+" "+kt(diem);
    }
    public double getDiem(){
        return diem;
    }
    public String getMsv(){
        return msv;
    }


}
public class BangDiemTheoMonHoc {
    public static void main(String[] args) throws IOException {
        Scanner r1= new Scanner(new File("file1.txt"));
        Scanner r2= new Scanner(new File("file2.txt"));
        Scanner r3= new Scanner(new File("file3.txt"));
        ArrayList<sinhvien1111> ds= new ArrayList<>();
        int t1=Integer.parseInt(r1.nextLine());
        for(int i=1;i<=t1;i++){
            String id=r1.nextLine();
            String name=r1.nextLine();
            String lop=r1.nextLine();
            String email=r1.nextLine();
            ds.add(new sinhvien1111(id,name,lop,email));
        }

        Map<String,String> map2= new HashMap<>();
        int t2=Integer.parseInt(r2.nextLine());
        for(int i=1;i<=t2;i++){
            String maMon= r2.nextLine();
            String tenMon=r2.nextLine();
            int soTinCHi=Integer.parseInt(r2.nextLine());
            map2.put(maMon,tenMon);
        }
        ArrayList<BangDiem2> ds3= new ArrayList<>();

        int t3=Integer.parseInt(r3.nextLine());
        for(int i=1;i<=t3;i++){
            String line=r3.nextLine();
            String [] mang=line.trim().split("\\s+");
            String msv=mang[0];
            String maMon=mang[1];
            double diem=Double.parseDouble(mang[2]);
            String nameSv="";
            String lop="";
            for(sinhvien1111 x:ds){
                if(x.getId().equals(msv)){
                    nameSv=x.getName();
                    lop=x.getLop();
                }

            }
            ds3.add((new BangDiem2(msv,maMon,diem,nameSv,lop)));
        }
        ds3.sort(Comparator.comparing(BangDiem2::getDiem).reversed().thenComparing(BangDiem2::getMsv));
        int t4=Integer.parseInt(r3.nextLine());
        for(int i=1;i<=t4;i++){
            String q=r3.nextLine();
            //q là maMonHoc
            // đọc thành công
            System.out.printf("BANG DIEM MON %s:\n",map2.get(q));
            for(BangDiem2 x:ds3){
                if(x.maMonHoc.equals(q)){
                    System.out.println(x);
                }
            }

        }


    }

}

