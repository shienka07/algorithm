/*
5054번 주차의 신
https://www.acmicpc.net/problem/5054


선영이는 쇼핑하러 긴 도로에 자주 간다. 선영이는 주차를 세상에서 가장 귀찮아 하기 때문에, 아무데나 주차를 한다. 
주차를 한 후에는 가려고 했던 상점으로 걸어 간다.
어느 날, 선영이는 다리가 너무 아파서 병원에 갔다. 의사는 선영이에게 되도록 조금 걷거나, 쇼핑을 하지 말라고 했다. 
선영이는 쇼핑을 버릴 수 없다. 그녀의 특기를 발휘해서 가장 좋은 주차 자리를 찾으려고 한다.
긴 도로는 일직선이다. 또, 모든 상점의 위치는 정수 좌표를 가지고 있다. 
주차장은 모든 정수 좌표마다 하나씩 있으며, 선영이를 위해 항상 비어있다. 
선영이는 주차비를 아끼기 위해서 쇼핑을 마치기 전 까지는 주차한 차를 이동시키지 않을 것이다. 
선영이는 힘이 매우 세기 때문에, 자신이 쇼핑한 물건을 모두 들지 못하는 경우는 없다. 가려고 계획한 상점은 모두 방문해야 한다.

입력
첫째 줄에 테스트 케이스의 개수 t가 주어진다. (1 ≤ t ≤ 100) 모든 테스트 케이스는 두 줄로 이루어져 있다. 
첫째 줄에는 선영이가 방문할 상점의 수 n이 주어지며 (1 ≤ n ≤ 20), 둘째 줄에는 상점의 위치가 주어진다. (0 ≤ xi ≤ 99)

출력
선영이가 가려고 했던 모든 상점을 방문하고 차로 돌아오기 위해 걸어야 하는 거리의 최솟값을 출력한다. 

예제 입력 1 
2
4
24 13 89 37
6
7 30 41 14 39 42
예제 출력 1 
152
70
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B240128 {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int t = Integer.parseInt(br.readLine());

                for(int i = 0; i < t; i++){
                        int n = Integer.parseInt(br.readLine());
                        int sum = 0;
                        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                        int[] xi = new int[n];

                        for(int j = 0; j < n; j++){
                                xi[j] = Integer.parseInt(st.nextToken());
                        }

                        Arrays.sort(xi);

                        for(int k = 0; k < n-1; k++){
                                sum += xi[k+1] - xi[k];
                        }

                        sum *= 2;
                        System.out.println(sum);
                }
        }
}