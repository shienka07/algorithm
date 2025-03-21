/*
11944번 NN
https://www.acmicpc.net/problem/11944


문제는 매우 간단하다. N을 N번 출력하는 프로그램을 작성하여라. 
다만, 답이 길어지는 경우 답의 앞 M자리만 출력한다.

입력
첫 번째 줄에는 N, M이 주어진다. (1 ≤ N, M ≤ 2016)

출력
N을 N번 출력한다. 만약 답이 길어지면 답의 앞 M자리를 출력한다.

예제 입력 1 
20 16
예제 출력 1 
2020202020202020
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B241024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String str = "";

        for (int i = 0; i < N; i++) {
            str += N;
        }

        int len = str.length();
        if (len > M) {
            str = str.substring(0, M);
        }

        System.out.println(str);
    }
}
