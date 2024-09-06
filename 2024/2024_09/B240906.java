/*
10093번 숫자
https://www.acmicpc.net/problem/10093


두 양의 정수가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램을 작성하시오.

입력
두 정수 A와 B가 주어진다.

출력
첫째 줄에 두 수 사이에 있는 수의 개수를 출력한다.
둘째 줄에는 두 수 사이에 있는 수를 오름차순으로 출력한다.

서브태스크
번호	배점	    제한
1	    30	    1 ≤ A, B ≤ 1000
2	    70	    1 ≤ A, B ≤ 1015, A와 B의 차이는 최대 100,000.

예제 입력 1 
8 14
예제 출력 1 
5
9 10 11 12 13
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240906 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());

        if (A < B) {
            System.out.println(B - A - 1);
            for (Long i = A + 1; i < B; i++) {
                System.out.print(i + " ");
            }
        } else if (A > B) {
            System.out.println(A - B - 1);
            for (Long i = B + 1; i < A; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(0);
        }
    }
}