package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231분해합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());



        for(int i =0; i< N; i++){
            int sum = i;
            int temp = i;
            while (temp != 0){
                sum += temp % 10;
                temp = temp/10;
            }

            if(sum == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");
    }

}
