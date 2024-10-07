/*
27324번 ゾロ目 (Same Numbers)
https://www.acmicpc.net/problem/27324


十進法で 2 桁の整数 N が与えられる．

N の十の位の数字と一の位の数字が同じである場合は 1 を，そうでない場合は 0 を出力せよ．

입력
入力は以下の形式で標準入力から与えられる．

N
출력
N の十の位の数字と一の位の数字が同じである場合は 1 を，そうでない場合は 0 を出力せよ．

제한
10 ≦ N ≦ 99．
N は整数である．
예제 입력 1 
22
예제 출력 1 
1
22 は十の位が 2 ，一の位が 2 と同じであるので，1 を出力する．

예제 입력 2 
10
예제 출력 2 
0
10 は十の位が 1 ，一の位が 0 と異なるので，0 を出力する．
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B241007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N / 10 == N % 10) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}