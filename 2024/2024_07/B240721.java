/*
11367번 Report Card Time
https://www.acmicpc.net/problem/11367


Little hobbitses go to hobbit school in the Shire.
They just finished a course, which involved tea-making, meal-eating, nap-taking, and gardening. 
Based on the following grading scale, assign each hobbit 
a letter grade based on their final numerical course grade.

A+: 97-100
A: 90-96
B+: 87-89
B: 80-86
C+: 77-79
C: 70-76
D+: 67-69
D: 60-66
F: 0-59

입력
The input will begin with a single line containing just a whole number, n, 
of the number of hobbits in the class, followed by n lines in the form a b, 
where a is the hobbit’s name (only alphabetical characters) and b is the hobbit’s grade, 
given as a whole number. 
The length of hobbit's name is less than 10.

출력
For each test case, print out a list of every hobbits name and letter grade, each on its own line. 
There should be no additional white space following test cases.

예제 입력 1 
5
Bilbo 13
Sam 90
Pippin 78
Frodo 97
Merry 70
예제 출력 1 
Bilbo F
Sam A
Pippin C+
Frodo A+
Merry C
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B240721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            String grade = getGrade(score);

            System.out.println(name + " " + grade);
        }
    }

    private static String getGrade(int score) {
        String grade;

        if (score > 96) {
            grade = "A+";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 86) {
            grade = "B+";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 76) {
            grade = "C+";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 66) {
            grade = "D+";
        } else if (score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}
