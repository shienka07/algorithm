/*
4562번 No Brainer
https://www.acmicpc.net/problem/4562


Zombies love to eat brains. Yum.

입력
The first line contains a single integer n indicating the number of data sets.
The following n lines each represent a data set. 
Each data set will be formatted according to the following description:

A single data set consists of a line "X Y", 
where X is the number of brains the zombie eats and Y is the number of brains the zombie requires to stay alive.

출력
For each data set, there will be exactly one line of output. 
This line will be "MMM BRAINS" if the number of brains the zombie eats is greater than or 
equal to the number of brains the zombie requires to stay alive. Otherwise, the line will be "NO BRAINS".

예제 입력 1 
3
4 5
3 3
4 3
예제 출력 1 
NO BRAINS
MMM BRAINS
MMM BRAINS
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240317 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x >= y) {
                System.out.println("MMM BRAINS");
            } else {
                System.out.println("NO BRAINS");
            }
        }
    }
}