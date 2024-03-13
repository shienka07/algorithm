/*
10599번 페르시아의 왕들
https://www.acmicpc.net/problem/10599


마야는 페르시아의 왕들에 대해 관심이 있다. 그녀는 최근 자신이 좋아하는 왕들의 나이가 궁금해졌고, 검색을 해서 정보를 얻기 시작했다.
하지만 불행하게도 대부분의 경우 정확한 왕의 출생일과 사망일을 얻지 못했고, 대신 출생, 사망했을거라 추정되는 때의 범위를 얻었다. 
예를 들면 키루스 2세는 600BC에서 575BC사이에 출생했고, 530BC에 사망했다. 따라서 키루스 2세는 최소 45살에서 최대 70살의 인생을 살았다.

마야는 자신이 좋아하는 왕들에 대해 출생과 사망의 범위가 적힌 리스트를 길게 만들었다. 
하지만 이 길이가 너무 길기때문에 우리가 왕들 나이의 최소와 최댓값을 대신 구해주자.

만약 왕이 x년도에 태어나고 y년도에 죽었다면 그는 y - x살을 산 것이다.

입력
테스트 케이스는 여러줄에 걸쳐 입력된다. 
각 테스트 케이스는 4개의 정수 a, b, c, d (-5000 ≤ a ≤ b ≤ c ≤ d ≤ 2000)로 이뤄진다. 
[a, b]는 출생일의 범위, [c, d]는 사망일의 범위이다. a, b, c, d의 입력이 모두 0일 경우 프로그램을 종료한다.

출력
각 테스트 케이스마다 최소나이와 최대나이를 공백으로 나눠 출력한다.

예제 입력 1 
100 110 180 185
-600 -575 -530 -530
-25 10 72 86
0 0 0 0
예제 출력 1 
70 85
45 70
62 111
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int birth1 = Integer.parseInt(st.nextToken());
            int birth2 = Integer.parseInt(st.nextToken());
            int death1 = Integer.parseInt(st.nextToken());
            int death2 = Integer.parseInt(st.nextToken());

            if(birth1 == 0 && birth2 == 0 && death1 == 0 && death2 == 0){
                break;
            }

            int age1 = death1 - birth2;
            int age2 = death2 - birth1;

            System.out.println(age1 + " " + age2);
        }
    }
}
