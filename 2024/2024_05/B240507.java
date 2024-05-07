/*
22193번 Multiply
https://www.acmicpc.net/problem/22193


Write a program that computes a product of two non-negative integers A and B. 
The integers are represented in decimal notation and have N and M digits, respectively.

입력
The first line contains the lengths N and M, separated by a space. 
A is given on the second and B on the third line. The numbers will not have leading zeros.

출력
Output the product of A and B without leading zeros.

제한
1 ≤ N, M ≤ 50 000
서브태스크
번호	 배점	  제한
1	    20	    N, M ≤ 4
2	    20	    N, M ≤ 9
3	    30	    N, M ≤ 5 000
4	    30	    No additional constraints

예제 입력 1 
3 4
123
4567
예제 출력 1 
561741

예제 입력 2 
3 1
100
0
예제 출력 2 
0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B240507 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
        
		System.out.println(a.multiply(b));
    }
}