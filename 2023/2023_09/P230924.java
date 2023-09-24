/*
수열과 구간 쿼리 2
https://school.programmers.co.kr/learn/courses/30/lessons/181923


정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. 
queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.

각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.

각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

제한사항
1 ≤ arr의 길이 ≤ 1,000
0 ≤ arr의 원소 ≤ 1,000,000
1 ≤ queries의 길이 ≤ 1,000
0 ≤ s ≤ e < arr의 길이
0 ≤ k ≤ 1,000,000

입출력 예
arr	            queries	                        result
[0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	[3, 4, -1]
 */

public class P230924 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int qLen = queries.length;
            int[] answer = new int[qLen];
            
            for(int i = 0; i < qLen; i++){
                int min = Integer.MAX_VALUE;
                
                for(int j = queries[i][0]; j <= queries[i][1]; j++){
                    if(arr[j] > queries[i][2] && arr[j] < min){
                        min = arr[j];
                    }
                }
                
                answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;
            }
            
            return answer;
        }
    }
}
