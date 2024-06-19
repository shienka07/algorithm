/*
12790번 Mini Fantasy War
https://www.acmicpc.net/problem/12790


넥슨지티에서는 최근 SRPG "슈퍼 판타지 워"의 후속작으로 "미니 판타지 워"를 출시하였다. 
전편과 마찬가지로, 미니 판타지 워에서도 각 캐릭터의 전투력을 계산하여야 한다. 각 캐릭터의 전투력은 단순히 각 캐릭터의 능력치의 가중 합으로 계산된다. 
전투력 계산은 굉장히 간단한 로직이지만 게임 곳곳에 쓰이는 만큼, Being은 다른 프로그래머로 하여금 이 로직을 구현하여 자신의 것과 교차검증하고자 한다. 
그리하여 당신은 이 전투력을 구현하는 작업을 맡게 되었다.

능력치는 모두 네 종류 존재한다. 이는 각각 HP, MP, 공격력, 방어력이다. 각 캐릭터는 기본 능력치 4종을 바탕으로 장비를 장착할 수 있다. 
각 장비는 능력치를 변화시키는데, 그 변화되는 양이 입력으로 주어진다. 따라서 캐릭터의 최종 능력치는 기본 능력치와 장비 능력치의 합으로 구성된다. 
단, HP와 MP는 1보다 작은 경우 1로 간주하며, 공격력은 0보다 작은 경우 0으로 간주한다. 방어력은 음수 여부에 상관하지 않는다.

결정된 능력치에 따른 캐릭터의 최종 전투력은 아래와 같다:
전투력 = 1 * (HP) + 5 * (MP) + 2 * (공격력) + 2 * (방어력)

각 캐릭터의 기본 능력치와 장비에 의해 변화되는 능력치의 증감량이 주어질 때, 최종 전투력을 구하는 프로그램을 작성하여라.

입력
입력의 첫 줄에는 능력치를 계산하여야 하는 캐릭터의 수, 또는 테스트 케이스의 수 T (1 ≤ T ≤ 1000) 가 주어진다.

다음 T 행에 걸쳐 각각 8개의 정수가 주어진다. 처음 네 개의 정수는 각각 캐릭터의 기본 HP, MP, 공격력, 방어력이다. 
이 값들은 1 이상 999 이하로 주어진다. 다음 네 개의 정수는 각각 캐릭터의 장비에 의해 증감되는 HP, MP, 공격력, 방어력이다. 
이 값들은 -999 이상 999 이하로 주어진다.

출력
각 캐릭터, 즉 각 테스트 케이스마다 한 줄에 하나씩 캐릭터의 최종 전투력을 출력한다.

예제 입력 1 
3
100 100 100 100 0 0 0 0
10 20 30 40 40 30 20 10
100 100 100 100 -200 0 400 400
예제 출력 1 
1000
500
2501
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[8];
            for (int j = 0; j < 8; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int hp = arr[0] + arr[4];
            if (hp <= 1) {
                hp = 1;
            }
            int mp = arr[1] + arr[5];
            if (mp <= 1) {
                mp = 1;
            }
            int atk = arr[2] + arr[6];
            if (atk <= 0) {
                atk = 0;
            }
            int def = arr[3] + arr[7];

            int result = hp + (mp * 5) + (atk * 2) + (def * 2);
            System.out.println(result);
        }
    }
}
