/*
21964번 선린인터넷고등학교 교가
https://www.acmicpc.net/problem/21964


드높은 남산 위에 우뚝 선
송백은 흰 눈빛에 푸르고
옛부터 흘러가는 한가람
장 할 손 우리 학원 이룩한
굳세고 다함 없는 거룩한 뜻이
백이십년 빛난 역사 자랑이로세
비바람 몰아쳐도 나가자
공들여 쌓은 탑은 빛난다
울려라 삼천리에 힘차게
세워라 반석 위에
선린의터를

선린인터넷고등학교 학생들은 이미 잘 알고 있겠지만, 
학교 교가를 부를 때는 마지막 5글자인 "선린의터를" 부분만 크고 우렁차게 불러야 한다.
정휘는 여기에 영감을 받아, 문자열이 주어지면 마지막 5글자만 우렁차게 읽으려고 한다. 
공백이 없는 문자열이 주어지면 마지막 5글자만 출력하는 프로그램을 작성해보자.

입력
첫 번째 줄에 문자열의 길이 N이 주어진다.
두 번째 줄에는 N글자로 이루어진 문자열 S가 주어진다.

출력
S의 마지막 5글자를 출력한다.

제한
5 <= N <= 100,000

문자열 
S는 알파벳 대문자, 알파벳 소문자, 쉼표(,), 마침표(.)로만 구성되어 있다. 쉼표와 마침표도 각각 한 글자로 센다.

예제 입력 1 
12
Sunrin,Hair.
예제 출력 1 
Hair.

힌트
알파벳 대문자, 알파벳 소문자, 쉼표, 마침표의 아스키 코드는 각각 65-90, 97-122, 44, 46이다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240907 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        System.out.println(S.substring(N-5));
    }
}