import java.util.Scanner;

public class _1007 {

    public static long fibonaci(int n) {
        if (n < 0) {
        return 0;}

    if (n == 0 || n == 1) {
        return 1;
    }
    
    long a = 0;
    long b = 1;
    long ketQua = 0;

    while (ketQua < n) {
        ketQua = a + b;
        
        a = b;
        b = ketQua;
        
        if(ketQua == n){
            return 1;
        }
    }

    return 0;
}


public static void main(String[] Args) {
        Scanner t = new Scanner(System.in);
        
        int T = t.nextInt(); 
        
        for (int i = 0; i < T; i++) { 
            if (!t.hasNextInt()) break;
            int n = t.nextInt();
            
            long result = fibonaci(n);
            if (result==1){
                      System.out.println("YES");
            }
            else{
                      System.out.println("NO");
            }
      
        }
        t.close();
    }
}
