/*
5554번 심부름 가는 길
https://www.acmicpc.net/problem/5554


승균이는 매일 학교, PC방, 학원에 다닌다. 반복되는 일상에 익숙해진 승균이는 이동시간을 단축해서 PC방에 더 오래 머물고 싶었다. 
그래서 스톱워치를 들고 이동할 때마다 기록을 잰 후 집에 가서 분석해보기로 했다.
집에 도착한 승균이는 측정한 결과를 보는 데, 전부 초 단위로 기록되어있다! 
맨날 놀기만 해서 총 이동 시간이 몇 분 몇 초인지 계산을 못 하는 승균이를 도와주자.
하루 동안 측정한 결과가 주어지면, 이날의 총 이동 시간이 몇 분 몇 초인지 출력하는 프로그램을 작성하시오.

입력
입력은 총 4줄이며, 한 줄에 하나씩 양의 정수가 적혀있다.

첫 번째 줄에 집에서 학교까지의 이동 시간을 나타내는 초가 주어진다.
두 번째 줄에 학교에서 PC방까지의 이동 시간을 나타내는 초가 주어진다.
세 번째 줄에 PC방에서 학원까지의 이동 시간을 나타내는 초가 주어진다. 
마지막 줄에 학원에서 집까지의 이동 시간을 나타내는 초가 주어진다.
집에 늦게 가면 혼나기 때문에, 총 이동시간은 항상 1 분 0 초 이상 59 분 59 초 이하이다.

출력
총 이동시간 x 분 y 초를 출력한다. 첫 번째 줄에 x를, 두 번째 줄에 y를 출력한다.

예제 입력 1 
31
34
7
151
예제 출력 1 
3
43

예제 입력 2 
316
430
643
1253
예제 출력 2 
44
2

예제 입력 3 
5
10
15
30
예제 출력 3 
1
0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B231219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for(int i = 0; i < 4; i++){
            int n = Integer.parseInt(br.readLine());
            sum += n;
        }
        int min = sum / 60;
        int sec = sum % 60;

        System.out.println(min);
        System.out.println(sec);
    }
}