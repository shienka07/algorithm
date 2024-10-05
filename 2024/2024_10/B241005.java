/*
15700번 타일 채우기 4
https://www.acmicpc.net/problem/15700


N×M 크기의 벽에 2×1, 1×2 크기의 타일을 채우려고 한다. 겹치지 않게 놓는다면, 최대 몇 개를 채울 수 있을까?

입력
첫째 줄에 N과 M이 주어진다. (1 ≤ N, M ≤ 1,000,000,000)

출력
첫째 줄에 채울 수 있는 타일 개수의 최댓값을 출력한다.

예제 입력 1 
1 2
예제 출력 1 
1

예제 입력 2 
1 3
예제 출력 2 
1

예제 입력 3 
2 2
예제 출력 3 
2

예제 입력 4 
3 3
예제 출력 4 
4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B241005 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long N = Long.parseLong(st.nextToken());
		Long M = Long.parseLong(st.nextToken());
		
		System.out.println(((N * M) / 2));
	}
}