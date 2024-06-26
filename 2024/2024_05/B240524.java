/*
10822번 더하기
https://www.acmicpc.net/problem/10822


숫자와 콤마로만 이루어진 문자열 S가 주어진다. 이때, S에 포함되어있는 자연수의 합을 구하는 프로그램을 작성하시오.
S의 첫 문자와 마지막 문자는 항상 숫자이고, 콤마는 연속해서 주어지지 않는다. 주어지는 수는 항상 자연수이다.

입력
첫째 줄에 문자열 S가 주어진다. S의 길이는 최대 100이다. 포함되어있는 정수는 1,000,000보다 작거나 같은 자연수이다.

출력
문자열 S에 포함되어 있는 자연수의 합을 출력한다.

예제 입력 1 
10,20,30,50,100
예제 출력 1 
210
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240524 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(",");
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i]);
        }

        System.out.println(result);
    }
}