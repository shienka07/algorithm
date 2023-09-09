/*
카운트 업
https://school.programmers.co.kr/learn/courses/30/lessons/181920


정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.


제한사항
0 ≤ start_num ≤ end_num ≤ 50


입출력 예
start_num	end_num	       result
    3	       10	       [3, 4, 5, 6, 7, 8, 9, 10]

 */

public class P230909 {
    class Solution {
        public int[] solution(int start_num, int end_num) {
            int sub = end_num - start_num + 1;
            int[] answer = new int[sub];
            
            for (int i = 0; i < sub; i++) {
                answer[i] = start_num++;
            }
            return answer;
        }
    }
}
