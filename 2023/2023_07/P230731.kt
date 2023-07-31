/*
짝수의 합
https://school.programmers.co.kr/learn/courses/30/lessons/120831


정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

제한사항
0 < n ≤ 1000

입출력 예
n	result
10	30
4	6
*/

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        for(i in 0..n step 2){
            answer += i
        
        return answer
    }
}