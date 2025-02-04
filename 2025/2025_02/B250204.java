/*
3062번 수 뒤집기
https://www.acmicpc.net/problem/3062


수 124를 뒤집으면 421이 되고 이 두 수를 합하면 545가 된다. 
124와 같이 원래 수와 뒤집은 수를 합한 수가 좌우 대칭이 되는지 테스트 하는 프로그램을 작성하시오.

입력
입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄에 하나의 정수 N(10 ≤ N ≤ 100000)이 주어진다.

출력
각 테스트 케이스에 대해서 원래 수와 뒤집은 수를 합한 수가 좌우 대칭이 되면 YES를 아니면 NO를 한 줄에 하나씩 출력한다.

예제 입력 1 
4
13
58
120
5056

예제 출력 1 
YES
NO
YES
NO
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String num = br.readLine();
            String reNum = "";
            String result = "YES";

            for(int j = num.length()-1; j >= 0; j--) {
                reNum += num.charAt(j);
            }
            int sum = Integer.parseInt(num) + Integer.parseInt(reNum);

            String sumStr = Integer.toString(sum);
            for(int k = 0; k < sumStr.length() / 2; k++) {
                if(sumStr.charAt(k) != sumStr.charAt(sumStr.length()-k-1)) {
                    result = "NO";
                    break;
                }
            }

            System.out.println(result);
        }
    }
}