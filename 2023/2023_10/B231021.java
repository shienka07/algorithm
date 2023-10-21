/*
2444번 별찍기 - 7
https://www.acmicpc.net/problem/2444


예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5

예제 출력 1 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B231021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                bw.write(" ");
            }
            for(int j = 1; j <= (2 * i) - 1; j++){
                bw.write("*");
            }
            bw.write("\n");
        }

        for(int i = n - 1; i >= 1; i--){
            for(int j = 0; j < n-i; j++){
                bw.write(" ");
            }
            for(int j = 1; j <= (2 * i) - 1; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        
        bw.close();
        br.close();
    }
}