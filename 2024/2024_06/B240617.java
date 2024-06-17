/*
13866번 팀 나누기
https://www.acmicpc.net/problem/13866


4명의 친구가 탁구를 하고 있다. 각각은 정수형으로 표현된 스킬 레벨을 가지고 있고, 숫자가 높을수록 더 좋은 플레이어다.
4명의 친구는 각각 두 명씩 구성된 두 팀을 구성하려고 한다. 
게임이 더 흥미롭게 하기 위해서 팀의 스킬 레벨을 최대한 가깝게 유지하기를 원한다. 팀의 스킬 레벨은 팀원의 스킬 레벨의 합계이다.
그들은 탁구 선수로는 탁월하지만, 수학이나 컴퓨터와 같은 다른 것들에 능숙하지 않다. 팀의 스킬 레벨이 가능한 작은 차이를 갖도록 도와주자.

입력
입력은 네 개의 정수 A, B, C 및 D가 포함된 한 줄로 구성되며 4명의 스킬 레벨이 주어진다. (0 ≤ A ≤ B ≤ C ≤ D ≤ 104)

출력
두 팀의 스킬 레벨 차이의 최솟값을 출력한다.

예제 입력 1 
4 7 10 20
예제 출력 1 
7

예제 입력 2 
0 0 1 1000
예제 출력 2 
999

예제 입력 3 
1 2 3 4
예제 출력 3 
0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240617 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = Math.abs((arr[0] + arr[3]) - (arr[1] + arr[2]));

        System.out.println(result);
    }
}
