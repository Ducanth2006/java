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
            char[] characters = s.toCharArray();// để ép String sang một mảng char thì sử dụng toCharArray
            Arrays.sort(characters);// Sort làm thay đổi giá trị ban đầu của mảng

            // Bước 2: Tạo key từ mảng đã sắp xếp
            String key = String.valueOf(characters); // Để ép kiểu từ một mảng các ký tự sang string thì dùng String.valueOf

            // Bước 3: Nếu key chưa tồn tại, khởi tạo một List mới
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());//Why isn't a list ? bởi vì list ko sử dụng được add or remove
            }

            // Bước 4: Thêm chuỗi gốc vào nhóm tương ứng với key
            map.get(key).add(s); //dù thế nào đi chăng nữa thì cũng sẽ phải add nó vào nhé
            // vì là một mảng lên ta cần lấy value sau đó mới sử dụng add được nhé
        }

        // Bước 5: Trả về danh sách các List con (chính là các values của map)
//        nếu là một map bình thường nó sẽ như thế này ({key1:value1},{key2:value2})
//        khi sử dụng map.values() nó sẽ trả về (value1 và value2)
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
//Giải thích  luồng: đầu tiên ta khởi tạo một hashmap(String,List<String>)
// sau đó ta dùng vòng loop để lặp qua các phần tử của mảng string cho sẵn
// sau đó ta dùng biến.toCharArray() để phân rã các ký tự của String đó thành mảng các ký tự
// rồi ta sử dụng hàm Array.sort() để sắp xếp chữ cái theo chuỗi Ascii
// Sắp xếp với mục địch để tạo ra một key nếu đó là các anagram
// sau khi săps xếp xong ta sử dụng String.valueOf() để ép kiểu từ các mảng đã đc sort sang một String hoàn chỉnh để làm key
// ta có một điều kiện if để kiểm tra xem cái key đó đã exist chưa nếu ch put nó vào với String hoàn chỉnh đó là
// key và value =new ArrayList<String> tại sao phải là Array mà ko phải list vì list ko sử dụng được add
// thoát khỏi điều kiện kiểm tra đó ta sẽ phải add nó vào dù nó có điều kiện thỏa mã chưa tồn tại hay ko
// vì value là một array nên ta phải gọi get sau đó mới add được , vì ta dùng những string ban đầu để gán suy ra string đó
// chưa thay đổi j cả nên ta addd string đó vào mảng
//cuối cùng ta trả về một new arraylist(map.values()) , map.values trả về một collection ko phải list nhé nên phải ép kiểu
