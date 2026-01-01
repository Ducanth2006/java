package A_code_a_day.baitoancon;

import java.util.*;
import java.util.stream.Collectors;

class thiSinh {
    String id;
    String name;
    String bd;
    double mon1;
    double mon2;
    double mon3;
    double tongDiem;

    public thiSinh(int id, String name, String bd, double mon1, double mon2, double mon3) {
        this.id = sinhId(id);
        this.name = name;
        this.bd = bd;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.tongDiem = mon1 + mon2 + mon3;
    }
    public String getId(){
        return id;
    }

    public String toString(){
        return id+" "+name+" "+bd+" "+tongDiem;
    }


    public double getTongDiem() {
        return tongDiem;
    }

    private String sinhId(int i) {
        return String.format("%01d", i);
    }
}

public class timThuKhoaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<thiSinh> ds = new HashSet<>();
        int test = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= test; i++) {
            int id = i;
            String name = sc.nextLine();
            String bd = sc.nextLine();
            double mon1 = Double.parseDouble(sc.nextLine());
            double mon2 = Double.parseDouble(sc.nextLine());
            double mon3 = Double.parseDouble(sc.nextLine());
            ds.add(new thiSinh(id, name, bd, mon1, mon2, mon3));
        }
        // đầu tiên là tìm điểm max nhé
        Double diemMax = ds.stream().max(Comparator.comparing(thiSinh::getTongDiem))
                .map(thiSinh::getTongDiem)// thằng này để lấy nhé nếu ko nó sẽ là optional
                .orElse(0.0);// bắt buộc phải có thằng này để kết thúc
        // lưu các đôi tượng thỏa mãn điều kiễn vào list mới . nớ nhé filter dùng cái arrow function nhé
        List<thiSinh> dsloc=ds.stream().filter(thiSinh -> thiSinh.getTongDiem()==diemMax)
                .collect(Collectors.toList());// phải có thằng này để lưu nó vào list nhé
        dsloc.sort(Comparator.comparing(thiSinh::getId));
        for (thiSinh x:dsloc){
            System.out.println(x);
        }
    }

}

