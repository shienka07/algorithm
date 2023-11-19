/*
1427번 소트인사이드
https://www.acmicpc.net/problem/1427


배열을 정렬하는 것은 쉽다. 
수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

입력
첫째 줄에 정렬하려고 하는 수 N이 주어진다.
 N은 1,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

예제 입력 1 
2143
예제 출력 1 
4321

예제 입력 2 
999998999
예제 출력 2 
999999998

예제 입력 3 
61423
예제 출력 3 
64321

예제 입력 4 
500613009
예제 출력 4 
965310000
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B231119 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(Character.getNumericValue(str.charAt(i)));
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int a : list){
            System.out.print(a);
        }
    }
}
