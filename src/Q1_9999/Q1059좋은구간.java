package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1059좋은구간 {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int [] number = new int [size];

        String[] strings = br.readLine().split(" ");

        for(int i=0; i<size; i++){
            number[i] = Integer.parseInt(strings[i]);
        }
        int n = Integer.parseInt(br.readLine());

        Arrays.sort(number);

        int index = 0;
        for(int num : number){
            if(n>num) {
                index++;
            }
        }

        int A = 0;

        if(index !=0){
            A = number[index-1];
        }

        int B = number[index];

        int sum = 0;

        for(int i=A+1; i<=n; i++){
            for(int j = n; j<B; j++){
                if(i != j){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
