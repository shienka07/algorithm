/*
5357번 Dedupe
https://www.acmicpc.net/problem/5357


Redundancy in this world is pointless. Let’s get rid of all redundancy. 
For example AAABB is redundant. 
Why not just use AB? Given a string, remove all consecutive letters that are the same.

입력
The first line in the data file is an integer that represents the number of data sets to follow. 
Each data set is a single string. The length of the string is less than 100. 
Each string only contains uppercase alphabetical letters.

출력
Print the deduped string.

예제 입력 1 
3
ABBBBAACC
AAAAA
ABC
예제 출력 1 
ABAC
A
ABC
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) != str.charAt(j-1)) {
                    sb.append(str.charAt(j));
                }
            }

            System.out.println(sb.toString());
        }
    }
}
