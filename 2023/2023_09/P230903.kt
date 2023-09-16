/*
3진법 뒤집기
https://school.programmers.co.kr/learn/courses/30/lessons/68935


자연수 n이 매개변수로 주어집니다. 
n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.

입출력 예
n	result
45	7
125	229
*/

class P230903 {
    class Solution {
        fun solution(n: Int): Int {
            var str: String = ""
            var num: Int = n
            
            while(num > 0){
                str += num % 3
                num /= 3
            }
              
            return Integer.parseInt(str, 3)
        }
    }
}