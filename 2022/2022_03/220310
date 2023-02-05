/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
*/


class Solution {
    public int[] solution(long n) {
        
        String a = "" + n;
        int[] answer = new int[a.length()];
        for(int i = 0; i < a.length(); i++){
            answer[i] = (int) (n%10);
            n /= 10;
        }
    
        return answer;
    }
}


class Solution {
    public int[] solution(long n) {
        
        String a = "" + n;
        int[] answer = new int[a.length()];
        int i = 0;
        
        while(n>0){
            answer[i] = (int) (n%10);
            n /= 10;
            i++;
        }
    
        return answer;
    }
}
