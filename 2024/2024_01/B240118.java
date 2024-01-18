/*
2740번 행렬 곱셈
https://www.acmicpc.net/problem/2740


N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬 A의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 순서대로 주어진다. 
그 다음 줄에는 행렬 B의 크기 M과 K가 주어진다. 이어서 M개의 줄에 행렬 B의 원소 K개가 차례대로 주어진다. 
N과 M, 그리고 K는 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 곱한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

예제 입력 1 
3 2
1 2
3 4
5 6
2 3
-1 -2 0
0 0 3
예제 출력 1 
-1 -2 6
-3 -6 12
-5 -10 18
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240118 {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                StringBuilder sb = new StringBuilder();
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                int[][] a = new int[n][m];

                for(int i = 0; i < n; i++){
                        st = new StringTokenizer(br.readLine(), " ");
                        for(int j = 0; j < m; j++){
                                a[i][j] = Integer.parseInt(st.nextToken());
                        }
                }

                st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                int k = Integer.parseInt(st.nextToken());
                int[][] b = new int[m][k];

                for(int i = 0; i < m; i++){
                        st = new StringTokenizer(br.readLine(), " ");
                        for(int j = 0; j < k; j++){
                                b[i][j] = Integer.parseInt(st.nextToken());
                        }
                }

                for(int i = 0; i < n; i++){
                        for(int j = 0; j < k; j++){
                                int sum = 0;
                                for(int l = 0; l < m; l++){
                                        sum += a[i][l] * b[l][j];
                                }
                                sb.append(sum).append(' ');
                        }
                        sb.append('\n');
                }
                System.out.println(sb);
        }
}
