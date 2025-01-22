/*
9550번 아이들은 사탕을 좋아해
https://www.acmicpc.net/problem/9550


승택이의 아들이 생일을 맞았다. 승택이는 아들을 위해 생일 파티를 하려고 한다.

하지만 아들의 친구들을 모두 초대할 수는 없다. 아이들에게 나눠 줄 사탕이 부족하기 때문이다.

아이들은 항상 한 종류의 사탕만을 먹고 싶어한다. 게다가, 한 종류의 사탕을 최소한 K개 이상 먹어야만 행복해한다.

K가 주어지고 승택이가 현재 갖고 있는 사탕의 종류와 개수가 주어진다. 이때, 생일파티에 올 수 있는 아이들은 최대 몇 명일까?

입력
첫 줄에 테스트 케이스의 수 T가 주어진다. ( 1 ≤ T ≤ 100 )

각 테스트 케이스의 첫 줄엔 승택이가 갖고 있는 사탕의 종류의 수 N과 K가 주어진다. ( 1 ≤ N, K ≤ 100 )

두 번째 줄엔 N개의 정수로 승택이가 각 종류의 사탕을 몇 개 갖고 있는지가 주어진다.

모든 종류에 대해, 사탕은 최소 1개 최대 100개이다.

출력
각 테스트 케이스마다 생일파티에 최대 몇 명의 아이들이 참석할 수 있는지 하나의 정수로 출력한다.

예제 입력 1 
2
3 2
4 5 7
3 8
4 5 7
예제 출력 1 
7
0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P250122 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 0;
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                answer += temp / K;
            }

            System.out.println(answer);
        }

    }
}
