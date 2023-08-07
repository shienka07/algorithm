/*
A 강조하기
https://school.programmers.co.kr/learn/courses/30/lessons/181874


문자열 myString이 주어집니다. 
myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, 
"A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.

제한사항
1 ≤ myString의 길이 ≤ 20
myString은 알파벳으로 이루어진 문자열입니다.

입출력 예
myString	            result
"abstract algebra"	    "AbstrAct AlgebrA"
"PrOgRaMmErS"	        "progrAmmers"
*/

class P230807 {
    class Solution {
        fun solution(myString: String): String {
            var answer: String = ""
            var strLen: Int = myString.length
            var ch = myString.toCharArray()
        
            for(i in 0..strLen-1){
                if(ch[i] == 'a' || ch[i] == 'A') answer += "A" else answer += ch[i].lowercase()
            }
            
            return answer
        }
    }

    // 두번째 풀이 replace() 사용

    class Solution2 {
        fun solution(myString: String): String {
            return myString.lowercase().replace('a', 'A')
        }
    }
}