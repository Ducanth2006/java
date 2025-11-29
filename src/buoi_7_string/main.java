package buoi_7_string;

import java.util.ArrayList;
import java.util.Collections;


public class main {
    public static void main(String[] args) {
        students st1 = new students("messi", 1);
        students st2 = new students("ronaldo", 2);
        students st3 = new students("rô béo", 3);
        students st4 = new students("popa", 4);
        students st5 = new students("chicken", 5);
        students[] all_Students = {st1, st2, st3, st4, st5};
        ArrayList<students> classes = new ArrayList();
        Collections.addAll(classes, all_Students);
        System.out.println("== danh sách tất cả sinh viên == ");
        System.out.println("sinh viên " + classes);
        System.out.println("== danh sách sinh viên có tên bát đầu bằng r ");
        for (students stu : classes) {
            if (stu.name.startsWith("rô")) {
                System.out.println("sinh viên " + stu.name);
            }

        }


    }
}
