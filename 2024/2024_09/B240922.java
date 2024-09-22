/*
11023번 더하기 3
https://www.acmicpc.net/problem/11023


수 N개가 주어졌을 때, N개의 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100)개의 수가 공백으로 구분되어서 주어진다. 
입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다. 또, 0으로 시작하는 수는 주어지지 않는다.

출력
입력받은 수 N개의 합을 출력한다.

예제 입력 1 
1 2 3 4 5
예제 출력 1 
15

예제 입력 2 
5 4 5 4 2 3 1 2
예제 출력 2 
26
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240922 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = st.countTokens();
		int sum = 0;
		
		for(int i = 0; i < cnt; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
	}
}