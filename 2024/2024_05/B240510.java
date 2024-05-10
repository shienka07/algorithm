/*
23825번 SASA 모형을 만들어보자
https://www.acmicpc.net/problem/23825


당신은 SASA 연못에서 알파벳 S 모양의 블록 N개와 알파벳 A 모양의 블록 M개를 건졌다. 
태영이는 연못에서 건진 블록을 이용해 학교에 전시할 SASA 모형을 최대한 많이 만들려고 한다.

SASA 모형 1개를 만들기 위해서는, 알파벳 S 모양의 블록 2개와 알파벳 A 모양의 블록 2개가 필요하다. 
태영이가 만들 수 있는 SASA 모형 개수의 최댓값을 구하라.

입력
첫째 줄에 알파벳 S 모양의 블록의 개수 N과 알파벳 A 모양의 블록의 개수 M이 공백으로 구분되어 주어진다.

출력
태영이가 만들 수 있는 SASA 모형 개수의 최댓값을 출력한다.

제한
 
1 <= N, M <= 10^9
예제 입력 1 
4 5
예제 출력 1 
2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240510 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int s = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        System.out.println(Math.min(s, a) / 2);
    }
}
