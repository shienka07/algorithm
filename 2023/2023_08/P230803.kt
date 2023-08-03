/*
모음 제거
https://school.programmers.co.kr/learn/courses/30/lessons/120849


영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
my_string은 소문자와 공백으로 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000

입출력 예
my_string	        result
"bus"	            "bs"
"nice to meet you"	"nc t mt y"
*/

class P230803 {
    class Solution {
        fun solution(my_string: String): String {
            var answer: String 
            var ptn = Regex("[aeiou]")

            answer = my_string.replace(ptn, "")
            return answer
        }
    }


    // String 클래스의 확장함수 toRegex() 사용

    class Solution2 {
        fun solution(myString: String): String {
            return myString.replace("a|e|i|o|u".toRegex(), "")
        }
    } 
}