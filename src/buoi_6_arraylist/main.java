package buoi_6_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.youtube.com/watch?v=qGyU-p_8zRA link youtube phần 1
//https://www.youtube.com/watch?v=FvK5HO3oWDo link youtube học phần này
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> lst1 = new ArrayList<>();
//      thêm 3 phần tử 1,2,3
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
//      thêm tại vị trí nào , thêm cái j
//      add (index , value) chèn thêm giá trị vào vị trí
        lst1.add(0, 0);
        System.out.println("giá trị mạng ban đầu là " + lst1);
//      hiển thị số phần tử trong list dùng  size()
        int number = lst1.size();// 3
        System.out.println(number);
//      Lấy ra giá trị tại index chỉ định dùng get(index)
        System.out.println(lst1.get(1));//2
//      Thêm số 4 vào loại bỏ nó luôn dùng remove(index)
        lst1.add(4);
        lst1.remove(3);
        System.out.println(lst1);//  [0124]
//      Ta có thể dùng remove(Integer.valueof(giá trị cần xóa )) để xóa giá trị cần xóa mà ko cần index
        lst1.add(1, 2);
        lst1.add(2);
        System.out.println("ta thêm bừa bộn số 2 vào " + lst1);
        lst1.remove(Integer.valueOf(2));// thằng này chỉ xóa 1 cái 2 đầu tiên  thôi duyệt từ index 0->n
        System.out.println("Ls1 sau khi xóa giá trị " + lst1);
//      Set(index,value) dùng để đặt element vào vị trí chỉ định
        lst1.set(3, 2);
        System.out.println("sau khi ta đặt set thì ls1 sẽ là " + lst1);

//      Dùng contains()    Kiểm  tra xem có chứa giá trị nào đó ko
        ArrayList<Integer> lst2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        Boolean test = lst2.contains(5);
        Boolean test2 = lst2.contains(9);
        System.out.println("Có chứa 5 ko ?" + test + "\ncó chứa 9 ko ? " + test2);

//      Dùng collection.sort() để sắp xếp lại các phần tử trong arraylist
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1, 42, 3, 34, 5, 6, 7));
        Collections.sort(lst3);
        System.out.println("Khi được sắp xếp lại " + lst3);
        System.out.println("để đảo lại theo thứ tự giảm dần ");
        Collections.sort(lst3, Collections.reverseOrder());
        System.out.println("Giảm dần " + lst3);

//      Kiểm tra list có rỗng hay ko
        ArrayList<Integer> lst4 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer> lst5 = new ArrayList<>();
        Boolean kt = lst4.isEmpty();
        Boolean kt1 = lst5.isEmpty();
        System.out.println("lst4 là mảng rỗng đúng ko ? " + kt);
        System.out.println("lst5 là mảng rỗng đúng ko ?" + kt1);


    }

}
