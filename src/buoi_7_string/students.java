package buoi_7_string;

public class students {
    public String name;

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }// giữ vào các attribute sau đó bấm chuột phải rồi nhấn generate sau đó chọn to string

    public int id;

    public students(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
