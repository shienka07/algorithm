/*
23794번 골뱅이 찍기 - 정사각형
https://www.acmicpc.net/problem/23794


첫째 줄과 N+2번째 줄에는 골뱅이 N+2개를 출력한다.
둘째 줄부터 N+1번째 줄까지는 예제 출력과 같은 방식으로 골뱅이 2개와 공백 N개를 출력한다.

입력
첫째 줄에 정수 
N(1 <= leq N <= 100)이 주어진다.

출력
첫째 줄부터 N+2번째 줄까지 차례대로 골뱅이를 출력한다.

예제 입력 1 
1
예제 출력 1 
@@@
@ @
@@@

예제 입력 2 
3
예제 출력 2 
@@@@@
@   @
@   @
@   @
@@@@@
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240315 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n+2; i++) {
            sb.append("@");
        }
        sb.append("\n");

        for (int i = 0; i < n; i++) {
            sb.append("@");
            for (int j = 0; j < n; j++) {
                sb.append(" ");
            }
            sb.append("@");
            sb.append("\n");
        }

        for (int i = 0; i < n+2; i++) {
            sb.append("@");
        }

        System.out.println(sb);
    }
}
