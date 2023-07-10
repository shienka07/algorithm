/*
문자열 my_str과 n이 매개변수로 주어질 때, 
my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_str의 길이 ≤ 100
1 ≤ n ≤ my_str의 길이
my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.

입출력 예
my_str	            n	    result
"abc1Addfggg4556b"	6	    ["abc1Ad", "dfggg4", "556b"]
"abcdef123"	        3	    ["abc", "def", "123"]
*/

import java.util.Arrays;

class Solution {
    public String[] solution(String my_str, int n) {
        int num = my_str.length();
        String[] answer = new String[num];
        int div = (int) Math.ceil((double)num / n);
        int k = 0;
        int j = 0;
        
        for(int i = 0; i < div; i++){
            j = i*n;
            k = j+n;
            if(k > num){
                k = num;
            }
            answer[i] = my_str.substring(j, k);   
        }
        
        answer = Arrays.copyOf(answer, div);
        
        return answer;
    }
}