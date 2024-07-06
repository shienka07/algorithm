/*
5026번 박사 과정
https://www.acmicpc.net/problem/5026


동혁이는 박사 학위 논문을 쓰던 중 두 수를 더하는 방법을 까먹었다. 동혁이는 덧셈 문제와 컴퓨터 과학 문제로 이루어진 문제지를 풀어야 군면제를 받을 수 있다.
문제지의 덧셈 문제는 "a+b"와 같은 형식이고, 컴퓨터 과학 문제는 "P=NP" 하나이다. 동혁이의 문제지가 주어졌을 때, 답을 모두 구하는 프로그램을 작성하시오. 

입력
첫째 줄에 문제의 개수 N이 주어진다. (1 ≤ N ≤ 1000) 다음 N개 줄에는 "a+b"형식의 덧셈 문제나 "P=NP"가 주어진다. a,b ∈ [0,1000]이며 a와 b는 정수이다.

출력
P=NP가 문제인 경우에는 skipped를, 덧셈 문제인 경우에는 덧셈한 결과를 출력한다.

예제 입력 1 
4
2+2
1+2
P=NP
0+0
예제 출력 1 
4
3
skipped
0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240706 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                String[] arr = str.split("\\+");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);

                System.out.println(a + b);
            }
        }
    }
}
