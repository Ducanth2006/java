package A_code_a_day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Liet_ke_tu_khac_nhau {
    public static void main(String[] args) {
        Set<String> giaonhau= new TreeSet<>();
        File file= new File("VANBAN.in");
        try{
            Scanner reader=  new Scanner(file);

            while(reader.hasNext()){
                giaonhau.add(reader.next().toLowerCase());
            }
            for (String i :giaonhau){
                System.out.println(i);
            }
        }catch(FileNotFoundException e){

        }
    }
}
