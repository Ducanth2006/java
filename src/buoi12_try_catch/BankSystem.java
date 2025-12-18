package buoi12_try_catch;

// phân biệt check và uncheck exception
// checked là cái khách quan gây ra ta không biết được là nó sẽ có lỗi hay ko kiểu api này file này .... phải dùng try catch
// unchecked là cái chủ quan chúng ta ko nhất thiết cần dùng try catch , có thể dùng if else
public class BankSystem {

    // Hàm rút tiền có khai báo 'throws' vì nó chứa Checked Exception
    public static void withdraw(double balance, double amount) throws Exception {

        // 1. Kiểm tra Unchecked Exception (Lỗi logic)
        if (amount <= 0) {
            // Chúng ta không bắt buộc phải try-catch ở đây vì đây là lỗi do lập trình/nhập liệu
            throw new IllegalArgumentException("Số tiền rút phải lớn hơn 0!");
        }

        // 2. Kiểm tra Checked Exception (Tình huống cần xử lý)
        if (amount > balance) {
            // Java bắt buộc bạn phải xử lý hoặc khai báo throws cho Exception này
            throw new Exception("Số dư không đủ để thực hiện giao dịch.");
        }

        System.out.println("Rút tiền thành công: " + amount);
    }

    public static void main(String[] args) {
        try {
            // Thử rút tiền
            withdraw(100.0, 150.0);

        } catch (IllegalArgumentException e) {
            // Xử lý lỗi Unchecked nếu có
            System.out.println("Lỗi nhập liệu: " + e.getMessage());

        } catch (Exception e) {
            // Xử lý lỗi Checked (Số dư không đủ)
            System.out.println("Thông báo ngân hàng: " + e.getMessage());

        } finally {
            System.out.println("Cảm ơn bạn đã sử dụng dịch vụ.");
        }
    }
}
