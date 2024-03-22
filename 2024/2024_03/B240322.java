/*
2446번 별 찍기-9
https://www.acmicpc.net/problem/2446


예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240322 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * n - 1) - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {	// N+1 ~ 2N-1
            for (int j = 1; j < (n - 1) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
