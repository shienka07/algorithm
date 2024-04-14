/*
10995번 별 찍기 - 20
https://www.acmicpc.net/problem/10995


예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 차례대로 별을 출력한다.

예제 입력 1 
1
예제 출력 1 
*

예제 입력 2 
2
예제 출력 2 
* *
 * *

예제 입력 3 
3
예제 출력 3 
* * *
 * * *
* * *

예제 입력 4 
4
예제 출력 4 
* * * *
 * * * *
* * * *
 * * * *
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B240414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i % 2 !=0 ){
                    System.out.print(" *");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
