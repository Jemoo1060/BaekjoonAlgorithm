package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1475방번호 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int[] list = new int[10];
        for(char c : N.toCharArray()) {
            int temp = c - '0';
            if(temp==9) {
                temp = 6;
            }
            list[temp]++;
        }

        list[6] = list[6]/2 + list[6]%2;

        Arrays.sort(list);
        System.out.println(list[9]);
    }
}
