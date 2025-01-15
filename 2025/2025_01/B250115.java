/*
20977번 JOI ソート (JOI Sort)
https://www.acmicpc.net/problem/20977


長さ N の文字列 S が与えられる．S の各文字は ‘J’，‘O’，‘I’ のいずれかである．

あなたは S の文字を並び替えて次の条件を満たすようにしたい．

すべての文字 ‘J’ と文字 ‘O’ の組について ‘J’ が ‘O’ よりも前にある．
すべての文字 ‘O’ と文字 ‘I’ の組について ‘O’ が ‘I’ よりも前にある．
すべての文字 ‘J’ と文字 ‘I’ の組について ‘J’ が ‘I’ よりも前にある．
文字列 S が与えられたとき，上の条件を満たすように S の文字を並び替えた文字列を出力するプログラムを作成せよ．

입력
入力は以下の形式で標準入力から与えられる．
N
S

출력
条件を満たすように S の文字を並び替えた文字列を出力せよ．

제한
1 ≦ N ≦ 100．
S は長さ N の文字列である．
S の各文字は ‘J’，‘O’，‘I’ のいずれかである．

예제 입력 1 
6
JIOIJO
예제 출력 1 
JJOOII

‘JIOIJO’ の並べ替えである ‘JJOOII’ は条件を満たす．

예제 입력 2 
4
OOOI
예제 출력 2 
OOOI

与えられた文字列がすでに条件を満たしているかもしれない．‘J’，‘O’，‘I’ がすべて含まれているとは限らない．

예제 입력 3 
10
OIJJJIOIOI
예제 출력 3 
JJJOOOIIII
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int J = 0;
        int O = 0;
        int I = 0;
        String answer = "";

        for (int k = 0; k < len; k++) {
            if (str.charAt(k) == 'J'){
                J++;
            } else if (str.charAt(k) == 'O'){
                O++;
            } else if (str.charAt(k) == 'I'){
                I++;
            }
        }

        for (int k = 0; k < J; k++) {
            answer += "J";
        }
        for (int k = 0; k < O; k++) {
            answer += "O";
        }
        for (int k = 0; k < I; k++) {
            answer += "I";
        }

        System.out.println(answer);
    }
}