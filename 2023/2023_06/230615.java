/*
영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, 
my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < my_string 길이 < 100

입출력 예
my_string	result
"Bcad"	    "abcd"
"heLLo"	    "ehllo"
"Python"	"hnopty"
 */

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int strNum = my_string.length();
        char[] chaArr = my_string.toCharArray();
        String[] strArr = new String[strNum];
        
        for(int i = 0 ; i < strNum; i++){
            if(chaArr[i] > 64 && chaArr[i] < 91){
                strArr[i] = (chaArr[i] + "").toLowerCase();
            } else {
                strArr[i] = (chaArr[i] + "");
            }
        }
        
        Arrays.sort(strArr);
        
        for(int k = 0 ; k < strNum; k++){
            answer += strArr[k];
        }
        
        return answer;
    }
}

// 두번째 방법
class Solution2 {
    public String solution2(String my_string) {
        char[] chaArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(chaArr);
        String answer = new String(chaArr);
        return answer;
    }
}