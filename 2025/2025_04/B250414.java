/*
31822번 재수강
https://www.acmicpc.net/problem/31822


국민대학교에서는 수강 신청, 성적 조회 등 과목의 구분이 필요할 때 ’과목 코드’를 사용한다. 
과목 코드는 10자리로 이루어져 있으며, 7번째 자리는 영어 알파벳 대문자 또는 숫자, 8번째 자리는 하이픈(-), 나머지 자리는 숫자로 이루어져 있다.

당신은 망한 학점을 복구하기 위해 재수강을 해야 하는데, 재수강을 하기 위해서는 재수강할 과목과 과목코드의 앞 5자리가 일치하는 과목을 수강해야 한다. 
재수강할 과목의 과목 코드와 수강 신청 가능한 과목 목록이 주어지면, 재수강으로 인정되는 과목이 몇 개가 있는지 출력하라.

입력
첫 번째 줄에 재수강할 과목의 과목 코드가 주어진다.
두 번째 줄에 수강 신청 가능한 과목의 개수 N이 주어진다. (1 <= N <= 16)
그다음 N개의 줄에 걸쳐 수강 신청 가능한 과목의 과목 코드가 주어진다.
입력되는 과목 코드는 서로 다르다.

출력
재수강으로 인정되는 과목의 개수를 출력한다.

예제 입력 1 
000200D-18
5
000200D-18
000200C-01
000210D-18
660820A-01
0002000-00
예제 출력 1 
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String retry = br.readLine().substring(0,5);
        int N = Integer.parseInt(br.readLine());
        int subjects = 0;

        for (int i = 0; i < N; i++) {
            String temp = br.readLine().substring(0,5);
            if(temp.equals(retry)) {
                subjects++;
            }
        }

        System.out.println(subjects);
    }
}
