package failure.CodePtit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hoanViBt {
    private static int n;
    private static int[] a;
    private static boolean[] isUsed;
    private static List<Integer> currentPermutation = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();

        // Khoi tao mang danh dau (mac dinh la false)
        isUsed = new boolean[n + 1];

        System.out.println("Cac hoan vi cua tap hop {1, 2, ..., " + n + "}:");
        backtrack(1);

        sc.close();
    }
    public static void backtrack(int i) {
        for (int j = 1; j <= n; j++) {
            // Neu phan tu j chua duoc su dung
            if (!isUsed[j]) {
                currentPermutation.add(j); // Chon j cho vi tri i
                isUsed[j] = true;          // Danh dau da dung

                // Neu da du n phan tu thi in ra
                if (currentPermutation.size() == n) {
                     printResult();
                } else {
                    // Neu chua du, tiep tuc de quy tim vi tri i + 1
                    backtrack(i + 1);
                }

                // --- BUOC QUAY LUI (BACKTRACK) ---
                // Xoa phan tu cuoi cung va bo danh dau de thu cac kha nang khac
                currentPermutation.remove(currentPermutation.size() - 1);
                isUsed[j] = false;
            }
        }
    }
    private static void printResult() {
        System.out.println(currentPermutation);
    }
}
// tại sao khi chạy đến 1,2,3 nó lại có thể quay lại để chuyênr thành 1 3 2
// do nó đã thực hiện xong điều kiện if else ở vòng j =3 tại backtrack 3 suy ra nó remove bỏ số 3 mảng còn lại là 1 2 và [T,T,F]
// tiếp tục nó  quay lại bước backtrack 2 j =2 sau khi gọi xong backtrack 3 thì nó thoát if else rồi thực remove 2 khi đó mảng còn lại lại là [1.] và [T,F,F]
// tiếp tục nó sẽ đi đến j =3 rồi add 3 vào mảng [1,3] , sau đó đi vào else r gọi backtrack(3)
// backtrack3 lại bắt đầu duyệt từ j =1 cho đến 3  skip j =1, tiếp tục đi vào j =2 à isUsed(2) đang là false suy ra ko skip add vào mảng [1,3,2] kiểm tra if
// đã thấy đủ prinr ra và loại bỏ vị trí này tức [1,3]
// quay trở lại j=3 sau khi gọi backtrack trong if else tiếp tục  bỏ vị trí cuối cùng [1] và [T,F,F]
// quay trở lại backtrack 1 khi ở j =1 thoát if else tiếp tục loại bỏ vị trí cuối cùng suy ra mảng rỗng và [F,F,F];
// bắt đầu thêm 2 vào rồi do tiếp