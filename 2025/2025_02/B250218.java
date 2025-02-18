/*
17608번 막대기
https://www.acmicpc.net/problem/17608


아래 그림처럼 높이만 다르고 (같은 높이의 막대기가 있을 수 있음) 모양이 같은 막대기를 일렬로 세운 후, 왼쪽부터 차례로 번호를 붙인다. 
각 막대기의 높이는 그림에서 보인 것처럼 순서대로 6, 9, 7, 6, 4, 6 이다. 
일렬로 세워진 막대기를 오른쪽에서 보면 보이는 막대기가 있고 보이지 않는 막대기가 있다. 
즉, 지금 보이는 막대기보다 뒤에 있고 높이가 높은 것이 보이게 된다. 예를 들어, 그림과 같은 경우엔 3개(6번, 3번, 2번)의 막대기가 보인다.

N개의 막대기에 대한 높이 정보가 주어질 때, 오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램을 작성하려고 한다.

입력
첫 번째 줄에는 막대기의 개수를 나타내는 정수 N (2 ≤ N ≤ 100,000)이 주어지고 
이어지는 N줄 각각에는 막대기의 높이를 나타내는 정수 h(1 ≤ h ≤ 100,000)가 주어진다.

출력
오른쪽에서 N개의 막대기를 보았을 때, 보이는 막대기의 개수를 출력한다.

예제 입력 1 
6
6
9
7
6
4
6
예제 출력 1 
3

예제 입력 2 
5
5
4
3
2
1
예제 출력 2 
5
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B250218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int standard = stack.pop();
        for (int i = 0; i < N - 1; i++) {
            int temp = stack.pop();
            if (standard < temp) {
                result++;
                standard = temp;
            }
        }

        System.out.println(result);
    }
}

