/*
18766번 카드 바꿔치기
https://www.acmicpc.net/problem/18766


범고래와 돌고래는 카드놀이를 좋아한다. 
각 카드는 빨강 (R), 노랑 (Y), 파랑 (B) 중 하나의 색으로 칠해져 있고 0-9 사이의 숫자가 적혀있다. 
색과 숫자가 같은 카드가 여러 장 있을 수도 있다.
최근 범고래는 모든 게임에서 졌고, 돌고래가 몰래 카드를 바꿔치기 한다는 의심을 하게 되었다.
범고래는 기억력이 매우 좋아서 카드놀이를 하기 전 n장의 카드와 카드놀이를 하면서 둘이 플레이 한 n장의 카드를 모두 기억하고 있다. 
하지만 돌고래가 카드를 바꿔치기 했는지 아닌지 판단을 하는 능력은 부족하다.
예를 들어, 카드놀이를 하기 전에 n = 5장의 카드가 있었고, 이 카드는 아래와 같았다고 하자.

R0 B9 R5 Y3 R2
카드놀이를 마치고 난 뒤 범고래가 기억하는 카드는 다음과 같다.

R0 B8 R5 Y3 R2
이런 경우는 돌고래가 B9 카드 대신 B8 카드로 바꿔치기를 한 것이다.

돌고래가 카드 바꿔치기를 한 증거가 있는지 아닌지 판단하는 프로그램을 만들어보자.

입력
첫 줄에 테스트 케이스의 수 T가 주어진다.
각 테스트 케이스는 다음과 같이 세 줄로 이루어져 있다.
첫째 줄에 카드의 개수 n이 주어진다.
둘째 줄에 카드놀이를 하기 전 범고래가 기억하는 n장의 카드를 나타내는 n개의 문자열이 공백으로 구분되어 주어지는데, 
각 문자열은 두 글자이며 첫 글자는 R, Y, B 중 하나이고 두 번째 글자는 숫자 0-9중 하나이다.
셋째 줄에는 카드놀이가 끝난 후 범고래가 기억하는 n장의 카드가 주어진다. 입력 형식은 둘째 줄과 같다.

출력
각각의 테스트 케이스마다 한 줄에 하나씩 돌고래가 카드를 바꿔치기 했으면 "CHEATER"를, 아니면 "NOT CHEATER"를 따옴표 없이 출력한다.

제한
1 ≤ T ≤ 10  
1 ≤ n ≤ 200 
예제 입력 1 
4
5
R0 B9 R5 Y3 R2
R0 B8 R6 Y3 R2
1
R0
R0
3
R1 R0 R0
R0 R1 R1
3
R1 R1 R0
R0 R1 R1
예제 출력 1 
CHEATER
NOT CHEATER
CHEATER
NOT CHEATER

테스트 케이스 1: 문제에서 다룬 예시
테스트 케이스 2: 카드의 목록이 일치하기 때문에, 돌고래가 카드를 바꿔치기 하지 않았다.
테스트 케이스 3: 돌고래가 R0 둘 중 한 장을 R1로 바꿨다.
테스트 케이스 4: 카드 목록이 일치한다.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B240413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] arr = new String[n];

            for (int j = 0; j < n; j++) {
                arr[j] = st.nextToken();
            }

            st = new StringTokenizer(br.readLine());
            String[] compare = new String[n];

            for (int j = 0; j < n; j++) {
                compare[j] = st.nextToken();
            }

            Arrays.sort(arr);
            Arrays.sort(compare);

            String result = "NOT CHEATER";
            for (int j = 0; j < n; j++) {
                if (!arr[j].equals(compare[j])) {
                    result = "CHEATER";
                    break;
                }
            }

            System.out.println(result);
        }
    }
}