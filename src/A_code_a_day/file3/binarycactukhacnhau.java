package A_code_a_day.file3;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;

class word1 {
    String k;
    int v;

    public word1(String k) {
        this.k = k;
        this.v = 0;
    }

    public String toString() {
        return k + " " + v;
    }

    public int getV() {
        return v;
    }

    public String getK() {
        return k;
    }
}

public class binarycactukhacnhau implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ds = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> tho = (ArrayList<String>) ds.readObject();
        Set<String> setDs = new HashSet<>();
        Map<String, Integer> mapDS = new HashMap<>();
        ArrayList<word1> dsChuan = new ArrayList<>();
        for (String x : tho) {
            String[] ds1 = x.trim().toLowerCase().split("[^0-9a-zA-Z]+");
            for (String k : ds1) {
                // bắt buộc phải kiểm tra thằng xem trôngs ko nhé tại thằng split nó sẽ cắt cả chuỗi rổng cho vào đó
                if (!k.isEmpty()) {
                    mapDS.put(k, mapDS.getOrDefault(k, 0) + 1);
                    // phải kiểm tra xem nó có lặp ko , cả ko lưu lặp đâu nhé
                    if (setDs.add(k)) {
                        dsChuan.add(new word1(k));
                    }
                }
            }
        }
        for (word1 x : dsChuan) {
            x.v = mapDS.get(x.k);
        }
        dsChuan.sort(Comparator.comparing(word1::getV).reversed().thenComparing(word1::getK));
        for (word1 k : dsChuan) {
            System.out.println(k);
        }

    }
}
