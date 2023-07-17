/*
정수 배열 arr과 정수 n이 매개변수로 주어집니다. 
arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, 
arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 1,000
1 ≤ arr의 원소 ≤ 1,000
1 ≤ n ≤ 1,000

입출력 예
arr	                    n	    result
[49, 12, 100, 276, 33]	27	    [76, 12, 127, 276, 60]
[444, 555, 666, 777]	100	    [444, 655, 666, 877]
 */

class Solution {
    public int[] solution(int[] arr, int n) {
        int num = arr.length;
        int[] answer = arr;
        if(num % 2 == 0){
            for(int i = 1; i < num; i+=2){
                answer[i] += n;
            }
        } else if (num % 2 != 0){
            for(int i = 0; i < num; i+=2){
                answer[i] += n;
            }
        }
        return answer;
    }
}