package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class monthi{
    String id;
    String ten;
    String hinhThucThi;
    public monthi(String id, String ten,String hinhThucThi){
        this.hinhThucThi=hinhThucThi;
        this.id=id;
        this.ten=ten;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id +" "+ten+" "+hinhThucThi;
    }

}
public class ds_monthi {
    public static void main(String[] args) {
        ArrayList<monthi> ds=new ArrayList<>();
        try{
            Scanner reader= new Scanner(new File(" MONHOC.in"));
            int test=reader.nextInt();
            reader.nextLine();
            for (int i=0;i<test;i++){
                String id=reader.nextLine();
                String ten=reader.nextLine();
                String hinhThucThi=reader.nextLine();
                ds.add(new monthi(id,ten,hinhThucThi));
            }
            ds.sort(Comparator.comparing(monthi::getId));
            for(monthi x:ds){
                System.out.println(x);
            }
        }catch(FileNotFoundException e){

        }
    }
}
