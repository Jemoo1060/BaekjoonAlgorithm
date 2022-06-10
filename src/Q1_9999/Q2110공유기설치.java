package Q1_9999;

import java.util.Arrays;

public class Q2110공유기설치 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] check = new int[n];

        for (int i=0; i<n; i++) {
            check[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(check);

        int start = 1;
        int end = check[n-1] - check[0];

        int result = 0;


        while (start <= end) {
            int mid = (start+end)/2;
            int left = check[0];
            int cnt = 1;

            for (int i=1; i<n; i++) {
                if (check[i]-left>=mid) {
                    cnt++;
                    left = check[i];
                }
            }

            if (cnt>=c) {
                result = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        System.out.println(result);

    }
}
