/*
1978번 소수 찾기
https://www.acmicpc.net/problem/1978


주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. 
N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력 1 
4
1 3 5 7

예제 출력 1 
3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B231028 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;

        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(st.nextToken());
            boolean isPrime = true;
            if(a == 1) {
                continue;
            }
            for(int j = 2; j <= Math.sqrt(a); j++){
                if(a % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                cnt++;
            }
        }

        System.out.print(cnt);
        br.close();
    }
}