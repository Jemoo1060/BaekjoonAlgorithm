package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4948베르트랑공준 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            int a = Integer.parseInt(br.readLine());

            if(a == 0)
                break;

            int count = 0;


            for(int i = a + 1; i <= 2*a; i++){

                int check = 0;


                for(int j = 2; j <=(int)Math.sqrt(i); j++){

                    if(i % j == 0){
                        check++;
                        break;
                    }
                }

                if(check == 0){
                    count++;
                }

            }

            System.out.println(count);
        }

    }
}
