/*
250130번 [PCCE 기출문제] 4번 / 저축
https://school.programmers.co.kr/learn/courses/30/lessons/250130


진우는 돈을 모으기 위해 저축을 하려고 합니다. 
목표로 하는 금액은 100만 원이며, 첫 달에 일정 금액을 넣은 뒤 70만 원까지는 매월 조금씩 저축하다가 
70만 원 이후부터는 월 저축량을 늘려 빠르게 목표 금액을 달성하고자 합니다.

첫 달에 저축하는 금액을 나타내는 정수 start, 
두 번째 달 부터 70만 원 이상 모일 때까지 매월 저축하는 금액을 나타내는 정수 before, 
100만 원 이상 모일 때 까지 매월 저축하는 금액을 나타내는 정수 after가 주어질 때, 
100만 원 이상을 모을 때까지 걸리는 개월 수를 출력하도록 빈칸을 채워 코드를 완성해 주세요.

제한사항
0 ≤ start ≤ 99
1 ≤ before ≤ after ≤ 25

입출력 예
입력 #1
28
6
8

출력 #1
12

입력 #2
75
8
25

출력 #2
2

입출력 예 설명
입출력 예 #1]
매월 저축된 금액은 아래 표와 같습니다. 따라서 12를 출력합니다.
1	2	3	4	5	6	7	8	9	10	11	12
28	34	40	46	52	58	64	70	78	86	94	102

입출력 예 #2
첫 달 저축된 금액이 70이 넘으므로 두 번째 달부터 바로 after= 25 만큼 저축합니다. 따라서 2를 출력합니다.
1	2
75	100
*/

import java.util.Scanner;

public class P241231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {
            money += after;
            month++;
        }

        System.out.println(month);
    }
}