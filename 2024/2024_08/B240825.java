/*
1267번 핸드폰 요금
https://www.acmicpc.net/problem/1267


동호는 새악대로 T 통신사의 새 핸드폰 옴머나를 샀다. 새악대로 T 통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.

영식 요금제
민식 요금제

영식 요금제는 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이 청구된다. 
만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.
민식 요금제는 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다. 
만약 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.
동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을 작성하시오.

입력
동호가 저번 달에 이용한 통화의 개수 N이 주어진다. N은 20보다 작거나 같은 자연수이다. 둘째 줄에 통화 시간 N개가 주어진다. 
통화 시간은 10,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 싼 요금제의 이름을 출력한다. 그 후에 공백을 사이에 두고 요금이 몇 원 나오는지 출력한다. 
만약 두 요금제의 요금이 모두 같으면 영식을 먼저 쓰고 민식을 그 다음에 쓴다.

영식은 Y로, 민식은 M으로 출력한다.

예제 입력 1 
3
40 40 40
예제 출력 1 
M 45
영식: 20 + 20 + 20 = 60
민식: 15 + 15 + 15 = 45

예제 입력 2 
3
61 61 61
예제 출력 2 
Y M 90

예제 입력 3 
2
61 10
예제 출력 3 
Y 40
영식: 30 + 10 = 40
민식: 30 + 15 = 45

예제 입력 4 
2
60 65
예제 출력 4 
Y M 60
영식: 30 + 30 = 60
민식: 30 + 30 = 60
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int Y = 0;
        int M = 0;
        int temp = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            temp = Integer.parseInt(st.nextToken());
            Y += ((temp / 30) + 1) * 10;
            M += ((temp / 60) + 1) * 15;
        }
        
        String result = "";
        if (Y == M) {
            result = "Y M " + Y;
        } else if (Y < M) {
            result = "Y " + Y;
        } else {
            result = "M " + M;
        }
        
        System.out.println(result);
    }
}
