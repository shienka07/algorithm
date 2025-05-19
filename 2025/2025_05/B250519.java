/*
10829번 이진수 변환
https://www.acmicpc.net/problem/10829


자연수 N이 주어진다. N을 이진수로 바꿔서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 100,000,000,000,000)

출력
N을 이진수로 바꿔서 출력한다. 이진수는 0으로 시작하면 안 된다.

예제 입력 1 
53
예제 출력 1 
110101
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B250519 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine(), 10);
        String binary = N.toString(2);

        System.out.println(binary);
    }
}
