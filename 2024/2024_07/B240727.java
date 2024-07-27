/*
1550번 16진수
https://www.acmicpc.net/problem/1550


16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 16진수 수가 주어진다. 이 수의 최대 길이는 6글자이다. 
16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다. 또, 이 수는 음이 아닌 정수이다.

출력
첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.

예제 입력 1 
A
예제 출력 1 
10
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int decimal = Integer.parseInt(str, 16);
        System.out.println(decimal);
    }
}