/*
27310번 :chino_shock:
https://www.acmicpc.net/problem/27310


sait2000은 아니메컵 서버를 열고 나서 가장 먼저 이모지 :chino_shock:부터 추가했다. 
:chino_shock:를 비롯한 여러 이모지를 사용해보던 sait2000은 :chino_shock:와 같이 이름에 언더바(_)가 들어간 이모지가
:chinoaww:와 같이 이름에 언더바가 들어가지 않은 이모지보다 더 타이핑하기 어렵다는 사실을 알게 되었다.
이모지는 하나의 콜론(:)으로 시작해서 하나의 콜론으로 끝나며, 콜론 사이의 문자들은 모두 영어 소문자 혹은 언더바(_) 중 하나로 주어진다. 
sait2000은 이모지의 입력 난이도를 (이모지의 전체 길이) + (콜론의 개수) + (언더바의 개수) * 5 로 정의했다. 
이 정의에 따르면 :chino_shock:의 전체 길이는 13이고 콜론이 2개, 언더바가 1개이므로 입력 난이도가 13+2+1*5=20이 된다.
이모지가 주어졌을 때 이모지의 입력 난이도를 계산해 출력해보자.

입력
첫 번째 줄에 이모지가 주어진다. 주어지는 이모지는 항상 :chino로 시작하고 :로 끝나며, 전체 길이가 7 이상 32 이하이다.

출력
이모지의 입력 난이도를 출력한다.

예제 입력 1 
:chino_shock:
예제 출력 1 
20

예제 입력 2 
:chinoaww:
예제 출력 2 
12

예제 입력 3 
:chino_very_shock:
예제 출력 3 
30
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long len = str.length();
        long cntUB = str.chars().filter(c -> c == '_').count();

        long result = len + 2 + cntUB * 5;

        System.out.println(result);
    }
}
