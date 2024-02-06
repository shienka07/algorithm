/*
9437번 사라진 페이지 찾기
https://www.acmicpc.net/problem/9437


꿍은 수능에 응시하고 있었는데 어느덧 4교시 탐구영역 시간이 되었다. 
그런데 탐구영역은 다른 영역과 다르게 자기가 응시할 과목만 고르고 응시하지 않는 과목은 바닥에 버리도록 되어있다. 
꿍이 응시하지 않는 과목을 골라 뽑아내던 중 문득 궁금한게 생겼다. 만약 탐구영역 시험지가 아래와 같이 전체 12쪽으로 되어 있었다고 하자. 
그렇다면 1쪽과 12쪽은 한 면에, 2쪽과 11쪽이 한면에, ... 6쪽과 7쪽이 한면에 인쇄되어 있고 
1,2,11,12쪽이 한 장, 3,4,9,10쪽이 한 장, 5,6,7,8이 한 장 이다.
그래서 만약 꿍이 2쪽이 인쇄된 종이 한 장을 바닥에 버렸을 때, 그 종이에 인쇄된 나머지 쪽, 즉 사라진 페이지들은 1,11,12쪽이다.
꿍이 탐구영역을 응시할 동안 여러분들은 한 쪽의 페이지만으로 사라진 나머지의 페이지들을 찾아주어라.

입력
각 테스트 케이스에 대해 두가지 정수 N,P가 주어진다. 
4의 배수인 N(4 ≤ N ≤ 1000)은 탐구영역의 전체 페이지 수이며, P(1 ≤ P ≤ N)는 선택된 한 페이지다. 입력의 마지막은 하나의 0만 주어진다.

출력
각 테스트 케이스에 대해 사라진 페이지들을 오름차순으로 출력한다.

예제 입력 1 
12 2
12 9
8 3
0
예제 출력 1 
1 11 12
3 4 10
4 5 6
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B240206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());

            if (n == 0) break;

            int p = Integer.parseInt(st.nextToken());
            int[] arr = new int[3];

            if (p % 2 == 0){
                arr[0] = (p - 1);
                arr[1] = (n - (p - 1));
                arr[2] = (n - (p - 2));
            } else {
                arr[0] = (p + 1);
                arr[1] = (n - p);
                arr[2] = (n - (p - 1));
            }

            Arrays.sort(arr);
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        }
    }
}
