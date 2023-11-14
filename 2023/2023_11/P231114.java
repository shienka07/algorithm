/*
최빈값 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120812


최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
최빈값이 여러 개면 -1을 return 합니다.

제한사항
0 < array의 길이 < 100
0 ≤ array의 원소 < 1000

입출력 예
array	            result
[1, 2, 3, 3, 3, 4]	3
[1, 1, 2, 2]	    -1
[1]	                1
 */

import java.util.Arrays;

public class P231114 {
    class Solution {
        public int solution(int[] array) {
            Arrays.sort(array);
            int len = array.length;
            int max = array[len - 1];
            int[] num = new int[max + 1];
            
            for(int i = 0; i < len; i++){
                num[array[i]]++;
            }
                
            int top = num[0];
            int answer = 0;
                
            for(int j = 1; j < num.length; j++){
                if(top < num[j]){
                    top = num[j];
                    answer = j;
                } else if(top == num[j]){
                    answer = -1;
                }
            }

            return answer;
        }
    }
}
