/*
27328번 三方比較 (Three-Way Comparison)
https://www.acmicpc.net/problem/27328


2 つの整数 A, B が与えられる．
A と B の大小を比較し，A ＜ B ならば -1 を，A ＝ B ならば 0 を，A ＞ B ならば 1 を出力せよ．

입력
入力は以下の形式で標準入力から与えられる．

A
B
출력
A ＜ B ならば -1 を，A ＝ B ならば 0 を，A ＞ B ならば 1 を出力せよ．

제한
1 ≦ A ≦ 1000．
1 ≦ B ≦ 1000．
A, B は整数である．

예제 입력 1 
3
7
예제 출력 1 
-1

3 ＜ 7 であるから，-1 を出力する．

예제 입력 2 
10
10
예제 출력 2 
0

10 ＝ 10 であるから，0 を出力する．

예제 입력 3 
1000
1
예제 출력 3 
1

1000 ＞ 1 であるから，1 を出力する．
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250422 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int answer = 0;
        
        if (A > B) {
            answer = 1;
        } else if (A < B) {
            answer = -1;
        }

        System.out.println(answer);
    }
}
