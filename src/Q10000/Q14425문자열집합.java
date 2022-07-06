package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q14425문자열집합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken());
        int M = Integer.parseInt(input.nextToken());

        int count = 0;

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < N; i++){
            hm.put(br.readLine(),1);
        }

        for(int i = 0; i < M; i++){
            String check  = br.readLine();
            if(hm.get(check) != null){
                count++;
            }
        }

        System.out.println(count);

    }

}
