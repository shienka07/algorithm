/*
14912번 숫자 빈도수
https://www.acmicpc.net/problem/14912


1부터 n까지 차례대로 써 내려갈 때 특정 숫자(digit)의 빈도수를 구하여 출력하는 프로그램을 작성하시오.
예를 들어, n = 11 이고 숫자 1의 빈도수를 구하라고 하면, 
1 2 3 4 5 6 7 8 9 10 11 에서 숫자 1은 1에서 한 번, 10에서 한 번, 11에서 두 번 나타나므로 
1의 빈도수는 총 4 이다.

입력
자연수 n (1 ≤ n ≤ 100,000)과 한 자리 숫자 d(0~9)가 첫째 줄에 주어진다.

출력
첫째 줄에 빈도수를 출력한다.

예제 입력 1 
11 1
예제 출력 1 
4

예제 입력 2 
100 3
예제 출력 2 
20
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 첫번째 풀이 - 메모리가 많이 들고, 속도가 느림
public class B250205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char d = st.nextToken().charAt(0);
        int count = 0;

        for (int i = 1; i <= n; i++) {
            String numStr = Integer.toString(i);
            
            for (char c : numStr.toCharArray()){
                if(c == d) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}


// 두번째 풀이 - 숫자를 문자열로 변환하는 작업을 최소화
class B250205_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char d = st.nextToken().charAt(0);
        int count = 0;

        for (int i = 1; i <= n; i++) {
            String numStr = Integer.toString(i);
            
            for (char c : numStr.toCharArray()){
                if(c == d) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}