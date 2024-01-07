/*
2530번 인공지능 시계
https://www.acmicpc.net/problem/2530


KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 
인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 
그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 초 단위로 자동적으로 계산한다. 
또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.  
훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 초 단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

입력
첫째 줄에는 현재 시각이 나온다. 
현재 시각은 시 A (0 ≤ A ≤ 23), 분 B (0 ≤ B ≤ 59)와 초 C (0 ≤ C ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 
두 번째 줄에는 요리하는 데 필요한 시간 D (0 ≤ D ≤ 500,000)가 초 단위로 주어진다.

출력
첫째 줄에 종료되는 시각의 시, 분, 초을 공백을 사이에 두고 출력한다. 
(단, 시는 0부터 23까지의 정수이며, 분, 초는 0부터 59까지의 정수이다. 디지털 시계는 23시 59분 59초에서 1초가 지나면 0시 0분 0초가 된다.)

예제 입력 1 
14 30 0
200
예제 출력 1 
14 33 20

예제 입력 2 
17 40 45
6015
예제 출력 2 
19 21 0

예제 입력 3 
23 48 59
2515
예제 출력 3 
0 30 54
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B231213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[3];

        for(int i = 0 ; i < 3; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }

        int sec = Integer.parseInt(br.readLine());

        time[1] += sec / 60;
        time[2] += sec % 60;

        time[1] += time[2] / 60;
        time[2] = time[2] % 60;

        time[0] += time[1] / 60;
        time[1] = time[1] % 60;

        time[0] = time[0] % 24;

        System.out.println(time[0] + " " + time[1] + " " + time[2]);
    }
}