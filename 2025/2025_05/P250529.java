/*
12949번 행렬의 곱셈
https://school.programmers.co.kr/learn/courses/30/lessons/12949


2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
곱할 수 있는 배열만 주어집니다.

입출력 예
arr1	                    arr2	                    return
[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	        [[15, 15], [15, 15], [15, 15]]
[[2, 3, 2], [4, 2, 4]       [[5, 4, 3], [2, 4, 1]       [[22, 22, 11], [36, 28, 18]
, [3, 1, 4]]	            , [3, 1, 1]]	            , [29, 20, 14]]
*/

public class P250529 {
    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int n = arr1.length;
            int m = arr2[0].length;
            int k = arr1[0].length; 

            int[][] answer = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int l = 0; l < k; l++) {
                        answer[i][j] += arr1[i][l] * arr2[l][j];
                    }
                }
            }

            return answer;
        }
    }
}
