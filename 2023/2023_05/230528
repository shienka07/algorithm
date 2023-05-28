/*
문자열 myString과 pat이 주어집니다. 
myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ myString ≤ 1000
1 ≤ pat ≤ 10

입출력 예
myString	pat	    result
"banana"	"ana"	2
"aaaa"	    "aa"	3
 */

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int num = myString.length() - pat.length();
        for(int k = 0; k <= num; k++) {
            if(myString.substring(k, k + pat.length()).equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}

class Solution2 {
    public int solution2(String myString, String pat) {
        int answer = 0;
        String[] strArr = myString.split("");
        int num = myString.length() - pat.length();
        for(int k = 0; k <= num; k++) {
            String patStr = "";
            for(int i = 0 ; i < pat.length(); i++){
                patStr += strArr[k + i];
            }
            if(myString.substring(k, k + pat.length()).equals(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}