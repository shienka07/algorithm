/*
문자열 묶기
https://school.programmers.co.kr/learn/courses/30/lessons/181855

문제 설명
문자열 배열 strArr이 주어집니다. 
strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 
가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ strArr의 길이 ≤ 100,000
1 ≤ strArr의 원소의 길이 ≤ 30
strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.

입출력 예
strArr	                         result
["a","bc","d","efg","hi"]	       2
 */

import java.util.HashMap;

public class P240104 {
    class Solution {
        public int solution(String[] strArr) {
            int answer = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

            for (String str : strArr) {
                int length = str.length();
                map.put(length, map.getOrDefault(length, 0) + 1);
            }

            for (int count : map.values()) {
                answer = Math.max(answer, count);
            }

            return answer;
        }
    }
}
