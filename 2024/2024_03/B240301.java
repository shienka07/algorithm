/*
1212번 8진수 2진수
https://www.acmicpc.net/problem/1212


8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.

입력
첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.

출력
첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.

예제 입력 1 
314
예제 출력 1 
11001100
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n.length(); i++){
                String temp = Integer.toBinaryString(n.charAt(i) - '0');

                if(temp.length() == 2 && i !=0){
                        temp = "0" + temp;
                } else if(temp.length() == 1 && i != 0){
                        temp = "00" + temp;
                }

                sb.append(temp);
        }

        System.out.println(sb);
}
}
