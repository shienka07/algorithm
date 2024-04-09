/*
9296번 Grading Exams
https://www.acmicpc.net/problem/9296


Ms. Garrette needs help grading her multiple choice exams. 
To prevent cheating, she gave each student an individualized exam. 
She wants to write a program that, given an answer key and a particular student’s responses, 
calculates the number of incorrect answers. Can you help her?

입력
The first line of input is the number of test cases that follow. 
Each test case starts with an integer L (0 < L ≤ 100) 
representing the number of questions on the exam. 
The next line contains the answer key, 
where each question is represented by a single letter 
(i.e. a, b, c, or d) corresponding to the correct answer. 
The following line contains the student’s responses in the same format.

출력
For each case, output the line “Case x:” where x is the case number, on a single line. 
This is followed by the number of student responses that did not match the answer key.

예제 입력 1 
2
5
abadd
abada
3
cba
abc
예제 출력 1 
Case 1: 1
Case 2: 2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B240409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int l = Integer.parseInt(br.readLine());
            String[] solution = br.readLine().split("");
            String[] student = br.readLine().split("");
            int answer = 0;

            for (int j = 0; j < l; j++) {
                if (!solution[j].equals(student[j])) {
                    answer++;
                }
            }

            System.out.println("Case " + (i + 1) + ": " + answer);
        }
    }
}