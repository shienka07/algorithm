/*
18408번 3 つの整数 (Three Integers)
https://www.acmicpc.net/problem/18408


3 つの整数 A, B, C が与えられる．A, B, C はそれぞれ 1 または 2 である．1 と 2 のうち，どちらが多くあるか．

입력
入力は以下の形式で標準入力から与えられる．

A B C
출력
1 と 2 のうち，個数が多い方を出力せよ．

제한
A, B, C はそれぞれ 1 または 2 である．
예제 입력 1 
1 2 1
예제 출력 1 
1
1 が 2 個で 2 が 1 個なので，個数の多い 1 を出力する．
예제 입력 2 
2 2 2
예제 출력 2 
2
すべて 2 なので，2 を出力する．
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240925 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int one = 0;
        int two = 0;

        for (int i = 0; i < 3; i++) {
            if (arr[i].equals("1")) {
                one++;
            } else {
                two++;
            }
        }

        int result = one > two ? 1 : 2;
        System.out.println(result);
    }
}