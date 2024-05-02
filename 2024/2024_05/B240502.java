/*
16212번 정열적인 정렬
https://www.acmicpc.net/problem/16212


형준이는 수열을 하나 가지고 있다. 형준이는 수열을 정열적으로 정렬해보려 한다. 
과연, 정렬할 수 있을까?

입력
첫째 줄에는 수열의 길이 N (1 ≤ N ≤ 500,000)이 주어진다.

둘째 줄에는 수열의 각 원소 ai가 공백을 사이에 두고 차례대로 주어진다. 
ai의 절댓값은 200만 이하이다.

출력
수열 a를 오름차순으로 정렬해서, 공백을 사이에 두고 하나씩 차곡차곡 출력하자.

서브태스크 1 (10점)
정렬하려 하는 배열의 길이 N이 N ≤ 1,000을 만족한다.

서브태스크 2 (15점)
문제에 제시된 조건 이외의 다른 제약은 없다.

예제 입력 1 
6
14 5 8 7 1 10
예제 출력 1 
1 5 7 8 10 14
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B240502 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
