package buoi_9_polymorphism.th_07;

public class sinhVIenCk extends sinhVien {
    double score_Cnc;
    double score_Clc;

    public sinhVIenCk(String name, double score_Cnc, double score_Clc) {
        super(name);
        this.score_Clc = score_Clc;
        this.score_Cnc = score_Cnc;
    }

    public double getDiem() {
        return (score_Cnc + score_Clc) / 2;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
