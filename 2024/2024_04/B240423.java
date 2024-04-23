/*
27890번 특별한 작은 분수
https://www.acmicpc.net/problem/27890


이 문제는 x_0와 N의 제한을 제외하고 특별한 큰 분수와 같은 문제이다.
NLCS에는 분수가 많다.
분수에서 나오는 물의 높이는 특정한 규칙에 따라 변화하는데, 어떤 정수 시각 t에서의 분수의 높이가 정수 x_t일 때, 
x_{t+1}는 x_t가 짝수라면 {x_t}{2} \oplus 6, x_t가 홀수라면 (2 * x_t) \oplus 6과 같다.
 
0초에서의 분수의 높이가 주어졌을 때, N초에서의 분수의 높이를 구하는 프로그램을 작성하시오.

입력
첫 번째 줄에 0초에서의 분수의 높이 x_0와 N이 주어진다. 
x_0와 N은 모두 정수이다.

출력
첫 번째 줄에 N초에서의 분수의 높이를 출력한다.


제한 
0 <= x_0, N <= 1,000

예제 입력 1 
512 2
예제 출력 1 
133

예제 입력 2 
105 3
예제 출력 2 
48

노트
[x]는 x보다 작거나 같은 가장 큰 정수를 의미한다.
 
\oplus 는 비트 XOR 연산을 수행하는 연산자이다. 
비트 XOR 연산자에 대한 자세한 정보는 위키백과 (영어)에서 읽을 수 있다. 
대부분의 프로그래밍 언어에서 비트 XOR 연산은 ^로 구현되어 있다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240423 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
            if (x % 2 == 0) {
                x = (x / 2) ^ 6;
            } else {
                x = (x * 2) ^ 6;
            }
        }

        System.out.println(x);
    }
}