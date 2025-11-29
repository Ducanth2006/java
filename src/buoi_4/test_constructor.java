package buoi_4;

public class test_constructor {
    String name;
    int age;

    public test_constructor(String name1, int age) {
        this.name = name1;
        this.age = age;
    }

    public static void main(String[] args) {
        test_constructor a1 = new test_constructor("messi", 18);
        System.out.println(a1.name + " năm nay " + a1.age + " years old");
    }
}
