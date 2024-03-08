/*
5524번 입실 관리
https://www.acmicpc.net/problem/5524


JOI회사에서는 방에 들어가기 위해 입실 기록을 입력할 때 알파벳으로 이름을 입력한다. 
그런데, 컴퓨터에 오류가 나서 대문자 소문자가 섞여버려 입실 기록이 읽기 힘들어졌다.
JOI회사의 입실 기록을 읽기 쉽게 하기 위해서 기록된 이름을 모두 소문자로 변환하는 프로그램을 작성하라. 
단, 입실 기록에는 같은 이름의 사람이 생기기도 한다.

입력
첫째 줄에는 정수 N(1 ≤ N ≤ 100)이 주어진다. 
둘째 줄부터는 1글자 이상 20문자 이하의 영어 대문자, 소문자로만 이루어지는 문자열 Si가 주어진다.

출력
i번째 줄에, i번째 입실자의 이름을 소문자로 출력한다.

서브태스크
번호	 배점	    제한
1	    60	    N ≤ 10.
2	    40	    추가적인 제약 조건이 없다.

예제 입력 1 
3
WatanabE
ITO
YamaMoto
예제 출력 1 
watanabe
ito
yamamoto

예제 입력 2 
4
SUZUKI
tanaka
tAkAhAshi
SuZuKi
예제 출력 2 
suzuki
tanaka
takahashi
suzuki
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240308 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String temp = br.readLine().toLowerCase();
            System.out.println(temp);
        }
    }
}
