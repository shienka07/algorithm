/*
18301번 Rats
https://www.acmicpc.net/problem/18301


To celebrate the Lunar New Year of the Rat, Douglas decides to count the number of rats living in his area. 
It is impossible for him to find all rats, as they tend to be well hidden. 
However, on the first day of the new year, Douglas manages to capture n1 rats, 
and marks each of them with an ear tag before releasing them. 
On the second day of the new year, Douglas captures n2 rats,
 and observes that n12 of them had been marked during the first day.

Douglas is asking for your help to estimate the total number of rats in his area. 
Looking up in your statistics textbook, you propose using the Chapman estimator N, given by:
N := ⌊(n1 + 1)(n2 + 1)/(n12 + 1) - 1⌋
where ⌊x⌋ is the floor of a real number x, i.e., the closest integer less than or equal to x.

입력
The input consists of a single line, with three space-separated integers: n1, n2, n12, in that order.

출력
The output should contain a single line with the single integer N.

제한
0 ≤ n1, n2 ≤ 10 000;
0 ≤ n12 ≤ min(n1, n2).

예제 입력 1 
15 18 11
예제 출력 1 
24
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240827 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n12 = Integer.parseInt(st.nextToken());
        
        System.out.println(((n1 + 1) * (n2 + 1) / (n12 + 1)) - 1);
    }
}