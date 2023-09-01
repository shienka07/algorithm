/*
문자열 잘라서 정렬하기
https://school.programmers.co.kr/learn/courses/30/lessons/181866


문자열 myString이 주어집니다. 
"x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.

단, 빈 문자열은 반환할 배열에 넣지 않습니다.

제한사항
1 ≤ myString ≤ 100,000
myString은 알파벳 소문자로 이루어진 문자열입니다.

입출력 예
myString	        result
"axbxcxdx"	        ["a","b","c","d"]
"dxccxbbbxaaaa"	    ["aaaa","bbb","cc","d"]
 */

import java.util.Arrays;

public class P230901 {
    class Solution {
        public String[] solution(String myString) {
            int myLen = myString.length();
            String[] answer = new String[myLen];
            String[] str = myString.split("x");
            int strLen = str.length;
            int k = 0;
            
            Arrays.sort(str);
            
            for(int i = 0; i < strLen; i++){
                if(str[i].length() == 0){
                    continue;
                } else {
                    answer[k] = str[i];
                    k++;
                }    
            }
            
            answer = Arrays.copyOf(answer, k);
            return answer;
        }
    }
}