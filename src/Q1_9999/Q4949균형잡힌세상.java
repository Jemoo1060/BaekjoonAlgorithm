package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949균형잡힌세상 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();

            boolean chk = true;

            if(input.equals(".")){
                break;
            }

            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < input.length(); i++){


                char check = input.charAt(i);

                if(check == '(' || check == '[') {
                    stack.push(check);
                }
                else if(check == ')') {

                    if(stack.empty() || stack.peek() != '(') {
                        System.out.println("no");
                        chk = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
                else if(check == ']') {

                    if(stack.empty() || stack.peek() != '[') {
                        System.out.println("no");
                        chk = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }

            }

            if (chk) {
                if(stack.empty()) {
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }
        }

    }
}
