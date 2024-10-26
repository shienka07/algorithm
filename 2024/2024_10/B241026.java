/*
1297번 TV 크기
https://www.acmicpc.net/problem/1297


김탑은 TV를 사러 인터넷 쇼핑몰에 들어갔다. 
쇼핑을 하던 중에, TV의 크기는 그 TV의 대각선의 길이로 나타낸 다는 것을 알았다. 
하지만, 김탑은 대각선의 길이가 같다고 해도, 
실제 TV의 크기는 다를 수도 있다는 사실에 직접 TV를 보러갈걸 왜 인터넷 쇼핑을 대각선의 길이만 보고있는지 후회하고 있었다.
인터넷 쇼핑몰 관리자에게 이메일을 보내서 실제 높이와 실제 너비를 보내달라고 했지만, 
관리자는 실제 높이와 실제 너비를 보내지 않고 그것의 비율을 보내왔다.
TV의 대각선 길이와, 높이 너비의 비율이 주어졌을 때, 실제 높이와 너비의 길이를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 TV의 대각선 길이 D, TV의 높이 비율 H, TV의 너비 비율 W이 공백 한 칸을 사이에 두고 주어진다.

출력
첫째 줄에 TV의 높이와 TV의 너비를 공백 한 칸을 이용해서 구분지은 후 출력한다. 
만약, 실제 TV의 높이나 너비가 소수점이 나올 경우에는 그 수보다 작으면서 가장 큰 정수로 출력한다. (예) 1.7 -> 1

제한
5 ≤ D ≤ 1,000
1 ≤ H ≤ 99
2 ≤ W ≤ 100
H < W
D, H, W는 정수

예제 입력 1 
52 9 16
예제 출력 1 
25 45

예제 입력 2 
7 2 3
예제 출력 2 
3 5

예제 입력 3 
13 7 10
예제 출력 3 
7 10

예제 입력 4 
7 32 47
예제 출력 4 
3 5

예제 입력 5 
11 15 16
예제 출력 5 
7 8
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B241026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double D = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());
        double W = Double.parseDouble(st.nextToken());

        double pow = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
        double sqrt = Math.sqrt(pow);

        System.out.println((int)(sqrt * H) + " " + (int)(sqrt * W));


    }
}
