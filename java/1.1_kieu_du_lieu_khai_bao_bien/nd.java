public class nd {
    public static void main(String[]args){
        int a,b,c;
        a=10;
        b=399;
        c=89384;
        long f=1009394500L; // khi mot so lon thi can them L vao cuoi vi luc dau se hieu la int
        float d=2.28374F;            // neu 2.2 thi no se coi la double
        double r=3.73984739847;
        char kiTu ='a';          // phai dat chu cai dau viet thuong con lai thi viet hoa cac chu cai dau cua nhung tu 
        // trong nhay don la ky tu con trong nhay kep la chuoi
      
        boolean check=true ;
        System.out.println(f);//print which has not ln won't down new line 
        System.out.printf("Giá trị của a là %d\n ",f);
        System.out.printf("Giá trị của r là  %.5f , giá trị của d là%.3f\n",r,d);
        System.out.printf("%.3f\n",r);
        System.out.println("Giá trị tổng của a và b là" +" " +(a+b));
        System.out.println("Các giá trị ta có là " +a +" "+ b+" "+c +kiTu);
        System.out.println("Giá trị của check: " + check);



    
    }

}
