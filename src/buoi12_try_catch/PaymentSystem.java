package buoi12_try_catch;

// phân biệt throws and throw
public class PaymentSystem {
    public static void pay(double money) throws Exception {
        if (money < 0) {
            // Bước 2: Dùng 'throw' để ném lỗi cụ thể nếu tiền âm
            throw new Exception("Số tiền không thể âm!");// lỗi chung chung tức là đặt là Exception
            // nếu đây là Exception thì tên hàm must có throws Exception
            // nếu ta đặt lỗi chính xác tức là unchecked thì ko cần dùng throws
        }
        System.out.println("Thanh toán thành công: " + money);
    }

    public static void main(String[] args) {
        try {
            // Vì hàm pay() có 'throws', nên main bắt buộc phải dùng try-catch
            pay(-100);
        } catch (Exception e) {
            System.out.println("Xử lý lỗi: " + e.getMessage());
        }
    }
}
