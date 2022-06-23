package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815숫자카드 {

    public static int[] arr;
    public static int[] card;

    public static void main(String args[]) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N=Integer.parseInt(br.readLine());
        arr=new int[N];

        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0;i<arr.length;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M=Integer.parseInt(br.readLine());
        card=new int[M];

        st= new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            card[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<card.length;i++) {
            if(binarySearch(card[i],0,arr.length-1)==-1) {
                sb.append("0 ");
            }
            else {
                sb.append("1 ");
            }
        }

        System.out.println(sb);

    }

    static int binarySearch(int key, int low, int high) {
        int mid;

        while(low<=high){
            mid=(low+high)/2;

            if(key==arr[mid]) {
                return 1;
            } else if(key<arr[mid]) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return -1;
    }
    
}
