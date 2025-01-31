/*
23235번 The Fastest Sorting Algorithm In The World
https://www.acmicpc.net/problem/23235


It is common to compare sorting algorithms based on their asymptotic speeds. 
Some slower algorithms like selection sort take O(N2) time to sort N items, 
while comparison-based sorts like merge sort can go no faster than O(N log(N))
time, under reasonable assumptions. 
Bucket sort, which is not a comparison-based sort, can sort in O(N) time. 
This is because bucket sort assumes that the range of possible values is small relative to N. 
In general, the speed of a sorting algorithm depends on the assumptions 
it can make about the data it is sorting.

One sorting algorithm that is often overlooked, despite its speed, 
is The Fastest Sorting Algorithm In The World. It sorts in O(1), or constant, time. 
Of course, the algorithm assumes that the input is an array that is already in fast-access memory and that
the input is already sorted. For this problem, implement The Fastest Sorting Algorithm In The World.;

입력
The input file contains multiple test cases, each of which describes an array to sort. 
Each array description starts with an integer 0 < N ≤ 100. 
N is followed by the N integers to sort, which will be given in non-decreasing order. 
All integers to sort are in the range of 0 to 100000. 
The last test case is followed by a line containing a single zero.

출력
For each test case, print the case number (beginning with 1) followed by the text Sorting... done!

예제 입력 1 
5 21 44 48 48 64
6 8 19 22 49 53 62
8 5 9 14 17 24 25 27 61
4 13 21 28 35
5 31 38 44 49 60
0
예제 출력 1 
Case 1: Sorting... done!
Case 2: Sorting... done!
Case 3: Sorting... done!
Case 4: Sorting... done!
Case 5: Sorting... done!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P250131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;

        while(true) {
            String str = br.readLine();
            if (str.charAt(0) == '0'){
                break;
            }
            System.out.println("Case " + n + ": Sorting... done!");
            n++;
        }
    }
}