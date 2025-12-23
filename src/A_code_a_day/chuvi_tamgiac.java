package A_code_a_day;

import java.util.Scanner;

class points{
    double x;
    double y;
    public points(){
    }
    public points(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getY(){
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
   public static boolean check(double x1,double x2,double x3,double y1,double y2,double y3){
        if ((y2-y1)*(x3-x2)==(y3-y2)*(x2-x1)){
            return false;
        }
        else{
            return true;
        }
   }

}
public class chuvi_tamgiac {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for (int i =0;i<test;i++){
            double x1= sc.nextDouble();
            double y1= sc.nextDouble();
            double x2= sc.nextDouble();
            double y2= sc.nextDouble();
            double x3= sc.nextDouble();
            double y3= sc.nextDouble();
            if (points.check(x1,x2,x3,y1,y2,y3)){
                double ab=Math.sqrt(Math.pow(x1-x2,2)+Math.pow((y1-y2),2));
                double ac=Math.sqrt(Math.pow(x1-x3,2)+Math.pow((y1-y3),2));
                double bc=Math.sqrt(Math.pow(x2-x3,2)+Math.pow((y2-y3),2));
                System.out.printf("%.3f\n",ab+bc+ac);

            }
            else{
                System.out.println("INVALID");
            }
        }



    }

}
//mẹ cái lỗi double nhập vào input làn sau đặt cho tử tế