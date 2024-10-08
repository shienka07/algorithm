/*
10833번 사과
https://www.acmicpc.net/problem/10833


경상북도 특산품인 사과를 학생들에게 나눠주기 위해 여러 학교에 사과를 배정하였다. 
배정된 사과 개수는 학교마다 다를 수 있고, 학생 수도 학교마다 다를 수 있다. 
각 학교에서는 배정된 사과를 모든 학생들에게 똑같이 나눠주되, 남는 사과의 개수를 최소로 하려고 한다. 
(서로 다른 학교에 속한 학생이 받는 사과 개수는 다를 수 있다.)

예를 들어, 5개 학교의 학생 수와 배정된 사과 수가 다음과 같다고 하자.

학교	    A	B	C	D	E
학생 수	    24	13	 5	23	 7
사과 개수	 52	 22	 53	 10	 70
A 학교에서는 모든 학생에게 사과를 두 개씩 나눠주고 4개의 사과가 남게 된다. 
B 학교에서는 모든 학생에게 사과를 한 개씩 나눠주고 9개의 사과가 남게 된다. 
비슷하게 C 학교에서는 3개의 사과가, D 학교에서는 10개의 사과가, E 학교에서는 0개의 사과가 남게 되어, 
남는 사과의 총 수는 4+9+3+10+0 = 26이다. 

각 학교의 학생 수와 사과 개수가 주어졌을 때, 학생들에게 나눠주고 남는 사과의 총 개수를 구하는 프로그램을 작성하시오.

입력
첫 번째 줄에는 학교의 수를 나타내는 정수 N (1 ≤ N ≤ 100)이 주어진다. 
다음 N 개의 줄에 각 학교의 학생 수와 배정된 사과 개수를 나타내는 두 개의 정수가 주어진다. 
학생 수와 사과 개수는 모두 1이상 100이하이다. 

출력
남은 사과의 총 개수를 나타내는 정수를 출력한다.

서브태스크
번호	배점	    제한
1	    11	    N = 1
2	    23	    N = 2
3	    66	    원래의 제약조건 이외에 아무 제약조건이 없다.

예제 입력 1 
5
24 52
13 22
5 53
23 10
7 70
예제 출력 1 
26

예제 입력 2 
3
10 20
5 5
1 13
예제 출력 2 
0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int remain = 0;
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int apple = Integer.parseInt(st.nextToken());
            
            int temp = apple % student;
            remain += temp;
        }
        System.out.println(remain);
    }
}