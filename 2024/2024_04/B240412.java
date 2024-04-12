/*
23278번 영화 평가
https://www.acmicpc.net/problem/23278


스타트링크에는 영화 감상 동아리가 있다. 영화 동아리에는 총 N명의 구성원이 있고, 매주 모여서 영화 한 편을 본다.
영화를 본 뒤, 각 사람은 0보다 크거나 같고, 100보다 작거나 같은 정수로 영화를 평가한다. 
모든 구성원이 영화 평가를 마치면 동아리장은 최종 점수를 계산한다.
최종 평점은 가장 낮은 평가 L개와 가장 높은 평가 H개를 뺀 나머지 점수의 평균이다.
영화 감상 동아리의 각 회원이 남긴 평가가 입력으로 주어졌을 때, 최종 점수를 계산해보자.

입력
첫째 줄에 세 정수 N, L, H가 주어진다. 둘째 줄에는 각 구성원이 영화를 평가한 점수가 한 줄에 하나씩 주어진다.

출력
첫째 줄에 최종 점수를 출력한다. 절대/상대 오차는 10-9까지 허용한다.

제한
1 ≤ N ≤ 50
0 ≤ L, H ≤ 50
L+H < N

예제 입력 1 
5 0 0
70 99 96 0 30
예제 출력 1 
59.0

예제 입력 2 
3 1 1
91 90 50
예제 출력 2 
90.0

예제 입력 3 
8 2 3
23 23 23 23 23 23 23 23
예제 출력 3 
23

예제 입력 4 
10 1 4
31 52 20 86 47 76 82 27 42 29
예제 출력 4 
35.2

예제 입력 5 
10 2 2
1 1 0 0 1 1 0 1 0 2
예제 출력 5 
0.6666666666666666
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B240412 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        double sum = 0;

        for(int i = l; i < (n - h); i++) {
            sum += arr[i];
        }

        sum /= (n - l - h);
        System.out.println(sum);
    }
}