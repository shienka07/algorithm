/*
26574번 Copier
https://www.acmicpc.net/problem/26574


Your copier broke down last week,
 and you need to copy a list of numbers for a class project due tomorrow! 
Luckily, you can use your computer to copy the numbers for you. 
Given a list of numbers, each on their own line, print out the number, a space,
 and then another copy of the number.

입력
The first line will contain a single integer n 
 that indicates the number of numbers to follow, each on their own line. 
The next n lines will each contain a single number.

출력
For each of the n lines, print out the original number
 and a copy of the number, with one space of separation.

예제 입력 1 
3
7
3
10
예제 출력 1 
7 7
3 3
10 10
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num + " " + num);
        }
    }
}