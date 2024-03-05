/*
2935번 소음
https://www.acmicpc.net/problem/2935


수업 시간에 떠드는 두 학생이 있다. 두 학생은 수업에 집중하는 대신에 글로벌 경제 위기에 대해서 토론하고 있었다. 
토론이 점점 과열되면서 두 학생은 목소리를 높였고, 결국 선생님은 크게 분노하였다.
이렇게 학생들이 수업 시간에 떠드는 문제는 어떻게 해결해야 할까?
얼마전에 초등학교 선생님으로 취직한 상근이는 이 문제를 수학 문제로 해결한다. 
학생들을 진정시키기 위해 칠판에 수학 문제를 써주고, 아이들에게 조용히 이 문제를 풀게 한다. 
학생들이 문제를 금방 풀고 다시 떠드는 것을 방지하기 위해서, 숫자를 매우 크게 한다.
아직 초등학교이기 때문에, 학생들은 덧셈과 곱셈만 배웠다. 
또, 아직 10의 제곱꼴을 제외한 다른 수는 학교에서 배우지 않았기 때문에, 선생님이 써주는 수는 모두 10의 제곱 형태이다.
쉬는 시간까지 문제를 푸는 것을 막기 위해서, 선생님이 써주는 숫자는 최대 100자리이다.
칠판에 쓰여 있는 문제가 주어졌을 때, 결과를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 양의 정수 A가 주어진다.
둘째 줄에 연산자 + 또는 *가 주어진다.
셋째 줄에 양의 정수 B가 주어진다.
A와 B는 모두 10의 제곱 형태이고, 길이는 최대 100자리이다.

출력
첫째 줄에 결과를 출력한다. 결과는 A+B 또는 A*B이며, 입력에서 주어지는 연산자에 의해 결정된다. 

예제 입력 1 
1000
*
100
예제 출력 1 
100000

예제 입력 2 
10000
+
10
예제 출력 2 
10010

예제 입력 3 
10
+
1000
예제 출력 3 
1010

예제 입력 4 
1
*
1000
예제 출력 4 
1000
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B240305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        BigInteger aBi = new BigInteger(a);
        String o = br.readLine();
        String b = br.readLine();
        BigInteger bBi = new BigInteger(b);
        BigInteger result;

        if (o.equals("*")) {
            result =  aBi.multiply(bBi);
        } else {
            result = aBi.add(bBi);
        }

        System.out.println(result);
    }
}
