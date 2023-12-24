/*
2445번 별 찍기 - 8
https://www.acmicpc.net/problem/2445


예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B231224 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            for(int k = 1; k <= (n - i) * 2; k++){
                sb.append(" ");
            }
            for(int p = 1; p <= i; p++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i = n - 1 ; i >= 1; i--){
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            for(int k = 1; k <= (n - i) * 2; k++){
                sb.append(" ");
            }
            for(int p = 1; p <= i; p++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}