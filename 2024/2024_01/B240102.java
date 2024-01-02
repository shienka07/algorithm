/*
11549번 Identifying tea
https://www.acmicpc.net/problem/11549


Blind tea tasting is the skill of identifying a tea by using only your senses of smell and taste.
As part of the Ideal Challenge of Pure-Tea Consumers (ICPC), a local TV show is organized. 
During the show, a full teapot is prepared and five contestants are handed a cup of tea each. 
The participants must smell, taste and assess the sample so as to identify the tea type, which can be: 
(1) white tea; (2) green tea; (3) black tea; or (4) herbal tea. 
At the end, the answers are checked to determine the number of correct guesses.
Given the actual tea type and the answers provided, determine the number of contestants who got the correct answer.

입력
The first line contains an integer T representing the tea type (1 ≤ T ≤ 4). 
The second line contains five integers A, B, C, D and E, 
indicating the answer given by each contestant (1 ≤ A, B, C, D, E ≤ 4).

출력
Output a line with an integer representing the number of contestants who got the correct answer.

예제 입력 1 
1
1 2 3 2 1
예제 출력 1 
2

예제 입력 2 
3
4 1 1 2 1
예제 출력 2 
0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for(int i = 0 ; i < 5; i++){
            if(t == Integer.parseInt(st.nextToken())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
