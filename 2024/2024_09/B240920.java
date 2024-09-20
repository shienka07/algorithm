/*
15873번 공백 없는 A+B
https://www.acmicpc.net/problem/15873


자연수 A, B가 주어지면 A+B를 구하는 프로그램을 작성하시오.

입력
자연수 A, B (0 < A, B ≤ 10)가 첫 번째 줄에 주어진다. 
단, 두 수의 사이에는 공백이 주어지지 않는다. 두 수의 앞에 불필요한 0이 붙는 경우는 없다.

출력
첫 번째 줄에 A+B의 값을 출력한다.

예제 입력 1 
37
예제 출력 1 
10
예제 입력 2 
102
예제 출력 2 
12
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.charAt(1) == '0') {
            System.out.println(10 + Integer.parseInt(str.substring(2)));
        } else {
            System.out.println(Integer.parseInt(str.substring(0, 1))
                    + Integer.parseInt(str.substring(1)));
        }

    }
}