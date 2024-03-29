/*
가까운 수
https://school.programmers.co.kr/learn/courses/30/lessons/120890


정수 배열 array와 정수 n이 매개변수로 주어질 때, 
array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ array의 길이 ≤ 100
1 ≤ array의 원소 ≤ 100
1 ≤ n ≤ 100
가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.

입출력 예
array	        n	result
[3, 10, 28]	    20	28
[10, 11, 12]	13	12
 */

import java.util.Arrays;

public class P231031 {
    class Solution {
        public int solution(int[] array, int n) {
            Arrays.sort(array);
            
            int answer = 0;
            int num = 100 + n;
            
            for(int i = 0; i < array.length; i++){
                if(Math.abs(array[i] - n) < num){
                    num = Math.abs(array[i] - n);
                    answer = i;
                }
            }
            
            answer = array[answer];
            return answer;
        }
    }
}