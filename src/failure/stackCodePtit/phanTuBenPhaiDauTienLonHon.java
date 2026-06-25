package failure.stackCodePtit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class phanTuBenPhaiDauTienLonHon {
    private final static Deque<Integer> deque = new ArrayDeque<>();

    private static void solve(int[] arr) {
        deque.clear();
        int n = arr.length;
        int[] result = new int[n]; // Nên dùng mảng kết quả riêng để tránh ghi đè làm mất dữ liệu gốc nếu cần, hoặc dùng luôn arr như bạn

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && arr[i] > arr[deque.peek()]) {
                int index = deque.pop();
                arr[index] = arr[i];
            }
            deque.push(i);
        }

        // Những phần tử còn sót lại trong stack là những phần tử không có phần tử bên phải nào lớn hơn nó
        while (!deque.isEmpty()) {
            arr[deque.pop()] = -1;
        }

        // Dùng StringBuilder cục bộ để gom luồng output, tối ưu bộ nhớ buffer
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine().trim());
       while(t-->0){
           int n=Integer.parseInt(br.readLine().trim());
           int []arr= new int[n];
           StringTokenizer st= new StringTokenizer(br.readLine());
           for(int i=0;i<arr.length;i++){
               arr[i]=Integer.parseInt(st.nextToken());
           }
           solve(arr);
       }
    }
}
