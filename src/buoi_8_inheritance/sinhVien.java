package buoi_8_inheritance;

public class sinhVien {
    protected String name ;
    protected double id;
    protected double price;
    protected double tax;


// constructor không được có void chỉ có public và tên của class trên thôi nhé
    public  sinhVien(String name,double id , double price, double tax){
        this.name=name;
        this.id=id;
        this.price=price;
        this.tax=tax;
    }

    public void getSinhVien(){
        System.out.println("Lấy thông tin sinh viên ");
    }
    public double getPricetax(){
        return this.price *this.tax;
    }
    private double getHocPhiGoc(){
        return this.price +getPricetax();
    }
    public double getTongHocPhiMoi(){
        return this.price +getPricetax();
    }
    public void hienThiThongTin(){
        System.out.println("tên là "+this.name);
        System.out.println("id là "+this.id);
        System.out.println("price before tax "+this.price);
        System.out.println("tax % là "+this.tax);
        System.out.println("tiền  thuế là "+getPricetax());
        System.out.println("======");
        System.out.println("+   +");
        System.out.println("+   +");
        System.out.println("+   +");
        System.out.println("Tổng số tiền phải đóng là ");
        System.out.println("       "+getHocPhiGoc() );
    }

}
