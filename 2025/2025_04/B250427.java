/*
29766번 DKSH찾기
https://www.acmicpc.net/problem/29766


학교의 로고인 DKSH는 Dankook University Software High School의 약자이다.
D, K, S, H로만 이루어진 문자열이 주어진다. 이 문자열에서 DKSH가 몇 번 나타나는지 구해보자.

입력
첫째 줄에 문자열이 입력된다. 문자열의 길이는 1,000을 넘지 않는다.

출력
첫째 줄에 입력된 문자열에서 DKSH가 몇 번 나타나는지 출력한다.

예제 입력 1 
DKKSSH
예제 출력 1 
0
DKKSSH에는 DKSH가 나타나지 않는다.

예제 입력 2 
HDKSHDDKS
예제 출력 2 
1
HDKSHDDKS로 DKSH가 1번 나타난다.

예제 입력 3 
SDKSHSSDKSHS
예제 출력 3 
2
SDKSHSSDKSHS로 DKSH가 2번 나타난다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        for (int i = 0; i <= s.length() - 4; i++) { // 4글자씩 검사
            if (s.substring(i, i + 4).equals("DKSH")) {
                count++;
            }
        }

        System.out.println(count);
    }
}