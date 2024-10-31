/*
3449번 해밍 거리
https://www.acmicpc.net/problem/3449


해밍 거리란 두 숫자의 서로 다른 자리수의 개수이다. 두 이진수가 주어졌을 때, 해밍 거리를 계산하는 프로그램을 작성하시오.

입력
입력을 여러 개의 테스트 케이스로 이루어져 있다. 첫째 줄에는 테스트 케이스의 개수 T가 주어진다. 
각 테스트 케이스는 두 줄로 이루어져 있다. 각 줄에는 이진수가 하나씩 주어진다. 
두 이진수는 길이가 서로 같고, 100자리를 넘지 않는다.

출력
각 테스트 케이스에 대해서, 해밍 거리를 계산한 뒤, "Hamming distance is X."라고 출력한다. X는 해밍 거리이다.

예제 입력 1 
4
0
1
000
000
1111111100000000
0000000011111111
101
000
예제 출력 1 
Hamming distance is 1.
Hamming distance is 0.
Hamming distance is 16.
Hamming distance is 2.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B241031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String X = br.readLine();
            String Y = br.readLine();
            int dif = 0;

            for (int j = 0; j < X.length(); j++) {
                if (X.charAt(j) != Y.charAt(j)){
                    dif++;
                }
            }

            System.out.println("Hamming distance is " + dif + ".");
        }
    }
}