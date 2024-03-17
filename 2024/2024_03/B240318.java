/*
5586번 JOI와 IOI
https://www.acmicpc.net/problem/5586


입력으로 주어지는 문자열에서 연속으로 3개의 문자가 JOI 또는 IOI인 곳이 각각 몇 개 있는지 구하는 프로그램을 작성하시오. 
문자열은 알파벳 대문자로만 이루어져 있다. 예를 들어, 아래와 같이 "JOIOIOI"에는 JOI가 1개, IOI가 2개 있다.

"JOIOIOI"

입력
첫째 줄에 알파벳 10000자 이내의 문자열이 주어진다. 

출력
첫째 줄에 문자열에 포함되어 있는 JOI의 개수, 둘째 줄에 IOI의 개수를 출력한다.

예제 입력 1 
JOIJOI
예제 출력 1 
2
0

예제 입력 2 
JOIOIOIOI
예제 출력 2 
1
3

예제 입력 3 
JOIOIJOINXNXJIOIOIOJ
예제 출력 3 
2
3
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240318 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int joi = 0;
        int ioi = 0;

        for(int i = 0; i < str.length()-2; i++)
        {
            if(str.charAt(i) == 'J' && str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I')
                joi += 1;

            if(str.charAt(i) == 'I' && str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I')
                ioi += 1;
        }

        System.out.println(joi);
        System.out.println(ioi);
    }
}


