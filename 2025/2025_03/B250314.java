/*
1526번 가장 큰 금민수
https://www.acmicpc.net/problem/1526


은민이는 4와 7을 좋아하고, 나머지 숫자는 싫어한다. 금민수는 어떤 수가 4와 7로만 이루어진 수를 말한다.
N이 주어졌을 때, N보다 작거나 같은 금민수 중 가장 큰 것을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. N은 4보다 크거나 같고 1,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 N보다 작거나 같은 금민수 중 가장 큰 것을 출력한다.

예제 입력 1 
100
예제 출력 1 
77

예제 입력 2 
75
예제 출력 2 
74

예제 입력 3 
5
예제 출력 3 
4

예제 입력 4 
474747
예제 출력 4 
474747
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = N; i > 0; i--) {
            if(isGold(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isGold(int num) {
        String temp = Integer.toString(num);
        for (char c: temp.toCharArray()) {
            if (c != '4' && c != '7') {
                return false;
            }
        }

        return true;
    }
}
