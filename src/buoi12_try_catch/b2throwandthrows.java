package buoi12_try_catch;

import java.util.Scanner;

public class b2throwandthrows {
    public static void checkAge(int age) throws Exception {
        if (age < 0 || age > 110) {
            throw new Exception("Không tồn tại tuổi này ");// vì có cái này tên hàm của ta ms có throws Exception
        }
        if (age < 18) {
            throw new ArithmeticException("Em chưa đủ 18 nhé");
        }


        if (age > 18) {
            System.out.println("Em 18 rồi à ngon thí ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuổi hiện tại của tôi là :");
        int a = sc.nextInt();
//        checkAge(19); do có throw ==> bọc nó bằng try catch
        try {
            checkAge(a);

        } catch (ArithmeticException ame) {
            System.out.println("Error :" + ame.getMessage());

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());

        } finally {
            System.out.println("Completed information ");
        }
    }
}
