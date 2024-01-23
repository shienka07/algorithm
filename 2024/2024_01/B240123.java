/*
11134번 쿠키애호가
https://www.acmicpc.net/problem/11134


철수는 쿠키를 세상에서 제일 좋아한다. 쿠키가 있는 곳이라면 철수도 반드시 있다고 할 정도이다. 
철수는 날마다 자신이 가지고 있는 쿠키 중 C개를 먹는다. C개 미만의 쿠키가 남아 있다면 전부 먹는다. 
철수가 쿠키 N개를 가지고 있으면 며칠 동안 먹을 수 있는지 구하시오.

입력
첫 번째 줄에는 테스트케이스의 개수 T가 주어진다. 그 다음 줄부터 T개의 줄에 테스트케이스가 한 줄씩 주어진다. 
테스트케이스는 철수가 가진 쿠키의 개수 N과 날마다 먹는 쿠키의 개수 C로 이루어져 있다.

출력
각 테스트케이스마다 한 줄씩 철수가 며칠 동안 쿠키를 먹을 수 있는지 출력한다.

제한
0 < T < 100
0 < N < 1,000,000,000
0 < C < 5,000

예제 입력 1 
2
6 2
10 3
예제 출력 1 
3
4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240123 {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int t  = Integer.parseInt(br.readLine());

                for(int i = 0; i < t; i++){
                        StringTokenizer st = new StringTokenizer(br.readLine());
                        int n = Integer.parseInt(st.nextToken());
                        int c = Integer.parseInt(st.nextToken());
                        int cnt = 0;

                        while(n > 0){
                                n -= c;
                                cnt++;
                        }

                        System.out.println(cnt);
                }
        }
}
