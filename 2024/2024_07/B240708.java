/*
15720번 카우버거
https://www.acmicpc.net/problem/15720


윤진이는 이번에 카우버거 알바생으로 뽑히게 되었다. 그녀는 카우버거를 평소에 이용하면서 들었던 의문점 한가지가 있었다.
"카우버거에는 왜 세트 메뉴에 대한 할인이 존재하지 않는가?"
따라서 윤진이의 아이디어로 카우버거에 세트 할인을 도입하고자 한다. 
세트 메뉴는 버거 1개, 사이드 메뉴 1개, 음료 1개를 선택 할 경우 각각의 제품에 대해서 10%의 세트 할인을 적용하는 방식으로 진행된다.
하지만 카우버거 점주는 POS기의 소프트웨어가 오래되어 세트 할인에 대한 내용을 추가할 수가 없었다. 
따라서 소프트웨어학부에 재학 중인 윤진이는 전공을 살려 직접 프로그램을 만들어보려고 한다. 
윤진이를 도와 POS기에 들어갈 세트 할인에 대한 프로그램을 작성해보자.

입력
첫째 줄에는 주문한 버거의 개수 B, 사이드 메뉴의 개수 C, 음료의 개수 D가 공백을 사이에 두고 순서대로 주어진다. 
(1 ≤ B, C, D ≤ 1,000)
둘째 줄에는 각 버거의 가격이 공백을 사이에 두고 주어진다.
셋째 줄에는 각 사이드 메뉴의 가격이 공백을 사이에 두고 주어진다.
넷째 줄에는 각 음료의 가격이 공백을 사이에 두고 주어진다.
각 메뉴의 가격은 100의 배수이며, 10000원을 넘지 않는다.

출력
첫째 줄에는 세트 할인이 적용되기 전 가격을 출력한다.
둘째 줄에는 세트 할인이 적용된 후의 최소 가격을 출력한다.

예제 입력 1 
3 3 2
2000 3000 2500
800 1300 1000
500 1000
예제 출력 1 
12100
11170

힌트
입력 예에 나온 메뉴들의 가격을 모두 합하면 12100원이다.
첫 번째 세트는 3000원짜리 버거, 1300원짜리 사이드메뉴, 1000원짜리 음료로 구성하면 5300 * 0.9 = 4770원이다.
두 번째 세트는 2500원짜리 버거, 1000원짜리 사이드메뉴, 500원짜리 음료로 구성하면 4000 * 0.9 = 3600원이다.
남은 2000원짜리 버거와 800원짜리 사이드메뉴는 음료가 없으므로 세트 할인을 받을 수 없다. 
따라서 세트 할인이 적용된 후의 최소 가격은 4770+3600+2800 = 11170원이 된다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B240708 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int B = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int set = Math.min(Math.min(B, S), D);

        Integer[] BArr = new Integer[B];
        Integer[] SArr = new Integer[S];
        Integer[] DArr = new Integer[D];
        int price = 0;
        long sale = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < B; i++) {
            BArr[i] = Integer.parseInt(st.nextToken());
            price += BArr[i];
        }
        Arrays.sort(BArr, Comparator.reverseOrder());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < S; i++) {
            SArr[i] = Integer.parseInt(st.nextToken());
            price += SArr[i];
        }
        Arrays.sort(SArr, Comparator.reverseOrder());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < D; i++) {
            DArr[i] = Integer.parseInt(st.nextToken());
            price += DArr[i];
        }
        Arrays.sort(DArr, Comparator.reverseOrder());

        for (int i = 0; i < set; i++) {
            sale += (long)((BArr[i] + SArr[i] + DArr[i]) * 0.9);
        }

        int x = Math.max((B - set), 0);
        int y = Math.max((S - set), 0);
        int z = Math.max((D - set), 0);

        if (x > 0) {
            for (int i = 0; i < x; i++) {
                sale += BArr[set + i];
            }
        }

        if (y > 0) {
            for (int i = 0; i < y; i++) {
                sale += SArr[set + i];
            }
        }
        
        if (z > 0) {
            for (int i = 0; i < z; i++) {
                sale += DArr[set + i];
            }
        }

        System.out.println(price + "\n" + sale);
    }
}
