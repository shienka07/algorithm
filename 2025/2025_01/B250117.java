/*
31281번 ЗЛАТНАТА СРЕДА
https://www.acmicpc.net/problem/31281


Дадени са три различни цели числа – a, b, c.
Напишете програма middle, която намира и извежда число, което е равно на едно от дадените числа, но не е нито най-малкото, нито най-голямото от тях.

입력
От първия ред на стандартния вход се въвеждат три цели числа, разделени с по един интервал.

출력
На един ред на стандартния изход програмата трябва да изведе търсеното число.

제한
0 ≤ a, b, c ≤ 1018

예제 입력 1 
5 16 10
예제 출력 1 
10

예제 입력 2 
10000 9999 0
예제 출력 2 
9999
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B250117 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long[] arr = new long[3];

        for (int i = 0; i < 3; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}