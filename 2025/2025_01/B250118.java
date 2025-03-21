/*
17256번 달달함이 넘쳐흘러
https://www.acmicpc.net/problem/17256


냉장고에서 맛있게 숙성되고 있는 마카롱은 심심한 나머지 새로운 수 체계를 생각해냈다. 
마카롱은 이를 케이크 수라고 이름 붙이고, 다음과 같이 정의했다.

케이크 수는 3개의 자연수 x, y, z로 이루어진 순서쌍이다. (자연수는 1 이상의 정수를 의미한다)
케이크 수 a는 (a.x, a.y, a.z)와 같이 나타낼 수 있다.
또한 마카롱은 케이크 수들을 비교하기 위해 등호 "="도 새로 정의했다.
케이크 수 a, b에 대하여, a = b라는 것은 다음과 같다.

a.x = b.x, a.y = b.y 그리고 a.z = b.z를 동시에 만족한다.

아직 끝나지 않았다. 이 케이크 수는 기존의 수와 다르게 매우 특이한 연산을 적용할 수 있다. 
연산의 이름은 🍰이고 다음과 같이 정의된다!

a 🍰 b = (a.z + b.x, a.y × b.y, a.x + b.z)

케이크와 마카롱 사진

SCCC의 회장 욱제는 케이크 수를 이용해 문제를 만들기로 했다. 
마카롱과 욱제를 기쁘게 하기 위해서 문제를 풀어주자! 욱제가 만든 문제는 다음과 같다.

케이크 수 a, c 가 주어졌을 때, 다음을 만족하는 케이크 수 b를 계산하자.

a 🍰 b = c

a, c는 b가 항상 유일하게 존재하도록 주어진다.

입력
첫째 줄에 케이크 수 a를 구성하는 자연수 a.x, a.y, a.z 가 차례대로 주어진다. (1 ≤ a.x, a.y, a.z ≤ 100)
둘째 줄에 케이크 수 c를 구성하는 자연수 c.x, c.y, c.z 가 차례대로 주어진다. (1 ≤ c.x, c.y, c.z ≤ 100)

출력
문제의 조건을 만족하는 b.x, b.y, b.z를 하나의 공백을 사이에 두고 차례대로 출력한다.

b는 1 ≤ b.x, b.y, b.z ≤ 100 이고 반드시 유일하게 존재한다.

예제 입력 1 
15 16 17
19 32 90
예제 출력 1 
2 2 75

예제 입력 2 
15 8 15
22 8 22
예제 출력 2 
7 1 7
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B250118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrA = new int[3];
        int[] arrC = new int[3];
        int[] result = new int[3];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++) {
                if(i == 0) {
                    arrA[j] = Integer.parseInt(st.nextToken());
                } else {
                    arrC[j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                result[i] = arrC[i] / arrA[i];
            } else {
                result[i] = arrC[i] - arrA[2 - i];
            }

            System.out.print(result[i] + " ");
        }

    }
}
