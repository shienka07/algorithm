/*
181944번 홀짝 구분하기
https://school.programmers.co.kr/learn/courses/30/lessons/181944


자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 
홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ n ≤ 1,000

입출력 예
입력 #1
100
출력 #1
100 is even

입력 #2
1
출력 #2
1 is odd
*/

import java.util.Scanner;

public class P250322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String answer = (n % 2) == 0   ? n + " is even" : n + " is odd";
        
        System.out.println(answer);
    }
}