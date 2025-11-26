package lab4oop;

public class testLearnEscapsulation {


    public static void main(String[] args) {
        learnEscapsulation l1 = new learnEscapsulation("red", 30);

        l1.setSoLuong(20);// 22 sai do không attribute soLuong đã để private ==>dùng set để gán giá trị lại
        System.out.println("Hàng có thông tìn là : " + l1.getMau() + " and" + " " + l1.getSoluong()); //cũng như trên ==>dùng get để
//        để lấy giá trị rồi sử dụng


    }

}
