package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q11478서로다른부분문자열의개수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        HashSet<String> hs= new HashSet<>();

        String check;

        for(int i = 0; i < S.length(); i++){
             check = "";
             for(int j = i; j < S.length(); j++){
                 check += S.substring(j,j+1);
                 hs.add(check);
             }
        }

        System.out.println(hs.size());
    }
}
