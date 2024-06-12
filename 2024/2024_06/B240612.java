/*
26545번 Mathematics
https://www.acmicpc.net/problem/26545


A mathematician has stolen your calculator! 
Luckily, you know how to code and can write a program that adds together numbers.
Write a program that adds together a list of integers.

입력
The first line will contain a single integer n that indicates the number of integers to add together. 
The next n lines will each contain one integer. 
Your task is to write a program that adds all of the integers together.

출력
Output the resulting integer. The output should be one line containing one integer value.

예제 입력 1 
3
1
2
3
예제 출력 1 
6
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.println(sum);
    }
}
