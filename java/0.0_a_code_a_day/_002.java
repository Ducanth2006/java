import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _002 {
    public static void main (String[] agrs){
        File file= new File("Hello.txt");
        try{
            Scanner scanner= new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            };
            
            scanner.close();


        }
        catch(FileNotFoundException e){



        }


    }
    
}
