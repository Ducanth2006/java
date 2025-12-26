package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class danh_sach_sinh_vien_trong_file2 {
    public static String standardize_bd(String bd ){
        DateTimeFormatter input=  DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(bd,input);
        DateTimeFormatter output= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(output);
    }
    static String msv(int i){
        String s = Integer.toString(i);
        while(s.length()<3) s = "0" + s;
        return "B20DCCN" + s;
//      return String.format("B20DCCN%03d", i); siêu xịn
    }


    public static void main(String[] args) {
        File file = new File("file23.txt");
        try {
            Scanner reader = new Scanner(file);
            if (reader.hasNextInt()) {
                int test = reader.nextInt();
                reader.nextLine(); // Lệnh này cực kỳ quan trọng: để nhảy qua dấu xuống dòng sau số lượng 'test'

                for (int i = 1; i <= test; i++) {
                    // Đọc từng dòng một cách tuần tự
                    String name = reader.nextLine().trim();  // Đọc cả dòng "Nguyen Van An"
                    String lop = reader.nextLine().trim();   // Đọc cả dòng "D20CQCN01-B"
                    String bdRaw = reader.nextLine().trim(); // Đọc cả dòng "2/12/2002"
                    String gpaRaw = reader.nextLine().trim();// Đọc cả dòng "3.19"

                    // Chuẩn hóa dữ liệu
                    String bdChuan = standardize_bd(bdRaw);  // Dùng hàm của File 1
                    float gpa = Float.parseFloat(gpaRaw);    // Chuyển chuỗi điểm thành số thực

                    // In kết quả cuối cùng
                    System.out.printf("%s %s %s %s %.2f\n", msv(i), name, lop, bdChuan, gpa);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {

        }
    }


}
