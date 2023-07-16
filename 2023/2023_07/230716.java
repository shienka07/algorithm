/*
문자열 정렬하기(1)
https://school.programmers.co.kr/learn/courses/30/lessons/120850


문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
my_string에는 숫자가 한 개 이상 포함되어 있습니다.
my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다. - - -

입출력 예
my_string	result
"hi12392"	[1, 2, 2, 3, 9]
"p2o4i8gj2"	[2, 2, 4, 8]
"abcde0"	[0]

*/

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[my_string.length()];
        int k = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            if(48 <= my_string.charAt(i) && my_string.charAt(i) <= 57){
                answer[k] = my_string.charAt(i)-'0';
                k++;
            }
        }
    
        answer = Arrays.copyOf(answer, k);
        Arrays.sort(answer);
        return answer;
    }
}


class Solution2 {
    public int[] solution2(String my_string) {
        String[] str = my_string.replaceAll("[^0-9]", "").split("");
        int[] answer = new int[str.length];
        
        Arrays.sort(str);
         
        for(int i = 0; i < str.length; i++){
            answer[i] = Integer.parseInt(str[i]);
        }

        return answer;
    }
}
