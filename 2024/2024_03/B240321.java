/*
25494번 단순한 문제(Small)


세 양의 정수 a, b, c가 주어질 때, 다음 조건을 만족하는 정수 쌍 (x, y, z)의 개수를 구하시오.
1 <= x <= a 
1 <= y <= b 
1 <= z <= c
(x mod y) = (y mod z) = (z mod x) 
(A mod B)는 A를 B로 나눈 나머지를 의미한다.

입력
첫째 줄에 테스트 케이스의 수 T가 주어진다. (1 <= T <= 100)

다음 
T개의 각 줄에는 세 정수 a, b, c가 공백으로 구분되어 주어진다. (1 <= a, b, c <= 60)

출력
한 줄에 하나씩 정답을 출력한다.

예제 입력 1 
2
1 2 3
3 2 4
예제 출력 1 
1
2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240321 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int min = Math.min(a, b);

            min = Math.min(min, c);
            sb.append(min).append("\n");
        }

        System.out.println(sb);
    }
}
