package Q1_9999;

import java.util.Scanner;

public class Q2839설탕배달 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for(int i = a/5; i >= 0; i--){
            int b = a - 5*i;

            if(b%3 == 0){
                int c = b/3;
                count = i + c;
                System.out.println(count);
                break;
            }

            if(i == 0 && b%3!=0){
                System.out.println(-1);
            }
        }
    }
}
