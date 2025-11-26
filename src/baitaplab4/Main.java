package baitaplab4;

public class Main {


    public static void main(String[] args) {
        Product test=new Product();
        test.nhapThongTin("messi",5000,0.12);
        test.setName("ronaldo");//để gán dùng set
        System.out.println(test.getTax());
        test.xuatThongTin();
        test.getTaxPrice();

    }

}
