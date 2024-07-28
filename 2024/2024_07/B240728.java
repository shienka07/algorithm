/*
30999번 민주주의
https://www.acmicpc.net/problem/30999


월간 향유회에서는 민주주의적 다수결 투표 방식으로 문제의 출제 여부를 정한다. 
즉, N개의 문제 후보마다 M명의 출제위원이 찬반 의견을 내고, 과반수의 찬성을 얻은 문제가 출제된다. 
이때 M은 항상 홀수이다.

문제 후보에 대한 출제위원의 찬반 의견이 주어졌을 때, 출제될 문제의 수를 구하여라.

입력
첫 번째 줄에 문제 후보의 수 N과 출제위원의 수 M이 공백으로 구분되어 주어진다. 
(1 <= N <= 100; 1 <= M <= 99; M은 홀수) 

다음 
N줄 각각에 각 문제 후보에 대한 출제위원의 찬반 의견을 나타내는 길이 M의 문자열이 주어진다. 
그중 i번째 문자는 i번째 출제위원이 문제 후보 출제에 찬성하면 O, 아니면 X이다.

출력
출제될 문제의 수를 출력한다.

예제 입력 1 
2 3
OOX
OXX
예제 출력 1 
1
첫 번째 문제는 2명의 찬성을, 두 번째 문제는 1명의 찬성을 얻었다. 
이 중 과반수의 찬성을 얻은 문제는 첫 번째 문제로 총 1개이다.

예제 입력 2 
3 3
OOX
OOX
OOX
예제 출력 2 
3
첫 번째 문제, 두 번째 문제, 세 번째 문제 모두 과반수인 
2명의 찬성을 얻었다.

예제 입력 3 
3 3
OXO
XXO
OOO
예제 출력 3 
2
첫 번째 문제는 2명의 찬성을, 두 번째 문제는 1명의 찬성을, 세 번째 문제는 3명의 찬성을 얻었다. 
이 중 과반수의 찬성을 얻은 문제는 첫 번째 문제와 세 번째 문제로 총 2개이다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int agree = 0;
      
        for (int i = 0; i < N; i++) {
               String str = br.readLine();
               int sum = 0;

                for (int j = 0; j < M; j++) {
                        if (str.charAt(j) == 'O') {
                               sum++;
                        } else {
                               sum--;
                        }
                }
           
                if (sum > 0) {
                       agree++;
                }        
        }

        System.out.println(agree);
     }
}
