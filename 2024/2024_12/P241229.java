/*
181888번 n개 간격의 원소들
https://school.programmers.co.kr/learn/courses/30/lessons/181888


정수 리스트 num_list와 정수 n이 주어질 때, 
num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
5 ≤ num_list의 길이 ≤ 20
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ 4

입출력 예
num_list	        n	result
[4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
[4, 2, 6, 1, 7, 6]	4	[4, 7]

입출력 예 설명
입출력 예 #1
[4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.

입출력 예 #2
[4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.
*/

import java.util.*;

public class P241229 {
    public List solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i+=n) {
            answer.add(num_list[i]);
        }
        
        return answer;
    }
}
