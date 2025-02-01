/*
27433번 팩토리얼 2
https://www.acmicpc.net/problem/27433


0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.

출력
첫째 줄에 N!을 출력한다.

예제 입력 1 
10
예제 출력 1 
3628800

예제 입력 2 
0
예제 출력 2 
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P250201 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        long result = 1;

        for(int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}