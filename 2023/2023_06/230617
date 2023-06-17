/*
문자열 before와 after가 매개변수로 주어질 때, 
before의 순서를 바꾸어 after를 만들 수 있으면 1을, 
만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < before의 길이 == after의 길이 < 1,000
before와 after는 모두 소문자로 이루어져 있습니다.

입출력 예
before	    after	    result
"olleh"	    "hello"	    1
"allpe"	    "apple"	    0
 */

import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beArr = before.toCharArray();
        char[] aftArr = after.toCharArray();
        Arrays.sort(beArr);
        Arrays.sort(aftArr);
        String be = new String(beArr);
        String aft = new String(aftArr);
        answer = be.equals(aft) ? 1 : 0;
        answer = new String(beArr).equals(new String (aftArr)) ? 1 : 0;
        return answer;
    }
}


// 코드 더 간결히

class Solution2 {
    public int solution2(String before, String after) {
        int answer = 0;
        char[] beArr = before.toCharArray();
        char[] aftArr = after.toCharArray();
        Arrays.sort(beArr);
        Arrays.sort(aftArr);
        answer = new String(beArr).equals(new String (aftArr)) ? 1 : 0;
        return answer;
    }
}