/*
중복된 문자 제거
https://school.programmers.co.kr/learn/courses/30/lessons/120888


문자열 my_string이 매개변수로 주어집니다. 
my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string ≤ 110
my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
대문자와 소문자를 구분합니다.
공백(" ")도 하나의 문자로 구분합니다.
중복된 문자 중 가장 앞에 있는 문자를 남깁니다.

입출력 예
my_string	        result
"people"	        "peol"
"We are the world"	"We arthwold"
 */

public class P230724 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            String[] strArr = my_string.split("");
            
            for(int i = 0; i < my_string.length(); i++){
                if(!answer.contains(strArr[i])){
                    answer += strArr[i];
                }
            }
            
            return answer;
        }
    }
}
