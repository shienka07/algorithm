/*
5523번 경기 결과
https://www.acmicpc.net/problem/5523


A와 B가 게임을 한다. 게임은 N번의 라운드로 이루어져 있다. 
각 라운드에서는, 더 많은 점수를 얻은 사람이 그 라운드의 승자가 된다. 
즉, A의 점수가 B의 점수보다 크면 i번째 라운드는 A의 승리이며, B의 점수가 A의 점수보다 크면 i번째 라운드는 B의 승리이다. 
무승부인 경우에는 아무도 승리하지 않는다.

N번의 라운드에서의 A와 B의 점수가 주어졌을 때, A가 이긴 횟수와, B가 이긴 횟수를 출력하는 프로그램을 만들어라.

입력
첫째 줄에는 정수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄부터는 정수 Ai, Bi (0 ≤ Ai, Bi ≤ 100)가 공백을 사이에 두고 차례대로 주어진다.

출력
첫째 줄에 A가 이긴 횟수와 B가 이긴 횟수를 차례대로 출력하라.

서브태스크
번호	배점	제한
1	60	
N ≤ 100.

2	40	
추가적인 제약 조건이 없다.

예제 입력 1 
4
100 0
5 6
40 50
74 75
예제 출력 1 
1 3

예제 입력 2 
5
20 20
3 95
60 59
40 40
20 19
예제 출력 2 
2 1
 */

public class B240610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int tempA = Integer.parseInt(st.nextToken());
            int tempB = Integer.parseInt(st.nextToken());

            if (tempA > tempB) {
                a++;
            } else if (tempB > tempA) {
                b++;
            }
        }

        System.out.println(a + " " + b);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

