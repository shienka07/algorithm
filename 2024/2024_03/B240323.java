/*
10987번 모음의 개수
https://www.acmicpc.net/problem/10987


알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

출력
첫째 줄에 모음의 개수를 출력한다.

예제 입력 1 
baekjoon
예제 출력 1 
4
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B240323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;

        for(int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') 
                cnt++;
        }
        
        System.out.println(cnt);
    }
}

