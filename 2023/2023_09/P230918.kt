/*
합성수 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/120846


약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100

입출력 예
n	result
10	5
15	8
*/

class P230918 {
    class Solution {
        fun solution(n: Int): Int {
            var answer: Int = 0
            
            for(i in 4..n){
                var cnt: Int = 0
                for(j in 1..i){
                    if(i % j == 0){
                        cnt++
                    }
                }
                if(cnt >= 3){
                    answer++
                }
            }
            return answer
        }
    }
}