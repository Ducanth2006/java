package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class so_khac_nhau_trong_file_1 {
    public static void check(ArrayList<Integer> lst, int n) {
        Map<Integer, Integer> chuoi = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (chuoi.get(lst.get(i)) == null) {
                chuoi.put(lst.get(i), 1);
            } else {
                chuoi.put(lst.get(i), chuoi.get(lst.get(i)) + 1);
            }
        }
        TreeMap<Integer, Integer> chuoi1 = new TreeMap<>(chuoi);
        for (Integer key : chuoi1.keySet()) {
            System.out.printf("%d %d\n", key, chuoi1.get(key));
        }

    }


    public static void main(String[] args) {
        File file = new File("DATA.in");
        try {
            Scanner reader = new Scanner(file);
            ArrayList<Integer> lst = new ArrayList<>();
            while (reader.hasNext()) {
                lst.add(reader.nextInt());
            }
            int n = lst.size();
            check(lst, n);

        } catch (FileNotFoundException e) {

        }
    }
}
