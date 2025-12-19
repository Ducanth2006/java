package A_code_a_day;

import java.util.Scanner;

public class POINT {
    double x;
    double y;


    public POINT(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "POINT{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static double dis(POINT point1, POINT point2) {
        double dx = point2.x - point1.x;
        double dy = point2.y - point1.y;
        return Math.sqrt(dx * dx + dy * dy);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int q = 0; q < test; q++) {
            POINT point1 = new POINT(sc.nextDouble(), sc.nextDouble());
            POINT point2 = new POINT(sc.nextDouble(), sc.nextDouble());
            double result = POINT.dis(point1, point2);
            System.out.printf("%.4f\n", result);


        }
    }
}
