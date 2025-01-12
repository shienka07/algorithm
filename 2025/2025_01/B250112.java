/*
18411번 試験 (Exam)
https://www.acmicpc.net/problem/18411


JOI 君は情報の試験を 3 回受けた．試験の点数はすべて 0 以上 100 以下の整数である．
JOI 君の成績は 3 回の試験の点数のうち高い方から 2 つを足し合わせた合計によって決まる．
3 回の試験の点数 A, B, C が与えられたとき，
3 回の試験の点数のうち高い方から 2 つを足し合わせた合計を出力するプログラムを作成せよ．

입력
入力は以下の形式で標準入力から与えられる．
A B C
출력
3 回の試験の点数のうち高い方から 2 つを足し合わせた合計を 1 行で出力せよ．

제한
0 ≦ A ≦ 100．
0 ≦ B ≦ 100．
0 ≦ C ≦ 100．
入力はすべて整数である．

예제 입력 1 
70 80 90
예제 출력 1 
170
点数は高い順に 90, 80, 70 であるから，求める和は 90 + 80 = 170 である．

예제 입력 2 
70 100 70
예제 출력 2 
170
点数は高い順に 100, 70, 70 であるから，求める和は 100 + 70 = 170 である．

예제 입력 3 
70 70 70
예제 출력 3 
140
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B250112 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(arr[2] + arr[1]);
    }
}
