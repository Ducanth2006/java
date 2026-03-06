package Arrayandhasing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.*;

class SolutionGroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Khai báo HashMap: Key là chuỗi đã sắp xếp, Value là danh sách các từ đồng hình
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Bước 1: Chuyển chuỗi thành mảng char để sắp xếp
            char[] characters = s.toCharArray();
            Arrays.sort(characters);

            // Bước 2: Tạo key từ mảng đã sắp xếp
            String key = String.valueOf(characters);

            // Bước 3: Nếu key chưa tồn tại, khởi tạo một List mới
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Bước 4: Thêm chuỗi gốc vào nhóm tương ứng với key
            map.get(key).add(s);
        }

        // Bước 5: Trả về danh sách các List con (chính là các values của map)
        return new ArrayList<>(map.values());
    }
}
public class groupanagram {
    public static void main(String[] args) {
        String[] kq={"eat","tea","tan","ate","nat","bat"};
        SolutionGroupAnagram qk=new SolutionGroupAnagram();
        System.out.println(qk.groupAnagrams(kq));

    }
}

