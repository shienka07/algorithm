/*
문자열 my_string이 매개변수로 주어집니다. 
my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.

입출력 예
my_string	        result
"aAb1B2cC34oOp"	    10
"1a2b3c4d123"	    16
 */

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        String[] arr = str.split("");
        
        for(int i = 0; i < arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}


// Pattern.matches

import java.util.regex.Pattern;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("");
        
        for(int i = 0; i < arr.length; i++){
            if(Pattern.matches("^[0-9]*$", arr[i])){
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}