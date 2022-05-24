package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110더하기사이클 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int check = a;
        int b = 0;
        int c = 0;
        int d = 0;
        int count = 0;
        while (true){
            b = a%10;
            c = (a/10 + a%10)%10;
            d = b*10 + c;

            count++;
            if(check == d){
                break;
            }

            a = d;
        }

        System.out.println(count);



    }
}
