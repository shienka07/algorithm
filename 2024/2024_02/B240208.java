/*
1357번 뒤집힌 덧셈
https://www.acmicpc.net/problem/1357


어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다. 
Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자. 
예를 들어, X=123일 때, Rev(X) = 321이다. 그리고, X=100일 때, Rev(X) = 1이다.
두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오

입력
첫째 줄에 수 X와 Y가 주어진다. X와 Y는 1,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 문제의 정답을 출력한다.

예제 입력 1 
123 100
예제 출력 1 
223

예제 입력 2 
111 111
예제 출력 2 
222

예제 입력 3 
5 5
예제 출력 3 
1

예제 입력 4 
1000 1
예제 출력 4 
2

예제 입력 5 
456 789
예제 출력 5 
1461
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int xLen = str[0].length();
        int yLen = str[1].length();
        String x = "";
        String y = "";

        for(int i = xLen-1; i >= 0; i--){
            x += Character.toString(str[0].charAt(i));
        }

        for(int i = yLen-1; i >= 0; i--){
            y += Character.toString(str[1].charAt(i));
        }

        int sum = Integer.parseInt(x) + Integer.parseInt(y);

        int sumLen = (int)(Math.log10(sum)+1);
        String temp = Integer.toString(sum);
        String revxy = "";

        for(int i = sumLen-1; i >= 0; i--){
            revxy += Character.toString(temp.charAt(i));
        }

        System.out.println(Integer.parseInt(revxy));
    }
}
