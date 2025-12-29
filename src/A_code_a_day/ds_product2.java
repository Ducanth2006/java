package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class product{
    String id;
    String name;
    long price;
    long warranty;
    public product(String id, String name, long price,long warranty){
        this.id=id;
        this.name=name;
        this.price=price;
        this.warranty=warranty;
    }
    public long getPrice(){
        return price;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+price+" "+warranty;
    }

}
public class ds_product2 {
    public static void main(String[] args) {
        ArrayList<product> ds=new ArrayList<>();
        try{
            Scanner reader=new Scanner(new File("file23.txt"));
            int test=reader.nextInt();
            reader.nextLine();
            for (int i =0;i<test;i++){
                String id=reader.nextLine();
                String name=reader.nextLine();
                long price=Long.parseLong(reader.nextLine());
                long warranty=Long.parseLong(reader.nextLine());
                ds.add(new product(id,name,price,warranty));
            }
            ds.sort(Comparator.comparing(product::getPrice).reversed().thenComparing(product::getId));
            for (product x:ds){
                System.out.println(x);
            }
        }catch(FileNotFoundException e){

        }
    }

}
