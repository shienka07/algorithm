/*
24736번 Football Scoring
https://www.acmicpc.net/problem/24736


There are five ways to score points in american professional football:

Touchdown - 6 points
Field Goal - 3 points
Safety - 2 points
After touchdown
1 point (Field Goal or Safety) - Typically called the “Point after”
2 points (touchdown) - Typically called the “Two-point conversion”
(https://operations.nfl.com/the-rules/nfl-video-rulebook/scoring-plays/)

Given the box score values for two competing teams, calculate the point total for each team.

입력
There are two lines of input each containing five space-separated non-negative integers,
T, F, S, P and C representing the number of Touchdowns, Field goals, Safeties, 
Points-after-touchdown and two-point Conversions after touchdown respectively. 
(0 ≤ T ≤ 10), (0 ≤ F ≤ 10), (0 ≤ S ≤ 10), (0 ≤ (P+C) ≤ T). 
The first line represents the box score for the visiting team, 
and the second line represents the box score for the home team.

출력
The single output line consists of two space-separated integers showing 
the visiting score and the home score respectively.

예제 입력 1 
1 3 0 0 1
3 1 1 1 1
예제 출력 1 
17 26
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240511 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[10];
        int n = 0;

        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < 5; j++) {
                score[n] = Integer.parseInt(st.nextToken());
                n++;
            }
        }

        int visitingT = (score[0] * 6) + (score[1] * 3) + (score[2] * 2) + score[3] + (score[4] * 2);
        int homeT = (score[5] * 6) + (score[6] * 3) + (score[7] * 2) + score[8] + (score[9] * 2);

        System.out.println(visitingT + " " + homeT);
    }
}