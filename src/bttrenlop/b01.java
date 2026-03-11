package bttrenlop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class solutionb01{
    int x;
    solutionb01(int x){
        this.x=x;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return Integer.toString(x);
    }
}
public class b01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<solutionb01> a= new ArrayList<>(n);
        for(int i=0;i<n;i++){
            a.add(new solutionb01(sc.nextInt()));
        }
        long startTime=System.nanoTime();
        a.sort(Comparator.comparing(solutionb01::getX).reversed());
        long endTime=System.nanoTime();
        long durationInNano = (endTime - startTime);
        double durationInMs = durationInNano / 1_000_000.0;
        System.out.println("thời gian chạy la:"+durationInMs);
        System.out.println(a);


    }
}
