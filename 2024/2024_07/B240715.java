/*
30030번 스위트콘 가격 구하기
https://www.acmicpc.net/problem/30030


스위트콘의 가격은 A원이다. A는 100의 배수이다. 
그런데, 스위트콘에 부가가치세 10%를 포함하니 가격이 B원이 되었다.
부가가치세를 포함한 가격 B가 주어질 때, 이를 제외한 가격 A를 구해보자.

입력
첫째 줄에 정수 B(1,100 <= B <= 9,900)가 주어진다. B는 11의 배수이다.

출력
첫째 줄에 부가가치세를 제외한 가격 
A를 출력한다.

예제 입력 1 
1100
예제 출력 1 
1000

예제 입력 2 
2970
예제 출력 2 
2700

예제 입력 3 
9900
예제 출력 3 
9000
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine());

        int result = (B / 11) * 10;
        System.out.println(result);
    }
}
