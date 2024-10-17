/*
29751번 삼각형
https://www.acmicpc.net/problem/29751


양의 정수 W, H가 주어진다. 밑변의 길이가 W이고, 높이가 H인 삼각형의 넓이를 구하시오.

입력
정수 W, H가 공백으로 구분되어 주어진다. (1 <= W, H <= 100) 

출력
밑변의 길이가 W이고, 높이가 H인 삼각형의 넓이를 출력한다. 넓이는 항상 소수점 아래 첫 번째 자리까지 출력한다.

예제 입력 1 
1 1
예제 출력 1 
0.5

예제 입력 2 
2 3
예제 출력 2 
3.0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B241017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double W = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());

        System.out.println(W * H / 2);
    }
}