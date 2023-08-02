/*
최댓값 만들기(1)
https://school.programmers.co.kr/learn/courses/30/lessons/120847


정수 배열 numbers가 매개변수로 주어집니다. 
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ numbers의 원소 ≤ 10,000
2 ≤ numbers의 길이 ≤ 100
입출력 예
numbers	result
[1, 2, 3, 4, 5]	20
[0, 31, 24, 10, 1, 9]	744
*/

class P230801 {
    class Solution {
        fun solution(numbers: IntArray): Int {
            var answer: Int
            
            var list = numbers.sorted()
            
            var size = list.size
            
            var num1 = list.get(size-1)
            var num2 = list.get(size-2)
            
            
            answer = num1 * num2
            
            return answer
        }
    }


    // 두번째 풀이

    class Solution2 {
        fun solution2(numbers: IntArray): Int {
            var st = numbers.sorted()

            return st[st.size-1] * st[st.size-2]
        }
    }
}