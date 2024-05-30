/*
13985번 Equality
https://www.acmicpc.net/problem/13985


You are grading an arithmetic quiz. The quiz asks a student for the sum of the numbers. 
Determine if the student taking the quiz got the question correct.

입력
The first and the only line of input contains a string of the form:

a + b = c

It is guaranteed that a, b, and c are single-digit positive integers. 
The input line will have exactly 9 characters, formatted exactly as shown, 
with a single space separating each number and arithmetic operator.

출력
Print, on a single line, YES if the sum is correct; otherwise, print NO.

예제 입력 1 
1 + 2 = 3
예제 출력 1 
YES

예제 입력 2 
2 + 2 = 5
예제 출력 2 
NO
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B240530 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int temp;

        if(arr[1].equals("+")) {
            temp = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        } else {
            temp = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        }

        String result = temp == (Integer.parseInt(arr[4])) ? "YES" : "NO";

        System.out.println(result);
    }
}
}
