/*
14581번 팬들에게 둘러싸인 홍준
https://www.acmicpc.net/problem/14581


홍준은 참 팬이 많다. 이를 본 구사과는 BOJ 슬랙에서 이모티콘을 만들었다.

선풍기 모양의 이모티콘은 :fan: 이고, 홍준의 이모티콘은 :(홍준의 아이디): 이다. 
홍준의 아이디가 주어지면 구사과가 만든 이모티콘을 출력하는 프로그램을 작성하여라. 
자세한 출력 방식은 입출력 형식을 참고하면 된다.

입력
첫 번째 줄에 홍준의 아이디를 입력받는다. 
홍준의 아이디는 길이가 20 이하인 문자열이며, 알파벳 소문자, 알파벳 대문자, 숫자로만 이루어졌다.

출력
3개의 줄에 걸쳐, 팬들에게 둘러싸인 홍준의 모습을 출력한다.

예제 입력 1 
appa
예제 출력 1 
:fan::fan::fan:
:fan::appa::fan:
:fan::fan::fan:

예제 입력 2 
h0ngjun7
예제 출력 2 
:fan::fan::fan:
:fan::h0ngjun7::fan:
:fan::fan::fan:
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B240419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(int i = 0; i < 9; i++) {
            if (i == 4) {
                System.out.print(":" + str + ":");
            } else if(i == 2 || i == 5) {
                System.out.print(":fan:\n");
            } else {
                System.out.print(":fan:");
            }
        }
    }
}