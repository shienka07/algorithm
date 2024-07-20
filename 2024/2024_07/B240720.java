/*
10179번 쿠폰
https://www.acmicpc.net/problem/10179


당신은 어떤 물건이라도 20% 할인해주는 쿠폰을 가지고 있다.
원래 가격이 주어질 때, 쿠폰을 사용하면 얼마가 되는지 알려주는 프로그램을 작성하시오.

입력
첫 번째 줄에 테스트케이스의 수가 주어진다.
각 줄에는 물건의 원래가격이 소수점 둘째자리까지 주어진다.

출력
할인된 가격을 달러 단위로 출력한다.

나누어떨어지지 않을 때는 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력한다.

예제 입력 1 
3
100.00
59.99
20.00
예제 출력 1 
$80.00
$47.99
$16.00
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Double temp = Double.parseDouble(br.readLine());
            Double result = temp * 0.8;

            System.out.println("$" + (String.format("%.2f", result)));
        }
    }
}
