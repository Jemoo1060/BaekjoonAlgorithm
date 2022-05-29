package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1541잃어버린괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-");

        boolean check = true;
        int result = 0;

        for(int i = 0; i <input.length; i++){
            int balance = 0;

            String[] temp = input[i].split("\\+");

            for(int j = 0; j <temp.length; j++){
                balance += Integer.parseInt(temp[j]);
            }

            if(check){
                result = balance;
                check = false;
            } else {
                result -= balance;
            }
        }

        System.out.println(result);


    }
}
