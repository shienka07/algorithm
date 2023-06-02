/*
문자열 my_string이 매개변수로 주어질 때, 
대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 영어 대문자와 소문자로만 구성되어 있습니다.

입출력 예
my_string	    result
"cccCCC"	    "CCCccc"
"abCdEfghIJ"	"ABcDeFGHij"
 */

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // a~z = 97~122 | A~Z = 65~90
        char[] chaArr = my_string.toCharArray();
        for(int i = 0 ; i < chaArr.length; i++){
            if(chaArr[i] > 64 && chaArr[i] < 91){
                answer += (chaArr[i] + "").toLowerCase(); 
            } else if(chaArr[i] > 96 && chaArr[i] < 123) {
                answer += (chaArr[i] + "").toUpperCase(); 
            }
        }
        return answer;
    }
}