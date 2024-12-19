/*
181861번 배열의 원소만큼 추가하기
https://school.programmers.co.kr/learn/courses/30/lessons/181861


아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 
배열 X를 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 100
1 ≤ arr의 원소 ≤ 100

입출력 예
arr	        result
[5, 1, 4]	[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
[6, 6]	    [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
[1]	        [1]

입출력 예 설명
입출력 예 #1
예제 1번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.
|a|X|
|---|---|
||[]|

|5|[5, 5, 5, 5, 5]|
|1|[5, 5, 5, 5, 5, 1]|
|4|[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]|

따라서 [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]를 return 합니다.

입출력 예 #2
예제 2번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.
|a|X|
|---|---|
||[]|

|6|[6, 6, 6, 6, 6, 6]|
|6|[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]|

따라서 [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]를 return 합니다.

입출력 예 #3
예제 2번에 대해서 a와 X를 나타내보면 다음 표와 같습니다.
|a|X|
|---|---|
||[]|

|1|[1]|

따라서 [1]을 return 합니다.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P241219 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = list.stream()
                        .mapToInt(i -> i)
                        .toArray();
        
        return answer;
    }
}
