package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920수찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st =  new StringTokenizer(br.readLine());

        int[] list = new int[N];

        for(int i = 0; i < N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        int M = Integer.parseInt(br.readLine());

        int[] chkList = new int[M];

        st =  new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            chkList[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0; i < M; i++){
            sb.append(binarySearch(list,chkList[i])).append("\n");
        }

        System.out.println(sb);
    }

    public static int binarySearch(int[] list, int num){

        int low = 0;
        int mid = 0;
        int high = list.length-1;


        while(low <= high){
            mid = (low + high)/2;
            if(list[mid] == num) {
                return 1;
            }
            else if(list[mid] > num) {
                high = mid -1;
            }
            else if(list[mid] < num) {
                low = mid + 1;
            }
        }
        return 0;
    }
}
