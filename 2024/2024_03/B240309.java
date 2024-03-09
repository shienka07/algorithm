/*
25191번 치킨댄스를 추는 곰곰이를 본 임스
https://www.acmicpc.net/problem/25191


치킨 댄스를 추고 있는 곰곰이를 본 임스는 치킨을 먹고 싶어졌다. 
임스는 치킨 1마리를 먹을 때 반드시 집에 있는 콜라 2개나 맥주 1개와 같이 먹어야 한다.
또한, 치킨집에 있는 치킨의 개수보다 치킨을 많이 시켜먹을 수는 없다.
치킨집에 있는 치킨의 개수와 임스의 집에 있는 콜라, 맥주의 개수가 주어졌을 때, 임스가 시켜먹을 수 있는 치킨의 총 개수를 출력하시오.

입력
첫 번째 줄에는 치킨집에 있는 치킨의 총 개수를 나타내는 정수 N이 주어진다. (1 <= N <= 1,000)
두 번째 줄에는 임스의 집에 있는 콜라의 개수 A와 맥주의 개수 B가 공백을 사이에 두고 주어진다. 
(1 <= A, B <= 1,000, A, B는 정수)

출력
임스가 시켜먹을 수 있는 치킨의 총 개수를 출력하시오.

예제 입력 1 
5
4 2
예제 출력 1 
4
치킨 4마리를 콜라 4개, 맥주 2개와 같이 먹을 수 있다.

예제 입력 2 
3
4 2
예제 출력 2 
3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int drink = Integer.parseInt(st.nextToken()) / 2 + Integer.parseInt(st.nextToken());
        int result = Math.min(n,drink);

        System.out.println(result);
    }
}
