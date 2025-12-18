package buoi10_interface;

//Interface được thiết kế để định nghĩa hành động (Action) và
// các thông số chung (ví dụ: số Pi, mã lỗi...). Nó không quan tâm đến "trạng thái" của đối tượng.
interface IAnimal {
    void keu();// mặc định các phương thức trong inteface là public và luôn luôn là v bất biến

    void run();

    String hit_tho = "oxy";// bất biến
}
