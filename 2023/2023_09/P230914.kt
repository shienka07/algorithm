/*
날짜 비교하기
https://school.programmers.co.kr/learn/courses/30/lessons/181838


정수 배열 date1과 date2가 주어집니다. 
두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 
각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.

만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.

제한사항
date1의 길이 = date2의 길이 = 3
0 ≤ year ≤ 10,000
1 ≤ month ≤ 12
day는 month에 따라 가능한 날짜로 주어집니다.

입출력 예
date1	        date2	            result
[2021, 12, 28]	[2021, 12, 29]	    1
[1024, 10, 24]	[1024, 10, 24]	    0
*/

class P230914 {
    class Solution {
        fun solution(date1: IntArray, date2: IntArray): Int {
            var answer: Int = 0
            
            for(i in 0..2){
                if(date1[i] > date2[i]){
                    break
                } else if(date1[i] < date2[i]){
                    answer = 1
                    break
                }
            }
            return answer
        }
    }
}