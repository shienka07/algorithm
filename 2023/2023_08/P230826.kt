/*
k의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120887


1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 
정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ i < j ≤ 100,000
0 ≤ k ≤ 9

입출력 예
i	j	k	result
1	13	1	6
10	50	5	5
3	10	2	0
*/

class P230826 {
    class Solution {
        fun solution(i: Int, j: Int, k: Int): Int {
            var answer: Int
            var str: String = ""
            
            for(num in i..j){
                str += num.toString()
            }
            
            answer = str.count {it == Integer.toString(k)[0]}
            return answer
        }
    }
}