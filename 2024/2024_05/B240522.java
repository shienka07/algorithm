/*
25628번 햄버거 만들기
https://www.acmicpc.net/problem/25628


햄버거 가게에서 일하는 종현이는 햄버거를 만드는 일을 하고 있다. 
가게에는 햄버거 빵이 A개, 햄버거 패티가 B개 있는데, 이 빵과 패티를 가지고 최대한 햄버거를 많이 만드려고 한다. 
햄버거를 만드는 과정은 아주 간단한 세 단계로 이루어져 있다.

그릇 위에 빵을 놓는다.
빵 위에 패티를 올린다.
패티 위에 다시 빵을 올려서 햄버거를 완성시킨다.
햄버거 빵 A개와 햄버거 패티 B개로 만들 수 있는 햄버거의 최대 개수는 얼마일까? 
단, 햄버거 빵은 위에 놓는 빵과 아래에 놓는 빵의 구분이 없으며, 남는 빵이나 패티가 있어도 된다.

입력
첫째 줄에 햄버거 빵의 개수와 햄버거 패티의 개수를 의미하는 A, B (1 <= A, B <= 100)가 주어진다.

출력
만들 수 있는 햄버거의 최대 개수를 출력한다.

예제 입력 1 
6 3
예제 출력 1 
3

예제 입력 2 
5 4
예제 출력 2 
2

예제 입력 3 
1 7
예제 출력 3 
0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240522 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int berad = Integer.parseInt(st.nextToken());
        int patty = Integer.parseInt(st.nextToken());

        berad /= 2;
        int result = berad < patty ? berad : patty;

        System.out.println(result);
    }
}