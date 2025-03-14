/*
19532번 수학은 비대면강의입니다
https://www.acmicpc.net/problem/19532


수현이는 4차 산업혁명 시대에 살고 있는 중학생이다. 코로나 19로 인해, 수현이는 버추얼 학교로 버추얼 출석해 버추얼 강의를 듣고 있다. 
수현이의 버추얼 선생님은 문자가 2개인 연립방정식을 해결하는 방법에 대해 강의하고, 다음과 같은 문제를 숙제로 냈다.

다음 연립방정식에서 x와 y의 값을 계산하시오.
[ax+by=c dx+ey=f] 

4차 산업혁명 시대에 숙제나 하고 앉아있는 것보다 버추얼 친구들을 만나러 가는 게 더 가치있는 일이라고 생각했던 수현이는 이런 연립방정식을 풀 시간이 없었다. 
다행히도, 버추얼 강의의 숙제 제출은 인터넷 창의 빈 칸에 수들을 입력하는 식이다. 각 칸에는 -999이상 999이하의 정수만 입력할 수 있다. 
수현이가 버추얼 친구들을 만나러 버추얼 세계로 떠날 수 있게 도와주자.

입력
정수 a, b, c, d, e, f가 공백으로 구분되어 차례대로 주어진다. (-999 <= a,b,c,d,e,f <= 999)
문제에서 언급한 방정식을 만족하는 (x,y)가 유일하게 존재하고, 이 때 x와 y가 각각 -999이상 999이하의 정수인 경우만 입력으로 주어짐이 보장된다.

출력
문제의 답인 x와 y를 공백으로 구분해 출력한다.

예제 입력 1 
1 3 -1 4 1 7
예제 출력 1 
2 -1

예제 입력 2 
2 5 8 3 -4 -11
예제 출력 2 
-1 2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B250206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if((a * x + b * y == c) && (d * x + e * y == f)) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }
}

// 두번째 풀이 - 연립방정식 (가감법) 사용

class B250206_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if((a * x + b * y == c) && (d * x + e * y == f)) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }
}