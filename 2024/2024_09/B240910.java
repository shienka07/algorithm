/*
15688번 수 정렬하기 5
https://www.acmicpc.net/problem/15688


N개의 수가 주어졌을 때, 이를 비내림차순으로 정렬하는 프로그램을 작성하시오.
길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
이 수는 절댓값이 1,000,000보다 작거나 같은 정수이며, 같은 수가 여러 번 중복될 수도 있다.

출력
첫째 줄부터 N개의 줄에 비내림차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1 
5
5
4
3
2
1
예제 출력 1 
1
2
3
4
5

예제 입력 2 
5
1
2
1
2
1
예제 출력 2 
1
1
1
2
2

예제 입력 3 
5
1
2
3
4
5
예제 출력 3 
1
2
3
4
5

예제 입력 4 
6
0
0
0
0
0
0
예제 출력 4 
0
0
0
0
0
0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B240910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}