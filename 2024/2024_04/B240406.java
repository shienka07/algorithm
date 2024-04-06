/*
18409번 母音を数える (Counting Vowels)
https://www.acmicpc.net/problem/18409


長さ N の英小文字からなる文字列 S が与えられる．
S のうち母音字の個数，つまり a，i，u，e，o の個数の総和を求めよ．

입력
入力は以下の形式で標準入力から与えられる．

N
S
출력
S のうち母音字の個数，つまり a，i，u，e，o の個数の総和を出力せよ．

제한
1 ≦ N ≦ 50.
S は長さ N の文字列である．
S の各文字は英小文字である．

예제 입력 1 
8
joiyosen
예제 출력 1 
4
母音字は _oi_o_e_ の 4 個である．

예제 입력 2 
6
bitaro
예제 출력 2 
3
母音字は _i_a_o の 3 個である．
 */

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.List;

public class B240406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;

        List<Character> list  = new ArrayList<>();
        list.add('a');
        list.add('i');
        list.add('u');
        list.add('e');
        list.add('o');

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (list.contains(ch)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
}
