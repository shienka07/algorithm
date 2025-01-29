/*
14935번 FA
https://www.acmicpc.net/problem/14935


함수 F(x)는 입력으로 주어진 수 x의 첫 자리와 수 x의 자리수를 곱한 결과를 반환하는 함수이다.
예를 들어 x = 932 일때 F(x)는 9×3으로 27을 반환한다.
입력받은 x에 대해서 함수 F를 수행하고, 나온 결과값에 다시 함수 F를 수행하는 것을 반복한다.
계속 반복해서 수행했을 때 어느 시점에서부터 동일한 수가 나오는 경우, 입력 x를 FA수 라고 한다.
입력 x가 주어졌을때 이 수가 FA 수인지 출력하라.

입력
정수 x 가 주어진다. (0 ≤ x ≤ 10100)

출력
정수 x가 FA수 라면 FA를 출력하고, 아니라면 NFA를 출력한다.

예제 입력 1 
932
예제 출력 1 
FA
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P250129 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        
        System.out.println("FA");
    }
}
