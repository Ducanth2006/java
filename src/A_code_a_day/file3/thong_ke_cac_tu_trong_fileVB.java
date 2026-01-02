package A_code_a_day.file3;

import java.io.File;
import java.io.IOException;
import java.util.*;

class word{
    String xau;
    long n;
    public word(String xau,long n){
        this.xau=xau;
        this.n=n;
    }

    public String getXau(){
        return xau;
    }

    public long getN(){
        return n;
    }


    @Override
    public String toString() {
        return xau+" "+n;
    }
}
public class thong_ke_cac_tu_trong_fileVB {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("VANBAN.in"));
        Map<String, Integer> ds = new TreeMap<>();
        ArrayList<word> ds1 = new ArrayList<>();
        // đoạn này mới này , xử lý mới cái thừa kiểu kí hiệu áy
        int test=reader.nextInt();
        reader.nextLine();
        for (int i=0;i<test;i++){
            while(reader.hasNext()){
                String line = reader.nextLine(); // Đọc cả dòng văn bản
                // nch để xử lý thì nên cắt bỏ nhé

                // Cắt dòng đó thành các từ con, chỉ giữ lại chữ và số
                // Bất cứ ký tự đặc biệt nào (kể cả dấu cách) đều bị coi là nhát cắt
                String[] words = line.split("[^a-zA-Z0-9]+");

                for(String s : words){
                    String word = s.toLowerCase();
                    if(!word.isEmpty()){
                        if(ds.get(word)==null){
                            ds.put(word,1);
                        }
                        else {
                            ds.put(word, ds.get(word) + 1);
                        }
                    }
                }
            }

        }
        ds.forEach((key,value)->{
            ds1.add(new word(key,value));
        });
        ds1.sort(Comparator.comparing(word::getN).reversed().thenComparing(word::getXau));
        for(word s:ds1){
            System.out.println(s);
        }
    }
}


