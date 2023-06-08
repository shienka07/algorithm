/*
정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
3 ≤ numbers의 길이 ≤ 20
direction은 "left" 와 "right" 둘 중 하나입니다.

입출력 예
numbers	                    direction	result
[1, 2, 3]	                "right"	    [3, 1, 2]
[4, 455, 6, 4, -1, 45, 6]	"left"	    [455, 6, 4, -1, 45, 6, 4]
 */

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int num = numbers.length;
        int[] answer = new int[num];
        
        if (direction.equals("right")){
            int a = numbers[num-1];
            for(int i = 1; i < num; i++) {
                answer[i] = numbers[i-1]; 
            }
            answer[0] = a;
        } else {
            int a = numbers[0];
            for(int i = 0; i < num-1; i++) {
                answer[i] = numbers[i+1]; 
            }
            answer[num-1] = a;
        }
        
        return answer;
    }
}