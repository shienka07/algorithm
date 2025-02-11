/*
1755번 숫자놀이
https://www.acmicpc.net/problem/1755


79를 영어로 읽되 숫자 단위로 하나씩 읽는다면 "seven nine"이 된다. 80은 마찬가지로 "eight zero"라고 읽는다. 
79는 80보다 작지만, 영어로 숫자 하나씩 읽는다면 "eight zero"가 "seven nine"보다 사전순으로 먼저 온다.

문제는 정수 M, N(1 ≤ M ≤ N ≤ 99)이 주어지면 M 이상 N 이하의 정수를 숫자 하나씩 읽었을 때를 기준으로 사전순으로 정렬하여 출력하는 것이다.

입력
첫째 줄에 M과 N이 주어진다.

출력
M 이상 N 이하의 정수를 문제 조건에 맞게 정렬하여 한 줄에 10개씩 출력한다.

예제 입력 1 
8 28
예제 출력 1 
8 9 18 15 14 19 11 17 16 13
12 10 28 25 24 21 27 26 23 22
20
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class B250211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        String[] numWords = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
        };

        List<Pair> result = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            String temp = (i >= 10 ? numWords[i / 10] + " " : "") + numWords[i % 10];
            result.add(new Pair(i, temp));
        }

        result.sort((a, b) -> a.word.compareTo(b.word));

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).num);
            if (i % 10 == 9 || i == result.size() - 1){
                System.out.print("\n");
            } else {
                System.out.print(" ");
            }
        }
    }

    static class Pair {
        int num;
        String word;

        Pair(int num, String word) {
            this.num = num;
            this.word = word;
        }
    }
}