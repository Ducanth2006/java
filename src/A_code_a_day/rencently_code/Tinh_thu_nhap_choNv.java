package A_code_a_day.rencently_code;

import java.util.*;
import java.util.stream.Collectors;

class nV{
    String id;
    String name;
    String position;
    long luongNgay;
    int soNgayCong;
    long phuCap;
    long luongChinh;
    long tamUng;
    long thuNhap;
    long conLai;
    public nV(int id,String name,String position,long luongNgay,int soNgayCong){
        this.id=sinhId(id);
        this.name=name;
        this.position=position;
        this.soNgayCong=soNgayCong;
        this.phuCap=tinhPhuCap(this.position);
        this.luongNgay=luongNgay;
        this.luongChinh=this.luongNgay*this.soNgayCong;
        this.tamUng=tinhTienUng(this.phuCap,this.luongChinh);
        this.conLai=this.luongChinh+this.phuCap-this.tamUng;
        this.thuNhap=this.luongChinh+this.phuCap;
    }
    public String getPosition(){
        return position;
    }
    private String sinhId(int i){
        return String.format("NV%02d",i);
    }
    public String getId(){
        return id;
    }
    public long getThuNhap(){
        return thuNhap;
    }

    private long tinhPhuCap(String s){
        long tienPc=0;
        if(s.equals("GD")){
            tienPc=500;
        }
        else if(s.equals("PGD")){
            tienPc=400;
        }
        else if(s.equals("TP")){
            tienPc=300;
        }
        else if(s.equals("KT")){
            tienPc=250;
        }
        else{
            tienPc=100;
        }
        return tienPc;
    }
    private long tinhTienUng(long pc,long l){
        long tienUng=0;
        long giaTriTam = (pc + l) * 2 / 3;
        if(giaTriTam<25000){
            tienUng=Math.round(giaTriTam/1000.0)*1000;
        }
        else if(giaTriTam>=25000){
            tienUng=25000;
        }
        return tienUng;
    }
    public String toString(){
        return id+" "+name+" "+phuCap+" "+luongChinh+" "+tamUng+" "+conLai;
    }

}
public class Tinh_thu_nhap_choNv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<nV> ds=new ArrayList<>();
        int test=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=test;i++){
            String name=sc.nextLine();
            String position=sc.nextLine();
            long luongNgay=Long.parseLong(sc.nextLine());
            int soNgayCong=Integer.parseInt(sc.nextLine());
            ds.add(new nV(i,name,position,luongNgay,soNgayCong));
        }
        ds.sort(Comparator.comparing(nV::getThuNhap).reversed().thenComparing(nV::getId));
        for(nV x:ds){
            System.out.println(x);
        }
    }

}
