/*
9610번 사분면
https://www.acmicpc.net/problem/9610


2차원 좌표 상의 여러 점의 좌표 (x,y)가 주어졌을 때, 각 사분면과 축에 점이 몇 개 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 점의 개수 n (1 ≤ n ≤ 1000)이 주어진다. 다음 n개 줄에는 점의 좌표 (xi, yi)가 주어진다. 
(-106 ≤ xi, yi ≤ 106)

출력
각 사분면과 축에 점이 몇 개 있는지를 예제 출력과 같은 형식으로 출력한다.

예제 입력 1 
5
0 0
0 1
1 1
3 -3
2 2
예제 출력 1 
Q1: 2
Q2: 0
Q3: 0
Q4: 1
AXIS: 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240515 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] quadrant = new int[5];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 0 || y == 0) {
                quadrant[0]++;
            } else if (x > 0 && y > 0) {
                quadrant[1]++;
            } else if (x < 0 && y < 0) {
                quadrant[3]++;
            } else if (x < 0 && y > 0) {
                quadrant[2]++;
            } else {
                quadrant[4]++;
            }
        }

        for(int i = 1; i <= 5; i++) {
            if(i == 5){
                System.out.println("AXIS: " + quadrant[0]);
                break;
            }

            System.out.println("Q" + i + ": " + quadrant[i]);
        }
    }
}