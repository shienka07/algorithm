/*
9933번 민균이의 비밀번호
https://www.acmicpc.net/problem/9933


창영이는 민균이의 컴퓨터를 해킹해 텍스트 파일 하나를 자신의 메일로 전송했다. 
파일에는 단어가 한 줄에 하나씩 적혀있었고, 이 중 하나는 민균이가 온라인 저지에서 사용하는 비밀번호이다.
파일을 살펴보던 창영이는 모든 단어의 길이가 홀수라는 사실을 알아내었다. 
그리고 언젠가 민균이가 이 목록에 대해서 얘기했던 것을 생각해냈다. 
민균이의 비밀번호는 목록에 포함되어 있으며, 비밀번호를 뒤집어서 쓴 문자열도 포함되어 있다.
예를 들어, 민균이의 비밀번호가 "tulipan"인 경우에 목록에는 "napilut"도 존재해야 한다. 
알 수 없는 이유에 의해 모두 비밀번호로 사용 가능하다고 한다.
민균이의 파일에 적혀있는 단어가 모두 주어졌을 때, 비밀번호의 길이와 가운데 글자를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 수 N (2 ≤ N ≤ 100)이 주어진다. 다음 N개 줄에는 파일에 적혀있는 단어가 한 줄에 하나씩 주어진다.
단어는 알파벳 소문자로만 이루어져 있으며, 길이는 2보다 크고 14보다 작은 홀수이다.

출력
첫째 줄에 비밀번호의 길이와 가운데 글자를 출력한다. 항상 답이 유일한 경우만 입력으로 주어진다.

예제 입력 1 
4
las
god
psala
sal
예제 출력 1 
3 a

예제 입력 2 
4
kisik
ptq
tttrp
tulipan
예제 출력 2 
5 s
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B250416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        for (String s : list) {
            String reversed = new StringBuilder(s).reverse().toString();

            if (list.contains(reversed)) {
                int len = s.length();
                char middle = s.charAt(len / 2);
                System.out.println(len + "\n" + middle);
                return;
            }
        }
    }
}
