package b2;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] a;//Khai báo array
        String[] b = {"messi", "ronaldo", "lukaku"};// khai báo cộng giá trị
        String[] c = new String[4];// 4 ở đây là có 4 phần tử
        c[0] = "vini";
        c[1] = "kane";
        System.out.println(Arrays.toString(c));
        // vòng for cho array
        System.out.println("sử dụng for bình thường");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("========");
        System.out.println("Sử dụng for each đặc thù cho array");
        for (String car : cars) {
            System.out.println(car);
        }

    }
}


