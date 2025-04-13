/*
24087번 アイスクリーム (Ice Cream)
https://www.acmicpc.net/problem/24087


JOI アイスクリーム店は，非常に高さのあるアイスクリームタワーが名物のアイスクリーム店である．
アイスクリームタワーとは，ベースとなるアイスクリームの上に，追加のアイスクリームを 0 個以上積み重ねたものである．
ベースとなるアイスクリームの金額は 250 円で，高さは A cm である．
追加のアイスクリームは 1 個につき 100 円で，1 個追加するごとにアイスクリームタワーの高さが B cm 増える．

あなたは，この店で高さが S cm 以上のアイスクリームタワーを買いたい．
高さが S cm 以上のアイスクリームタワーを買うために必要な金額の最小値を求めよ．

입력
入力は以下の形式で標準入力から与えられる．

S
A
B

출력
高さ S cm 以上のアイスクリームタワーを買うために必要な金額の最小値を，単位 (円) を省いて出力せよ．

제한
1 ≦ S ≦ 100．
1 ≦ A ≦ 100．
1 ≦ B ≦ 100．
入力される値はすべて整数である．

예제 입력 1 
28
20
5
예제 출력 1 
450
アイスクリームを追加しない場合，アイスクリームタワーの高さは 20 cm，金額は 250 円である．
アイスクリームを 1 個追加する場合，アイスクリームタワーの高さは 25 cm，金額は 350 円である．
アイスクリームを 2 個追加する場合，アイスクリームタワーの高さは 30 cm，金額は 450 円である．
したがって，高さ 28 cm 以上のアイスクリームタワーを買うために必要な金額の最小値は 450 円であるため，450 を出力する．

예제 입력 2 
1
100
1
예제 출력 2 
250

예제 입력 3 
100
1
1
예제 출력 3 
10150
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int price = 250;

        while (S > A) {
            A += B;
            price += 100;
        }

        System.out.println(price);
    }
}
