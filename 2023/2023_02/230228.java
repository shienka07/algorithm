/*
 정수 num과 k가 매개변수로 주어질 때, 
 num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 
 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < num < 1,000,000
0 ≤ k < 10
num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.


입출력 예
num	    k	result
29183	1	3
232443	4	4
123456	7	-1


 */

 
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String num_st = Integer.toString(num);
        int leng = num_st.length();
        int[] arr = new int[leng];
        
        for(int i = 0; i < leng; i++){
            arr[i] = num_st.charAt(i) - '0';
        }
        
        for(int j = 0; j < leng; j++){
            if (arr[j] == k){
                answer = j+1;
                break;
            }
        }
        
        if(answer == 0){
            answer = -1;
        }
        
        
        return answer;
    }
}