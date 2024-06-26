/*
9498번 시험 성적
https://www.acmicpc.net/problem/9498


시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.

예제 입력 1 
100
예제 출력 1 
A
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240527 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        switch (score / 10) {
            case 10 :
            case 9 :
                System.out.println('A');
                break;
            case 8 :
                System.out.println('B');
                break;
            case 7 :
                System.out.println('C');
                break;
            case 6 :
                System.out.println('D');
                break;
            default :
                System.out.println('F');
        }
    }
}