/*
17010번 Time to Decompress
https://www.acmicpc.net/problem/17010


You and your friend have come up with a way to send messages back and forth.
Your friend can encode a message to you by writing down a positive integer N and a symbol. 
You can decode that message by writing out that symbol N times in a row on one line.
Given a message that your friend has encoded, decode it.

입력
The first line of input contains L, the number of lines in the message.

The next L lines each contain one positive integer less than 80, 
followed by one space, followed by a (non-space) character.

출력
The output should be L lines long. 
Each line should contain the decoding of the corresponding line of the input. 
Specifically, if line i+1 of the input contained N x, 
then line i of the output should contain just the character x printed N times.

예제 입력 1 
4
9 +
3 -
12 A
2 X
예제 출력 1 
+++++++++
---
AAAAAAAAAAAA
XX
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            
            for(int j = 0; j < repeat; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
