/*
문자열 my_string이 매개변수로 주어집니다.
my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000

입출력 예
my_string	return
"jaron"	    "noraj"
"bread"	    "daerb"
 */


class Solution {
    public String solution(String my_string) {
        String answer = "";      
        String[] arr = my_string.split("");
        int num = my_string.length() -1;
        for(int i = num; i >= 0; i--){
            answer += arr[i];
        }
        return answer;
    }
}


// StringBuffer reverse() 사용

class Solution2 {
    public String solution2(String my_string) {
        String answer = "";      
        StringBuffer sb = new StringBuffer(my_string);
        answer = sb.reverse().toString();
        return answer;
    }
}