package baitaplab4;




public class Product {
    private String name;
    private double price;
    private double tax;
    public void nhapThongTin(String name, double price, double tax){
        this.name=name;
        this.tax=tax;
        this.price=price;

    }
    public void setName(String newName){
        this.name=newName;
    }
    public double getTax(){
        return this.tax;
    }
    public void xuatThongTin(){
        System.out.println("tên là " +name+" giá là "+price+" thuế là  "+tax);
    }
    public double getTaxPrice(){
        double b =price*tax;
        System.out.println("sẽ có giá  thuế là "+b);
        return b;
    }

}
