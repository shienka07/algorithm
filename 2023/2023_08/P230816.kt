/*
이어 붙인 수
https://school.programmers.co.kr/learn/courses/30/lessons/181928?language=kotlin


정수가 담긴 리스트 num_list가 주어집니다. 
num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9
num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.

입출력 예
num_list	        result
[3, 4, 5, 2, 1]	    393
[5, 7, 8, 3]	    581
*/

class P230816 {
    class Solution {
        fun solution(num_list: IntArray): Int {
            var answer: Int
            var numLen = num_list.size
            var odd = ""
            var even = ""
            
            for(i in 0..numLen-1){
                if(num_list[i] % 2 == 0){
                    even += num_list[i].toString()
                } else {
                    odd += num_list[i].toString()
                }
            }
            
            answer = even.toInt() + odd.toInt()
            
            return answer
        }
    }
}