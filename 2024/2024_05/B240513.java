/*
13118번 뉴턴과 사과
https://www.acmicpc.net/problem/13118


사과가 떨어지기를 기다리는 사람들. 그림과 같이 네 명의 사람이 사과가 떨어지기를 기다리고 있다. 
모든 사람은 x축 위의 한 점에 가만히 서 있으며, 여러 사람이 같은 점에 서 있는 경우는 없다. 
i번 (1 ≤ i ≤ 4) 사람은 점 (pi, 0) 위에 있다고 하자. 거대한 좌표평면에 비해 사람은 작은 존재이므로, 편의상 각 사람의 크기는 무시하자.

x축 위에서 기다리는 사람들.
사과는 좌표평면 위의 한 점 (x, y)를 중심으로 하는 반지름이 r인 원이며, 현재 공중에 가만히 떠 있으므로 모든 점이 x축의 위쪽(즉 y > 0인 영역)에 있다.

x축 위에 떠 있는 사과.
사과에는 −y축 방향의 중력만이 작용한다. 
중력의 크기는 일정하므로, 사과는 지표면(x축)을 향해 등가속도 운동을 하다가, x축과 접하게 되는 순간 멈추게 된다고 한다.

x축을 향해 떨어지는 사과.
사람들은 사과가 떨어지기를 기다리면서도, 자신과는 충돌하지 않기를 원하기에, 과연 누가 사과와 충돌하게 될 지를 알고 싶다고 한다. 
사람들의 위치와 사과의 위치 및 반지름이 주어졌을 때, 사과와 충돌하는 사람이 있는지, 있다면 누구인지를 구하는 프로그램을 작성하라.

입력
첫 번째 줄에 사람들의 위치를 나타내는 네 정수 p1, p2, p3, p4 (−109 ≤ p1 < p2 < p3 < p4 ≤ 109)가 공백을 사이로 두고 주어진다. 
i번 (1 ≤ i ≤ 4) 사람은 (pi, 0) 위에 서 있다.
두 번째 줄에 사과의 정보를 나타내는 세 정수 x, y, r (−109 ≤ x ≤ 109, 0 < y ≤ 109, 1 ≤ r ≤ 109)이 공백을 사이로 두고 주어진다.
이 정수들은 사과의 중심이 점 (x, y)에 있고, 사과의 반지름이 r임을 나타낸다. 사과가 x축 위에 떠 있다는 것이 보장된다

출력
첫 번째 줄에 사과와 충돌하는 사람의 번호를 출력한다. 단, 사과와 충돌하는 사람이 없다면 0을 대신 출력한다.

예제 입력 1 
-5 -2 1 5
1 4 2
예제 출력 1 
3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240513 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] people  = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        boolean isCrash = false;
        
        for(int i = 0; i < 4; i++) {
            if(people[i] == x) {
                System.out.println(i + 1);
                isCrash = true;
            }
        }

        if(!isCrash) {
            System.out.println(0);
        }
    }
}