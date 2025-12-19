package A_code_a_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        try {
            File file = new File("file23.txt");
            Scanner reader = new Scanner(file);
            long sum = 0;
            while (reader.hasNext()) {
                if (reader.hasNextInt()) {
                    sum += reader.nextInt();
                } else {
                    reader.next();
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {

        }
    }
}
