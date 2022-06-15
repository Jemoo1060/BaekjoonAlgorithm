package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2108통계학 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        double sum = 0;

        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(br.readLine());
            sum += temp;
            list[i] = temp;
        }

        Arrays.sort(list);

        int avg = (int) Math.round(sum/n);
        int middle = list[list.length/2];
        int manny = 0;
        int range = list[list.length -1 ] - list[0];

        int[] checkList = new int[8001];
        ArrayList<Integer> minList = new ArrayList<>();

        for(int temp : list){
            if(temp < 0){
                checkList[Math.abs(temp) + 4000]++;
            } else {
                checkList[temp]++;
            }

        }

        int max = Integer.MIN_VALUE;
        for (int i : checkList) {
            if (i != 0 && i > max) {
                max = i;
            }
        }

        for(int i =0; i < checkList.length; i++){
            int temp = i;
            if(checkList[i] == max){

                if(i > 4000 ){
                    temp -= 4000;
                    temp *= -1;
                    minList.add(temp);
                } else {
                    minList.add(temp);
                }
            }
        }

        Collections.sort(minList);

        if(minList.size() > 1){
            manny = minList.get(1);
        } else{
            manny = minList.get(0);
        }

        System.out.println(avg + "\n" + middle +"\n" + manny + "\n" + range +"\n");
    }
    
}
