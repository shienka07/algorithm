/*
9295번 주사위
https://www.acmicpc.net/problem/9295


오늘은 갑자기 주사위를 던지고 싶다.
그런데 코딩도 하고 싶다.
그럼 같이할까?

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 주사위를 두 번 던져 나온 두 수를 입력한다.

출력
각 테스트 케이스마다 "Case x: "를 출력한 다음, 주사위를 두 번 던져 나온 두 수의 합을 출력한다. 
테스트 케이스 번호(x)는 1부터 시작한다.

예제 입력 1 
5
1 2
1 3
3 5
2 6
3 4
예제 출력 1 
Case 1: 3
Case 2: 4
Case 3: 8
Case 4: 8
Case 5: 7
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println("Case " + i + ": " + (x + y));
        }
    }
}
