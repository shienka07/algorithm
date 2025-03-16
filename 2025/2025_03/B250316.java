/*
3049번 다각형의 대각선
https://www.acmicpc.net/problem/3049


세 대각선이 한 점에서 만나지 않는 볼록 N각형이 주어졌을 때, 대각선의 교차점의 개수를 세는 프로그램을 작성하시오.
아래 그림은 위의 조건을 만족하는 한 육각형의 교차점 그림이다.
모든 내부각이 180도보다 작은 다각형을 볼록 다각형이라고 한다.

입력
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 100)

출력
첫째 줄에 교차점의 개수를 출력한다.

예제 입력 1 
3
예제 출력 1 
0

예제 입력 2 
4
예제 출력 2 
1

예제 입력 3 
6
예제 출력 3 
15
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N < 4) {
            System.out.println(0);
        } else {
            int result = 1;
            for (int i = 0; i < 4; i++) {
                result *= (N - i);
            }

            result /= (4 * 3 * 2 * 1);

            System.out.println(result);
        }
    }
}
