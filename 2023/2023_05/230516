/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.

입출력 예
n	m	return
3	12	[3, 12]
2	5	[1, 10]

 */

// 유클리드 호제법
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int i = n; 
        int j = m;
        while(j != 0){
            int a = i % j;
            i = j;
            j = a;
        }
        
        answer[0] = i;
        answer[1] = n * m / i;
    
        return answer;
    }
}


class Solution2 {
    public int[] solution2(int n, int m) {
        int[] answer = new int[2];
        
        int min = (n < m) ? n : m; 
        int gcf = 0; 
        int lcm = 0;
        for (int i = 1; i <= min; i++) { 
            if (n % i == 0 && m % i == 0)
                gcf = i; 
        } 
        lcm = n * m / gcf;
        
        answer[0] = gcf;
        answer[1] = lcm;
    
        return answer;
    }
}