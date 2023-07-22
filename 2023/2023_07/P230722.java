/*
문자 개수 세기
https://school.programmers.co.kr/learn/courses/30/lessons/181902


알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 
my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, 
my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 
순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000

입출력 예
my_string	    result
"Programmers"	[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
 */

public class P230722 {
    class Solution {
        public int[] solution(String my_string) {
            int myLen = my_string.length();
            int[] answer = new int[52];
            
            for(int i = 0; i < myLen; i++){
                char ch = my_string.charAt(i);
                if(65 <= ch && ch <= 90){
                    answer[ch - 65]++;
                } else if(97 <= ch && ch <= 122){
                    answer[ch - 97 + 26]++;
                }
            }
            
            return answer;
        }
    }
}
