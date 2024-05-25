/*
24082번 立方体 (Cube)
https://www.acmicpc.net/problem/24082


一辺の長さが x cm の立方体の体積は (x × x × x) cm3 である．
整数 X が与えられる．一辺の長さが X cm の立方体の体積は何 cm3 か求めよ．

입력
入力は以下の形式で標準入力から与えられる．

X
출력
一辺の長さが X cm の立方体の体積が何 cm3 か，単位 (cm3) を省いて出力せよ．

제한
1 ≦ X ≦ 1000．
X は整数である．
예제 입력 1 
4
예제 출력 1 
64
一辺の長さが 4 cm の立方体の体積は (4 × 4 × 4) cm3，すなわち 64 cm3 である．

예제 입력 2 
1
예제 출력 2 
1

예제 입력 3 
999
예제 출력 3 
997002999
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int result = (int)(Math.pow(x, 3));

        System.out.println(result);
    }
}