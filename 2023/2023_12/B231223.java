/*
2744번 대소문자 바꾸기
https://www.acmicpc.net/problem/2744


영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

출력
첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.

예제 입력 1 
WrongAnswer
예제 출력 1 
wRONGaNSWER
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B231223 {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(96 < ch && ch < 123){
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }
}