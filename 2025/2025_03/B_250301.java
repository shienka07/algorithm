/*
1789번 수들의 합
https://www.acmicpc.net/problem/1789


서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?

입력
첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.

출력
첫째 줄에 자연수 N의 최댓값을 출력한다.

예제 입력 1 
200
예제 출력 1 
19
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_250301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long N = 1;
        long sum = 0;

        while (sum + N <= S) {
            sum += N;
            N++;
        }

        System.out.println(N - 1);
    }
}