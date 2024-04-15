/*
28097번 모범생 포닉스
https://www.acmicpc.net/problem/28097


모두가 알다시피, 포닉스는 포스텍을 대표하는 모범생이다! 포닉스는 최고의 모범생답게 남들과는 다른 공부 계획표를 가지고 있다.

포닉스는 총 N개의 공부 계획을 가지고 있다. i번째 공부 계획을 실행하는 데에는 T_i시간이 소모된다. 
포닉스는 각 계획을 순서대로 시행하며, 각 계획 사이에는 8시간만큼의 휴식을 취한다.

N개의 공부 계획을 모두 마친 포닉스는 지금의 시간이 첫 번째 공부 계획을 시작한 시간으로부터 얼마나 지났는지 궁금해졌다. 
포닉스가 마지막 공부를 마칠 때까지 걸린 총 시간이 며칠 몇 시간인지 구해 보자. 
1일은 24시간이다.

입력
첫 번째 줄에 공부 계획의 수 N이 주어진다. (1 <= N <= 120)
두 번째 줄에 각 계획의 공부 시간을 나타내는 N개의 정수 T_1,T_2, ... ,T_N이 공백으로 구분되어 주어진다. 
(10 <= T_i <= 30$)

출력
모든 계획을 마친 후의 소요 시간을 일과 시간 단위로 공백으로 구분하여 출력한다.

예제 입력 1 
2
12 12
예제 출력 1 
1 8
각 공부 계획은 12시간씩 소요되었고, 그 사이에 8시간만큼 휴식을 취했다.

따라서 포닉스가 첫 공부 계획을 시작하고 마지막 공부를 마칠 때까지 총 1일하고도 8시간이 소요되었다.

예제 입력 2 
1
10
예제 출력 2 
0 10

예제 입력 3 
3
10 11 11
예제 출력 3 
2 0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240415 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int temp = 0;

        for (int i = 0; i < n; i++) {
            if(i > 0){
                temp += 8;
            }
            temp += Integer.parseInt(st.nextToken());
        }

        int day = temp / 24;
        int time = temp % 24;

        System.out.println(day + " " + time);
    }
}
