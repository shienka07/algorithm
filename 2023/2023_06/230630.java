/*
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000

입출력 예
n	result
24	[1, 2, 3, 4, 6, 8, 12, 24]
29	[1, 29]
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int k = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[k] = i;
                k++;
            }
        }
        answer = Arrays.copyOf(answer, k);
        return answer;
    }
}