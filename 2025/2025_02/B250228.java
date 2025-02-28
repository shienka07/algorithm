/*
1439번 뒤집기
https://www.acmicpc.net/problem/1439


다솜이는 0과 1로만 이루어진 문자열 S를 가지고 있다. 다솜이는 이 문자열 S에 있는 모든 숫자를 전부 같게 만들려고 한다. 
다솜이가 할 수 있는 행동은 S에서 연속된 하나 이상의 숫자를 잡고 모두 뒤집는 것이다. 뒤집는 것은 1을 0으로, 0을 1로 바꾸는 것을 의미한다.
예를 들어 S=0001100 일 때, 전체를 뒤집으면 1110011이 된다.
4번째 문자부터 5번째 문자까지 뒤집으면 1111111이 되어서 2번 만에 모두 같은 숫자로 만들 수 있다.
하지만, 처음부터 4번째 문자부터 5번째 문자까지 문자를 뒤집으면 한 번에 0000000이 되어서 1번 만에 모두 같은 숫자로 만들 수 있다.
문자열 S가 주어졌을 때, 다솜이가 해야하는 행동의 최소 횟수를 출력하시오.

입력
첫째 줄에 문자열 S가 주어진다. S의 길이는 100만보다 작다.

출력
첫째 줄에 다솜이가 해야하는 행동의 최소 횟수를 출력한다.

예제 입력 1 
0001100
예제 출력 1 
1

예제 입력 2 
11111
예제 출력 2 
0

예제 입력 3 
00000001
예제 출력 3 
1

예제 입력 4 
11001100110011000001
예제 출력 4 
4

예제 입력 5 
11101101
예제 출력 5 
2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250228 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int zero = 0;
        int one = 0;

        if (temp.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }

        for (int i = 1; i < temp.length(); i++) {
            if (temp.charAt(i - 1) != temp.charAt(i)) {
                if(temp.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }

        System.out.println( Math.min(zero, one));
    }
}
