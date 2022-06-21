package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9020골드바흐의추측 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0){
            int N = Integer.parseInt(br.readLine());

            int div, rem;
            div = N/2;
            rem = N/2;

            while (true){
                if(isPrime(div) && isPrime(rem)){
                    break;
                } else {
                    div--;
                    rem++;
                }
            }
            sb.append(div + " " + rem + "\n");
        }

        System.out.println(sb);
    }

    static boolean isPrime(int n){
        boolean check = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                check = false;
        }
        return check;
    }
}
