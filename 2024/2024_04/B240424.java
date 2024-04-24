/*
13752번 히스토그램
https://www.acmicpc.net/problem/13752


히스토그램은 데이터를 시각적으로 표현한 것이다. 막대로 구성되며 각 막대의 길이는 데이터 양의 크기를 나타낸다. 
일부 데이터가 주어지면 히스토그램을 생성하시오.

입력
첫 번째 줄에는 테스트 케이스의 개수 n (1 ≤ n ≤ 100)이 주어진다. 
다음 n 개의 줄에는 각 히스토그램의 크기 k (1 ≤ k ≤ 80)가 주어진다.

출력
각 테스트 케이스에 대해서 히스토그램의 크기 k와 동일한 수의 '='를 출력한다. '='사이에 공백은 존재하지 않는다.

예제 입력 1 
5
1
3
4
6
2
예제 출력 1 
=
===
====
======
==

예제 입력 2 
4
10
30
25
16
예제 출력 2 
==========
==============================
=========================
================
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240424 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            for(int j = 0; j < k; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
