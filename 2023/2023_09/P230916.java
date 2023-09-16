/*
문자열 여러 번 뒤집기
https://school.programmers.co.kr/learn/courses/30/lessons/181913


문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. 
queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. 
my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string은 영소문자로만 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000
queries의 원소는 [s, e]의 형태로 0 ≤ s ≤ e < my_string의 길이를 만족합니다.
1 ≤ queries의 길이 ≤ 1,000

입출력 예
my_string	    queries	                            result
"rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"
 */


public class P230916 {
    class Solution {
        public String solution(String my_string, int[][] queries) {
            String answer = "";
            StringBuilder sb = new StringBuilder(my_string);
            
            for(int i = 0; i < queries.length; i++){
                int start = queries[i][0];
                int end = queries[i][1];
                
                StringBuilder temp = new StringBuilder(sb.substring(start, end+1));
                
                temp.reverse();
                sb.replace(start, end+1, temp.toString());
            }
            
            answer = sb.toString();
            
            return answer;
        }
    }
}