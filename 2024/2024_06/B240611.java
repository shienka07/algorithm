/*
31668번 특별한 가지
https://www.acmicpc.net/problem/31668


이거나 가지세요...

작년 NLCS Jeju는 "파마산을 묻혀 튀긴 소고기", 이하 "파묻튀"에 반대하는 학생들의 가지 운동을 막아내고 
신메뉴 "파마산을 묻혀 튀긴 소고기를 넣은 김밥", 이하 "파묻튀밥"을 출시하였다.
그러나 학생들은 파묻튀보다는 신선한 가지를 먹고 싶어 한다! 
따라서 학생들은 가지를 구매하여 오늘 급식에 나올 파묻튀밥에 들어있는 파묻튀를 모두 가지로 바꿔치기로 하였다. 
이를 위해 학생들은 구매해야 하는 가지의 양을 알아내야 한다.

파묻튀밥 한 줄에는 파묻튀가 정확히 N그램 들어간다.
학교는 오늘 파묻튀밥을 만들기 위해 파묻튀를 M그램 사용하였다.
학교가 만드는 파묻튀밥의 줄 수는 정수이다. 예를 들어, 학교가 파묻튀밥을 2.5줄 만드는 일은 일어날 수 없다.
파묻튀밥 한 줄의 파묻튀는 정확히 K그램의 가지로 바꿔치기해야 한다.
학교에서 제작한 파묻튀밥의 파묻튀를 모두 가지로 바꿔치기하기 위해 학생들이 구매해야 하는 가지의 양의 최솟값을 구해주자.

입력
첫 번째 줄에 파묻튀밥 한 줄에 들어가는 파묻튀의 양을 나타내는 정수 N이 주어진다.
두 번째 줄에 학교가 파묻튀를 사용한 양을 나타내는 정수 M이 주어진다.
세 번째 줄에 파묻튀밥 한 줄에 필요한 가지의 양을 나타내는 정수 K가 주어진다.

출력
한 줄에 학생들이 구매해야 하는 가지의 양의 최솟값을 그램 단위로 출력한다.

제한
1 <= N,M,K <= 1,000
M은 N의 배수이다.

예제 입력 1 
10
200
5
예제 출력 1 
100 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240611 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int result = (m / n) * k;

        System.out.println(result);
    }
}
