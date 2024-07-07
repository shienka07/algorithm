/*
14487번 욱제는 효도쟁이야!!
https://www.acmicpc.net/problem/14487


욱제는 KOI를 망친 기념으로 부모님과 함께 코드게이트 섬으로 여행을 떠났다. 
코드게이트 섬에는 오징어로 유명한 준오마을(심술쟁이 해커 임준오 아님), 밥으로 유명한 재훈마을, 영중마을 등 많은 관광지들이 있다. 
욱제는 부모님을 모시고 코드게이트 섬을 관광하려고 한다. 코드게이트 섬은 해안가를 따라 원형으로 마을들이 위치해있다. 
임의의 A마을에서 임의의 B마을로 가기 위해서는 왼쪽 또는 오른쪽 도로를 통해 해안가를 따라 섬을 돌아야 한다. 
섬을 빙빙 도는 원형의 길 외에 다른 길은 존재하지 않는다.
각 마을에서 마을까지의 이동비용이 주어질 때, 
욱제가 최소한의 이동비용으로 부모님을 모시고 섬의 모든 마을을 관광하려면 얼마의 이동비용을 준비해야하는지 알려주자.

입력
첫째 줄에 마을의 수 n이 주어진다. (1 ≤ n ≤ 50,000)

둘째 줄에 i번째 마을과 i+1번째 마을의 이동비용 vi가 n개 주어진다. 
n번째 vi는 n번째 마을과 1번째 마을의 이동비용을 의미한다. (1 ≤ vi ≤ 1,000)

출력
모든 마을을 관광하기 위해 필요한 최소 이동비용을 출력한다.

예제 입력 1 
5
1 6 5 2 4
예제 출력 1 
12

예제 입력 2 
4
100 100 100 101
예제 출력 2 
300


*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B240707 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            result += arr[i];
        }

        System.out.println(result);
    }
}
