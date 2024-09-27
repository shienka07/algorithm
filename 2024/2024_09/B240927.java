/*
11966번 2의 제곱인가?
https://www.acmicpc.net/problem/11966


자연수 N이 주어졌을 때, 2의 제곱수면 1을 아니면 0을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 230)이 주어진다.

출력
N이 2의 제곱수면 1을 아니면 0을 출력하는 프로그램을 작성하시오.

예제 입력 1 
1
예제 출력 1 
1

예제 입력 2 
2
예제 출력 2 
1

예제 입력 3 
3
예제 출력 3 
0

예제 입력 4 
4
예제 출력 4 
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result;

        while (true) {
            if (N % 2 != 0) {
                break;
            } else {
                N /= 2;
            }
        }

        if (N == 1){
            result = 1;
        } else {
            result = 0;
        }

        System.out.println(result);
    }
}
