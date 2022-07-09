package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1764듣보잡 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hs = new HashSet<>();

        for(int i = 0; i < N; i++){
            hs.add(br.readLine());
        }

        ArrayList<String> list =  new ArrayList<>();

        for(int i = 0; i < M; i++){
            String check = br.readLine();
            if(hs.contains(check)){
                list.add(check);
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (String result : list) {
            System.out.println(result);
        }
    }

}
