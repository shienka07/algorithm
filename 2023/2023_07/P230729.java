/*
i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 
예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 
정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.

i! ≤ n
제한사항
0 < n ≤ 3,628,800

입출력 예
n	        result
3628800 	10
7	        3
 */


public class P230729 {
    class Solution {
        public int fct(int n) {
            if(n <= 1){
                return 1;
            } else {
                return n * fct(n-1);
            }
        }
        
        
        public int solution(int n) {
            int answer = 0;
            
            for(int i = 1; i <= 10; i++){
               if(fct(i) <= n){
                   answer = i;
               } 
            }
            
            
            return answer;
        }
    }
}
