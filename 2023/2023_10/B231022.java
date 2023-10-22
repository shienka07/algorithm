/*
10988번 팰린드롬인지 확인하기
https://www.acmicpc.net/problem/10988


알파벳 소문자로만 이루어진 단어가 주어진다. 
이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

입력
첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

출력
첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

예제 입력 1 
level

예제 출력 1 
1

예제 입력 2 
baekjoon

예제 출력 2 
0
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B231022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String str = br.readLine();
        int n = str.length();
        int answer = 1;

        for(int i = 0; i < n / 2; i++){
            if(str.charAt(i) != str.charAt((n - 1) - i)){
                answer = 0;
                break;
            }
        }

        bw.write(answer + "");
        bw.close();
        br.close();
    }
}
