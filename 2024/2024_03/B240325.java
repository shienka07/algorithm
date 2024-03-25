/*
7795번 먹을 것인가 먹힐 것인가
https://www.acmicpc.net/problem/7795


심해에는 두 종류의 생명체 A와 B가 존재한다. A는 B를 먹는다. A는 자기보다 크기가 작은 먹이만 먹을 수 있다. 
예를 들어, A의 크기가 {8, 1, 7, 3, 1}이고, B의 크기가 {3, 6, 1}인 경우에 A가 B를 먹을 수 있는 쌍의 개수는 7가지가 있다. 
8-3, 8-6, 8-1, 7-3, 7-6, 7-1, 3-1.
두 생명체 A와 B의 크기가 주어졌을 때, A의 크기가 B보다 큰 쌍이 몇 개나 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 A의 수 N과 B의 수 M이 주어진다. 
둘째 줄에는 A의 크기가 모두 주어지며, 셋째 줄에는 B의 크기가 모두 주어진다. 크기는 양의 정수이다. (1 ≤ N, M ≤ 20,000) 

출력
각 테스트 케이스마다, A가 B보다 큰 쌍의 개수를 출력한다.

예제 입력 1 
2
5 3
8 1 7 3 1
3 6 1
3 4
2 13 7
103 11 290 215
예제 출력 1 
7
1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B240325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Integer[] aArr = new Integer[n];
            Integer[] bArr = new Integer[m];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                aArr[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                bArr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(aArr, Collections.reverseOrder());
            Arrays.sort(bArr, Collections.reverseOrder());

            int temp = 0;

            for(int j = 0; j < n; j++) {
                int cnt = 0;
                for(int k = 0; k < m; k++) {
                    if(aArr[j] > bArr[k]) {
                        temp += (m - cnt);
                        break;
                    } else {
                        cnt++;
                    }
                }
            }

            System.out.println(temp);
        }
    }
}
