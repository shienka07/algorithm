/*
31403번 A + B - C
https://www.acmicpc.net/problem/31403


JavaScript에서 +, -은 수에 대해서는 일반적인 의미의 덧셈 뺄셈의 의미를 가지고 있습니다. 
하지만 문자열에 대해서 +는 두 문자열을 이어붙이라는 의미이고, -는 양쪽 문자열을 수로 해석한 이후에 빼라는 의미입니다.
A, B, C를 각각 수와 문자열로 생각했을 때 A+B-C를 출력하세요.

입력
첫 줄에는 정수 A가 주어집니다. (1 <= A <= 1,000) 
둘째 줄에는 정수 B가 주어집니다. (1 <= B <= 1,000)
셋째 줄에는 정수 C가 주어집니다. (1 <= C <= 1,000)
주어지는 모든 수는 0으로 시작하지 않는 양의 정수입니다.

출력
첫 줄에는 A, B, C를 수로 생각했을 때, A+B-C를 출력하세요.
둘째 줄에는 A, B, C를 문자열로 생각했을 때, A+B-C를 출력하세요.

예제 입력 1 
3
4
5
예제 출력 1 
2
29
 
A, B, C를 수로 생각했을 때는, 3+4-5 = 7 - 5 = 2입니다.
A, B, C를 문자열로 생각했을 때는, '3' + '4' - '5' = '34' - '5' = '29'입니다.

노트
A+B-C는 수와 문자열 모두에서 +를 먼저 계산 한 이후 -를 계산합니다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240624 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int num = A + B - C;
        System.out.println(num);

        String strA = Integer.toString(A);
        String strB = Integer.toString(B);

        String word = strA + strB;
        int result = Integer.parseInt(word) - C;

        System.out.println(result);
    }
}
