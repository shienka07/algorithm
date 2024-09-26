/*
26068번 치킨댄스를 추는 곰곰이를 본 임스 2
https://www.acmicpc.net/problem/26068


마음씨 착한 곰곰이는 임스에게 치킨 기프티콘을 여러 번 선물했다.
기프티콘이 있다는 사실을 잊고 있던 임스는 치킨 댄스를 추는 곰곰이를 보고 그 사실이 생각났다.
치킨 기프티콘을 선물받은 횟수 N과 선물의 남은 유효기간이 주어질 때, 임스가 사용할 기프티콘의 개수를 구하시오.
임스는 기프티콘을 아껴 사용하기 위해 유효기간이 90일 이하로 남은 기프티콘만 사용할 것이다.

입력
첫 번째 줄에는 임스가 받은 기프티콘의 개수 정수 N이 주어진다. (1 <= N <= 1,000)
두 번째 줄부터 N개의 줄에 걸쳐 i번째 기프티콘의 남은 유효기간 x_i가 D-xi 와 같은 형식으로 주어진다. 
(1 <= x_i <= 365)

출력
임스가 사용할 기프티콘의 개수를 출력하시오.

예제 입력 1 
3
D-86
D-8
D-6
예제 출력 1 
3

예제 입력 2 
4
D-98
D-5
D-94
D-2
예제 출력 2 
2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int chicken = 0;

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            int day = Integer.parseInt(temp.substring(2));
            if (90 >= day) {
                chicken++;
            }
        }

        System.out.println(chicken);
    }
}