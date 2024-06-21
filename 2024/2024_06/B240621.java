/*
26546번 Reverse
https://www.acmicpc.net/problem/26546


In the String class, there exists a function called substring. 
Your task is to do the opposite of the substring function. 
Rather than returning a specified substring within the String, 
you will output the String with the substring taken out.

입력
The first line will contain a single integer n that indicates the number of data sets that follow. 
Each data set will be one line with a string and two integers i and j, separated by spaces. 
The first int, i, is the start index of the substring to be taken out, 
and the substring removed extends to index j-1. 
Thus the length of the substring removed is j-i. You may assume that 0 ≤ i ≤ j ≤ length(string).

출력
Output the given string, with the substring taken out specified by the given integers. 
The output will be n lines, with no leading or trailing white space.

예제 입력 1 
3
COMPUTER 1 3
SCIENCE 3 7
RULES 3 4
예제 출력 1 
CPUTER
SCI
RULS
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240621 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            System.out.println(str.replace(str.substring(i, j), ""));
        }
    }
}
