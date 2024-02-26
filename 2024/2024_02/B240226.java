/*
23813번 회전
https://www.acmicpc.net/problem/23813


정수 N이 주어질 때, N의 일의 자리 숫자를 떼서 제일 앞자리 왼쪽에 이어 붙힌 것을 N의 회전이라고 정의하자. 
예를 들어, 12345의 회전은 51234가 된다. 3의 회전은 3이 된다. 
이렇게 회전을 계속하다 보면 원래 N으로 돌아오게 된다. 
원래 N으로 돌아올 때까지의 N을 회전하여 나온 수를 모두 더한 값을 출력하시오.

입력
모든 자리의 숫자가 다른 정수 N이 주어진다. 
각 자리의 숫자는 1이상이고, 1 <= N <= 987,654,321이다.

출력
N의 회전 결과들을 모두 더한 값을 출력한다. 
단, 결과값을 32비트 정수형으로 처리할 수 없을 수 있음에 유의하라.

예제 입력 1 
12345
예제 출력 1 
166665
힌트
51234 + 45123 + 34512 + 23451 + 12345 = 166665
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240226 {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String n = br.readLine();
                long sum = 0;

                for(int i = 0; i < n.length() ; i++){
                        String temp = n.substring(n.length()-1);
                        temp += n.substring(0, n.length()-1);
                        sum += Integer.parseInt(temp);
                        n = temp;
                }

                System.out.println(sum);
        }
}
