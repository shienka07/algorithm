/*
19602번 Dog Treats
https://www.acmicpc.net/problem/19602


Barley the dog loves treats. 
At the end of the day he is either happy or sad depending on the number and
 size of treats he receives throughout the day. 
The treats come in three sizes: small, medium, and large. 
His happiness score can be measured using the following formula:
1 × S + 2 × M + 3 × L
where S is the number of small treats,
 M is the number of medium treats and L is the number of large treats.

If Barley’s happiness score is 10 or greater then he is happy. 
Otherwise, he is sad. Determine whether Barley is happy or sad at the end of the day.

입력
There are three lines of input. Each line contains a non-negative integer less than 10. 
The first line contains the number of small treats, S, 
 the second line contains the number of medium treats, M, 
 and the third line contains the number of large treats, L, 
 that Barley receives in a day.

출력
If Barley’s happiness score is 10 or greater, output happy. Otherwise, output sad.

예제 입력 1 
3
1
0
예제 출력 1 
sad
Barley’s happiness score is 1 × 3 + 2 × 1 + 3 × 0 = 5, so he will be sad.

예제 입력 2 
3
2
1
예제 출력 2 
happy
Barley’s happiness score is 1 × 3 + 2 × 2 + 3 × 1 = 10, so he will be happy.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B241015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());

        int treat = (1 * S) + (2 * M) + (3 * L);
        String barley = "happy";

        if (treat < 10) {
            barley = "sad";
        }

        System.out.println(barley);
    }
}
