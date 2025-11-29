package buoi_6_arraylist;

import java.util.ArrayList;

public class concept_array_list {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();// bên trái ta có thể để <> thay vì <String>
        cars.add("audi");
        cars.add("toyota");
        cars.add("mecrs");
        System.out.println("Các xe hiện tại là " + cars);
        System.out.println(cars.stream().count());//=size
        System.out.println(cars.get(2) + " is my best brand car");
        cars.remove(0);
        System.out.println("sau khi đã bán thì tôi còn " + cars);
    }
}
