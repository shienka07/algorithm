/*
24084번 次の文字 (Next Character) 
https://www.acmicpc.net/problem/24084


長さ N の文字列 S が与えられる．S の各文字は J，O，I のいずれかである．
ビーバーのビ太郎は，N - 1 回の動作を行った．
i 回目 (1 ≦ i ≦ N - 1) の動作は，次のように行われた．

S の i + 1 文字目を確認する．
さらに，S の i + 1 文字目が J であったならば，S の i 文字目を黒板に書く．
N - 1 回の動作においてビ太郎が黒板に書いたすべての文字を，ビ太郎が書いた順に改行区切りで出力せよ．

입력
入力は以下の形式で標準入力から与えられる．
N
S

출력
N - 1 回の動作においてビ太郎が黒板に書いたすべての文字を，ビ太郎が書いた順に改行区切りで出力せよ．

제한
2 ≦ N ≦ 100．
S は長さ N の文字列である．
S の各文字は J，O，I のいずれかである．
N は整数である．
黒板に書かれた文字が 1 つ以上存在する．

예제 입력 1 
6
IOJOIJ
예제 출력 1 
O
I
ビ太郎は，以下のように 5 回の動作を行った．

1 回目の動作では，S の 2 文字目を確認した．
2 回目の動作では，S の 3 文字目を確認した．さらに，S の 3 文字目が J であったため，黒板に S の 2 文字目である O を書いた．
3 回目の動作では，S の 4 文字目を確認した．
4 回目の動作では，S の 5 文字目を確認した．
5 回目の動作では，S の 6 文字目を確認した．さらに，S の 6 文字目が J であったため，黒板に S の 5 文字目である I を書いた．
したがって，ビ太郎が黒板に書いた O と I を，この順に改行区切りで出力する．

예제 입력 2 
4
JJOI
예제 출력 2 
J
ビ太郎は，1 回目の動作で S の 1 文字目である J を黒板に書いた．
2 回目と 3 回目の動作では，黒板に何も書かなかった．
したがって，ビ太郎が黒板に書いた J を出力する．

예제 입력 3 
7
IOJOJOJ
예제 출력 3 
O
O
O

예제 입력 4 
5
JJJJJ
예제 출력 4 
J
J
J
J
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250415 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i + 1) == 'J') {
                System.out.println(S.charAt(i));
            }
        }
    }
}
