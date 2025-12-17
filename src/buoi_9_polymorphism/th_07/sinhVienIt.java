package buoi_9_polymorphism.th_07;

public class sinhVienIt extends sinhVien {
    double java_Score;
    double python_Score;

    public sinhVienIt(String name, double java_Score, double python_Score) {
        super(name);
        this.java_Score = java_Score;
        this.python_Score = java_Score;
    }

    @Override
    public double getDiem() {
        return (java_Score * 2 + python_Score) / 3;

    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
