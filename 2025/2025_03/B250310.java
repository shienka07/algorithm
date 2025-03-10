/*
13300번 방 배정
https://www.acmicpc.net/problem/13300


정보 초등학교에서는 단체로 2박 3일 수학여행을 가기로 했다. 
여러 학년이 같은 장소로 수학여행을 가려고 하는데 1학년부터 6학년까지 학생들이 묵을 방을 배정해야 한다. 
남학생은 남학생끼리, 여학생은 여학생끼리 방을 배정해야 한다. 또한 한 방에는 같은 학년의 학생들을 배정해야 한다. 
물론 한 방에 한 명만 배정하는 것도 가능하다.

한 방에 배정할 수 있는 최대 인원 수 K가 주어졌을 때, 조건에 맞게 모든 학생을 배정하기 위해 필요한 방의 최소 개수를 구하는 프로그램을 작성하시오.
예를 들어, 수학여행을 가는 학생이 다음과 같고 K = 2일 때 12개의 방이 필요하다. 
왜냐하면 3학년 남학생을 배정하기 위해 방 두 개가 필요하고 4학년 여학생에는 방을 배정하지 않아도 되기 때문이다.

학년	여학생	     남학생
1학년	영희	    동호, 동진
2학년	혜진, 상희	 경수
3학년	경희	    동수, 상철, 칠복
4학년	 	       달호
5학년	정숙	    호동, 건우
6학년	수지	    동건

입력
표준 입력으로 다음 정보가 주어진다. 
첫 번째 줄에는 수학여행에 참가하는 학생 수를 나타내는 정수 N(1 ≤ N ≤ 1,000)과 
한 방에 배정할 수 있는 최대 인원 수 K(1 < K ≤ 1,000)가 공백으로 분리되어 주어진다. 
다음 N 개의 각 줄에는 학생의 성별 S와 학년 Y(1 ≤ Y ≤ 6)가 공백으로 분리되어 주어진다. 
성별 S는 0, 1중 하나로서 여학생인 경우에 0, 남학생인 경우에 1로 나타낸다. 

출력
표준 출력으로 학생들을 모두 배정하기 위해 필요한 최소한의 방의 수를 출력한다.

서브태스크
번호	배점	  제한
1	    2	    입력 예시로 주어진 입력만 존재한다.
2	    10	    1학년 남학생만 참가하는 것으로 가정한다.
3	    20	    1학년만 참가하는 것으로 가정한다.
4	    68	    원래의 제약조건 이외에 아무 제약조건이 없다.

예제 입력 1 
16 2
1 1
0 1
1 1
0 2
1 2
0 2
0 3
1 3
1 4
1 3
1 3
0 6
1 5
0 5
1 5
1 6
예제 출력 1 
12

예제 입력 2 
3 3
0 3
1 5
0 6
예제 출력 2 
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B250310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()); 
        int[][] students = new int[2][7]; 

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            students[S][Y]++;
        }

        int rooms = 0;
        for (int gender = 0; gender < 2; gender++) {
            for (int grade = 1; grade <= 6; grade++) {
                if (students[gender][grade] > 0) {
                    rooms += (students[gender][grade] + K - 1) / K;
                }
            }
        }

        System.out.println(rooms);
    }
}
