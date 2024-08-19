/*
31616번 揃った文字 (Matched Letters)
https://www.acmicpc.net/problem/31616


長さ N の文字列 S が与えられる．S の各文字は英小文字である．
S がすべて同じ文字からなるならば Yes を，そうでないならば No を出力せよ．

입력
入力は以下の形式で与えられる．

N
S
출력
S がすべて同じ文字からなるならば Yes を，そうでないならば No を出力せよ．

答え以外は何も出力しないこと．(入力を促す文章なども出力しないこと．)

제한
2 ≦ N ≦ 100．
S は長さ N の文字列である．
S の各文字は英小文字である．
N は整数である．

예제 입력 1 
4
bbbb
예제 출력 1 
Yes
- 文字列 bbbb はすべて同じ文字 b からなるので，Yes を出力する．

예제 입력 2 
7
pppdppp
예제 출력 2 
No
- 文字列 pppdppp には p と d が含まれ，すべて同じ文字からなるわけではないため，No を出力する．

예제 입력 3 
2
xx
예제 출력 3 
Yes
- 文字列 xx はすべて同じ文字 x からなるので，Yes を出力する．

예제 입력 4 
9
joijoijoi
예제 출력 4 
No
- 文字列 joijoijoi はすべて同じ文字からなるわけではないため，No を出力する．
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240819 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char ch = str.charAt(0);
        String result = "Yes";
        
        for (int i = 1; i < N; i++) {
            char temp = str.charAt(i);
            
            if (temp != ch) {
                result = "No";
                break;
            }
        }
            
        System.out.println(result);
    }
}