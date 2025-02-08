/*
2864번 5와 6의 차이
https://www.acmicpc.net/problem/2864


상근이는 2863번에서 표를 너무 열심히 돌린 나머지 5와 6을 헷갈리기 시작했다.
상근이가 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고
, 6을 볼 때는, 6으로 볼 때도 있지만, 5로 잘못 볼 수도 있다.
두 수 A와 B가 주어졌을 때, 상근이는 이 두 수를 더하려고 한다. 
이때, 상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 두 정수 A와 B가 주어진다. (1 <= A,B <= 1,000,000)

출력
첫째 줄에 상근이가 구할 수 있는 두 수의 합 중 최솟값과 최댓값을 출력한다.

예제 입력 1 
11 25
예제 출력 1 
36 37

예제 입력 2 
1430 4862
예제 출력 2 
6282 6292

예제 입력 3 
16796 58786
예제 출력 3 
74580 85582
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B250208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        // 최소값: '6'을 '5'로 변환
        int min = sumParInt(A, B, '6', '5');
        // 최대값: '5'를 '6'으로 변환
        int max = sumParInt(A, B, '5', '6');

        System.out.println(min + " " + max);
    }

    public static int sumParInt(String A, String B, char from, char to) {
        String newA = A.replace(from, to);
        String newB = B.replace(from, to);
        return Integer.parseInt(newA) + Integer.parseInt(newB);
    }
}