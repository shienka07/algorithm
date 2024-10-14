/*
11024번 더하기 4
https://www.acmicpc.net/problem/11024


수 N개가 주어졌을 때, N개의 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
각 테스트 케이스는 한 줄로 이루어져 있으며, N(1 ≤ N ≤ 100)개의 수가 공백으로 구분되어서 주어진다. 
입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다. 또, 0으로 시작하는 수는 주어지지 않는다.

출력
각 테스트 케이스마다 입력받은 수 N개의 합을 한 줄에 하나씩 입력받은 순서대로 출력한다.

예제 입력 1 
2
1 2 3 4 5
5 4 5 4 2 3 1 2
예제 출력 1 
15
26
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B241014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split(" ");
            int result = 0;

            for (int j = 0; j < arr.length; j++) {
                int temp = Integer.parseInt(arr[j]);
                result += temp;
            }

            System.out.println(result);
        }
    }
}
