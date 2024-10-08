/*
19698번 헛간 청약
https://www.acmicpc.net/problem/19698


농부 존은 소들을 위해 새로운 헛간을 지었다. 
소들의 리더인 암소 베시는 새로운 헛간에 입주할 소들을 추첨으로 정하기로 했다. 
소들은 그동안 모아 왔던 건초 더미를 담보로 추첨에 응모했다.

이번 추첨에는 총 
$N$마리의 소가 응모했다. 헛간은 W X H 크기의 직사각형이다. 
베시는 소 한 마리당 L X L 크기의 공간을 배정할 계획이다.

베시는 헛간을 최대한 효율적으로 나누어 최대한 많은 소를 입주 시키려고 한다. 
헛간에는 최대 몇 마리의 소들이 입주할 수 있는지 출력하라. 
소들이 입주하는 공간의 각 변은 직사각형의 각 변에 대해 수평 혹은 수직이여야 한다.

입력
소들의 수 N, 헛간의 크기 W X H를 나타내는 두 정수 W와 H, 
그리고 소들에게 배정되는 공간의 크기 L이 순서대로 주어진다.

출력
헛간에 최대 몇 마리의 소들이 입주할 수 있는지 출력한다.

제한
1 <= N, W, H, L <= 1,000

예제 입력 1 
7 17 11 5
예제 출력 1 
6
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240912 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int cow = (W / L) * (H / L);
		
		if (cow >= N) {
			System.out.println(N);
		} else {
			System.out.println(cow);
		}
    }
}
