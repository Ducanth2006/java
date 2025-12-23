package A_code_a_day;

import java.util.Scanner;

public class Rectange {
    double width;
    double height;
    String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static double findArea(double height, double width) {
        return height * width;
    }

    public static double findPerimeter(double h, double w) {

        return (h + w) * 2;
    }
// cần nhớ
    public static String capitalize(String color) {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {
            Rectange hcn = new Rectange(width, height, color);
            System.out.println((int) findPerimeter(height, width) + " " + (int) findArea(height, width) + " " + capitalize(color));
        }
    }

}
