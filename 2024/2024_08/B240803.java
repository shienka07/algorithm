/*
15680번 연세대학교
https://www.acmicpc.net/problem/15680


연세대학교의 영문명은 YONSEI, 슬로건은 Leading the Way to the Future이다.
이를 출력하는 프로그램을 작성해보도록 하자.

입력
첫째 줄에 N이 주어진다. (N = 0 또는 1)

출력
N = 0일 경우: 연세대학교의 영문명을 출력한다.
N = 1일 경우: 연세대학교의 슬로건을 출력한다.
대소문자 구별에 주의하도록 하자.

예제 입력 1 
0
예제 출력 1 
YONSEI
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240803 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str;
        
        if (N == 0) {
            str = "YONSEI";
        } else {
            str = "Leading the Way to the Future";
        }
        
        System.out.println(str);
    }
}
