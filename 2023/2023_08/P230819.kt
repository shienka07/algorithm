/*
특별한 이차원 배열 1
https://school.programmers.co.kr/learn/courses/30/lessons/181833


정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.

arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.

제한사항
1 ≤ n ≤ 100

입출력 예
n	result
3	[[1, 0, 0], [0, 1, 0], [0, 0, 1]]
6	[[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]
1	[[1]]
*/

class P230819 {
    class Solution {
        fun solution(n: Int): Array<IntArray> {
            var answer: Array<IntArray> = Array(n, { i -> IntArray(n, {j -> if(i==j) 1 else 0})})
            
            return answer
        }
    }
}