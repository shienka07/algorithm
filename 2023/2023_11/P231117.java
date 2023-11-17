/*
분수의 덧셈
https://school.programmers.co.kr/learn/courses/30/lessons/120808


첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
두 분수를 더한 값을 기약 분수로 나타냈을 때 
분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 <numer1, denom1, numer2, denom2 < 1,000

입출력 예
numer1	denom1	numer2	denom2	result
1	    2	    3	    4	    [5, 4]
9	    2	    1	    3	    [29, 6]
 */


public class P231117 {
    class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int[] answer = new int[2];
            int numer = 0;
            int denom = 0;
            int temp = 0;
            
            if(denom1 == denom2){
                numer = numer1 + numer2;
                denom = denom1;
            } else {
                int dn1 = 0;
                int dn2 = 0;
                
                denom = lcm(denom1, denom2);
                dn1 = denom / denom1;
                dn2 = denom / denom2;
                numer = (numer1 * dn1) + (numer2 * dn2);
            }
            
            temp = gcd(numer, denom);
            while(temp > 1){
                temp = gcd(numer, denom);
                numer /= temp;
                denom /= temp;
            }
            
            answer[0] = numer;
            answer[1] = denom;
            return answer;
        }
        
        public int lcm(int num1, int num2) {
            return num1 * num2 / gcd(num1, num2);
        }
        
        public int gcd(int num1, int num2) {
            if (num2 == 0) return num1;
            return gcd(num2, num1 % num2);
        }
    }
}
