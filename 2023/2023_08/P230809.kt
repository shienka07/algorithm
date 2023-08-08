/*
문자열 바꿔서 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/181864


문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. 
myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.

제한사항
1 ≤ myString의 길이 ≤ 100
1 ≤ pat의 길이 ≤ 10
myString과 pat는 문자 "A"와 "B"로만 이루어진 문자열입니다.

입출력 예
myString	pat	        result
"ABBAA"	    "AABB"	    1
"ABAB"	    "ABAB"	    0
*/

class P230809 {
    class Solution {
        fun solution(myString: String, pat: String): Int {
            var answer: Int = 0
            var str = myString.replace("A", "C").replace("B", "A").replace("C", "B")
            if(str.contains(pat)) answer = 1
            return answer
        }
    }
}