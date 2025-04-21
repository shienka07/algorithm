/*
1252번 이진수 덧셈
https://www.acmicpc.net/problem/1252


두 개의 이진수를 입력받아 이를 더하는 프로그램을 작성하시오.

입력
첫째 줄에 두 개의 이진수가 빈 칸을 사이에 두고 주어진다. 
각 이진수는 1 또는 0으로만 이루어져 있으며, 0으로 시작할 수도 있다. 
또한 각 이진수의 길이는 80을 넘지 않는다.

출력
첫째 줄에 이진수 덧셈 결과를 출력한다. 결과가 0인 경우를 제외하고는 출력되는 이진수는 항상 1로 시작해야 한다.

예제 입력 1 
1001101 10010
예제 출력 1 
1011111
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B250421 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger bin1 = new BigInteger(st.nextToken(), 2);
        BigInteger bin2 = new BigInteger(st.nextToken(), 2);

        BigInteger add = bin1.add(bin2);

        System.out.println(add.toString(2));
    }
}