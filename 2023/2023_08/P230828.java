/*
소수 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/12977


주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

입출력 예
nums	        result
[1,2,3,4]	    1
[1,2,7,6,4]	    4
 */

public class P230828 {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            int size = nums.length;
            int n = 3001;
            boolean[] arr = new boolean[n];
            
            arr[0] = arr[1] = true;
            
            for(int i = 2; i * i < n; i++){
                if(!arr[i]){
                    for(int j = i * i; j < n; j += i){
                        arr[j] = true;
                    }
                }
            }  
    
            for(int i = 0; i < size - 2; i++){
                for(int j = i + 1; j < size - 1; j++){
                    for(int k = j + 1; k < size; k++){
                        int temp = nums[i] + nums[j] + nums[k];
                        if(!arr[temp]) answer++;
                    }
                }
            }
            
            return answer;
        }
    }
}
