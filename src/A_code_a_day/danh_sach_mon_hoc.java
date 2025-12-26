package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class subject{
    String id ;
    String name;
    int sotin;
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSotin(){
        return sotin;
    }
    public String toString(){
        return id+" "+name+" "+sotin;
    }
    public subject(String id , String name, int sotin){
        this.sotin=sotin;
        this.name=name;
        this.id=id;
    }

}
public class danh_sach_mon_hoc {
    public static void main(String[] args) {
        File file=new File("file23.txt");
        ArrayList <subject> mang=new ArrayList<>();
        try{

            Scanner reader=new Scanner(file);
            int test =reader.nextInt();
            reader.nextLine();
            for (int i =0;i<test;i++){
                String id=reader.nextLine();
                String name=reader.nextLine();
                int sotin = Integer.parseInt(reader.nextLine());
//              lưu ý cần thêm reader.nextLine này để dọn dẹp cái thằng enter thừa

                mang.add(new subject(id,name,sotin));

            }
            mang.sort(Comparator.comparing(subject::getName));
            for (subject x:mang){
                System.out.println(x);
            }
        }catch(FileNotFoundException e){

        }
    }

}
