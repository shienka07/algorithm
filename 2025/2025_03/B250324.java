/*
1551번 수열의 변화
https://www.acmicpc.net/problem/1551


크기가 N인 수열 A가 주어졌을 때, 세준이는 인접한 두 원소의 차이를 이용해서 크기가 N-1인 수열 B를 만들 수 있다.
예를 들어, A = {5, 6, 3, 9, -1} 이었을 때, B = {6-5, 3-6, 9-3, -1-9} = {1, -3, 6, -10}이 된다. 
즉, B[i] = A[i+1]-A[i]가 된다.

수열 A가 주어졌을 때, 세준이가 위의 방법을 K번 했을 때 나오는 수열을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수열의 크기 N과 K가 주어진다. N은 20보다 작거나 같은 자연수이고, K는 0보다 크거나 같고, N-1보다 작거나 같은 정수이다. 
둘째 줄에는 수열이 ‘,’로 구분되어 주어진다. 수열을 이루고 있는 수는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄에 K번 변형한 수열을 ‘,’로 구분하여 출력한다.

예제 입력 1 
5 1
5,6,3,9,-1
예제 출력 1 

1,-3,6,-10
예제 입력 2 
5 2
5,6,3,9,-1
예제 출력 2 
-4,9,-16

예제 입력 3 
5 4
5,6,3,9,-1
예제 출력 3 
-38

예제 입력 4 
8 3
4,4,4,4,4,4,4,4
예제 출력 4 
0,0,0,0,0

예제 입력 5 
2 0
-100,100
예제 출력 5 
-100,100
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B250324 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String[] token = br.readLine().split(",");
        int[] numArr = new int[N];

        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(token[i]);
        }

        for (int i = 0; i < K; i++) {
            int[] newArr = new int[numArr.length - 1];
            for (int j = 0; j < newArr.length; j++) {
                newArr[j] = numArr[j + 1] - numArr[j];
            }
            numArr = newArr;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numArr.length; i++) {
            sb.append(numArr[i]);
            if(i != numArr.length -1) {
                sb.append(",");
            }
        }

        System.out.println(sb);
    }
}
