/*
5522번 카드 게임
https://www.acmicpc.net/problem/5522


JOI군은 카드 게임을 하고 있다. 
이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라.

입력
표준 입력에서 다음과 같은 데이터를 읽어온다.

i 번째 줄(1 ≤ i ≤ 5)에는 정수 Ai가 적혀있다. 
이것은 i번째 게임에서의 JOI군의 점수를 나타낸다.
출력
표준 출력에 JOI군의 총점을 한 줄로 출력하라.

제한
0 ≤ Ai ≤ 100.
서브태스크
번호	배점	제한
1	   20	  0 ≤ Ai ≤ 10.
2	   80	  추가적인 제약 조건이 없다.

예제 입력 1 
1
2
3
4
5
예제 출력 1 
15

예제 입력 2 
0
100
0
10
100
예제 출력 2 
210
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240505 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.println(sum);
    }
}
