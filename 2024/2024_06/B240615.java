/*
11945번 뜨거운 붕어빵
https://www.acmicpc.net/problem/11945


고려대학교에 입학한 새내기 호돌이는 안암역을 지나다가 한 붕어빵 장수를 만났어요.
“안녕, 안녕, 안녕하십니까, 아저씨! 붕어빵 두 개 주세요.”
“안녕을 세 번 외쳤으니 붕어빵 세 개!”
붕어빵 두 개의 값을 내고 세 개를 받은 호돌이는 기분이 좋았어요. 
호돌이가 붕어빵 하나를 꺼내어 한 입 물었는데…. 너무 뜨거워서 그만 붕어빵을 떨어뜨리고 말았어요ㅠㅠ

붕어빵은 자유 낙하운동을 하면서 땅에 떨어졌는데 신기하게도 좌우가 뒤집힌 모양으로 착지했답니다. 
호돌이가 붕어빵을 한 입 물기 전의 모양이 입력으로 주어지면, 땅에 떨어졌을 때에는 어떤 모양일지 출력하세요.

입력
첫째 줄에는 두 개의 정수 N과 M(0≤N,M≤10)이 주어집니다. 둘째 줄부터 N개의 줄에 걸쳐 붕어빵의 모양이 주어집니다. 
각 행에는 공백을 나타내는 ‘0‘ 또는 붕어빵을 나타내는 ‘1’이 총 M개 주어집니다. 

출력
입력으로 주어진 붕어빵이 좌우로 뒤집힌 모양을 출력하세요.

예제 입력 1 
5 7
0010000
0111010
1111111
0111010
0010000
예제 출력 1 
0000100
0101110
1111111
0101110
0000100

힌트
입력으로 주어지는 각 행을 반전시켜서 출력하면 됩니다. 
입력의 1행 1열은 출력의 1행 M열로, 입력의 1행 2열은 출력의 1행 M-1열로 … 입력의 1행 M열은 출력의 1행 1열로 … 
입력의 N행 M열은 출력의 N행 1열로 출력하세요.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240615 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(br.readLine());
            System.out.println(sb.reverse());
        }
    }
}