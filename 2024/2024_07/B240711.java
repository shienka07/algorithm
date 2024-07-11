/*
10474번 분수좋아해?
https://www.acmicpc.net/problem/10474


당신은 학생들의 기초수학 학습을 돕는 소프트웨어를 개발하는 팀의 개발자이다. 
당신은 가분수를 대분수(?)로 출력하는 부분을 개발해야 한다. 
진분수는 분자가 분모보다 작은 분수이다; 대분수는 정수부를 따로 떼어주고 남는 부분을 진분수로 쓰는 기법이다. 
예제로, 27/12는 대분수로 2 3/12이다. 기약분수로 만들지 말아야 한다.(3/12를 1/4로 바꿔 출력하지 마시오.)

입력
한 줄에 걸쳐 한 테스트 케이스가 입력된다. 각각의 테스트 케이스는 [1, 2^31 - 1]범위의 두 정수가 입력된다. 
첫 번째 정수는 분자고 두 번째는 분모이다. "0 0" 입력이 들어오는 라인에서 입력을 종료한다.

출력
각 테스트 케이스에 대해 한 줄에 걸쳐 주어진 입력에 맞는 대분수를 공백토큰으로 구분하여 출력하라.

예제 입력 1 
27 12
2460000 98400
3 4000
0 0
예제 출력 1 
2 3 / 12
25 0 / 98400
0 3 / 4000
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            int mixed = a / b;
            int tf = a % b;

            System.out.println(mixed + " " + tf + " / " + b);
        }
    }
}
