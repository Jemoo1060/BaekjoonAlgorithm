package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941크로아티아알파벳 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String check[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();

        for(int i = 0; i < check.length; i++){
            if(str.contains(check[i])){
                str = str.replace(check[i], "*");

            }
        }

        System.out.println(str.length());

    }

}
