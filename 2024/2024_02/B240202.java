/*
28701 세제곱의 합
https://www.acmicpc.net/problem/28701


은하는 수업 때 1부터 N까지 수의 합과 1부터 N까지 수의 세제곱의 합과 관련된 다음 공식을 배웠습니다.
(1 + 2 + ... + N)^2 = 1^3 + 2^3 + ... + N^3
믿을 수 없었던 은하는 직접 코딩을 해서 검증해 보기로 했습니다. 
1부터 N까지 수의 합과 그 수를 제곱한 수, 또 1부터 N까지 수의 세제곱의 합을 차례대로 출력하세요.

입력
첫 줄에 문제의 정수 
$N$이 주어집니다. 
(5 <= N <= 100)

출력
세 줄을 출력하세요.

첫 줄에는 1부터 N까지 수의 합 1+2+...+N을 출력하세요.
둘째 줄에는 1부터 N까지 수의 합을 제곱한 수 (1+2+...+N)^2을 출력하세요.
셋째 줄에는 1부터 N까지 수의 세제곱의 합 1^3+2^3+...+N^3을 출력하세요.

예제 입력 1 
5
예제 출력 1 
15
225
225

첫 줄에는 
1+2+3+4+5 = 15를 출력합니다.
둘째 줄에는 
(1+2+3+4+5)^2 = 15^2 = 225를 출력합니다.
셋째 줄에는 
1^3+2^3+3^3+4^3+5^3 = 1 + 8 + 27 + 64 + 125 = 225를 출력합니다.

예제 입력 2 
100
예제 출력 2 
5050
25502500
25502500

첫 줄에는 
1+2+ ... +100 = 5,050을 출력합니다.
둘째 줄에는 
(1+2+...+100)^2 = {5,050}^2 = 25,502,500을 출력합니다.
셋째 줄에는 
1^3+2^3+...+100^3 = 1 + 8 + ... + 1,000,000 = 25,502,500을 출력합니다.

노트 
a의 제곱은 a를 두 번 곱한 수로, a^2으로 표현합니다. a^2 = a*a입니다. 
또한, a의 세제곱은 a를 세 번 곱한 수로, a^3으로 표현합니다. 
a^3 = a*a*a 입니다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1 ; i <= n; i++){
                sum += i;
        }

        int cubed = 0;
        for(int j = 1; j <= n; j++){
                cubed += (int) Math.pow(j, 3);
        }

        System.out.println(sum);
        System.out.println((int) Math.pow(sum, 2));
        System.out.println(cubed);
    }
}
