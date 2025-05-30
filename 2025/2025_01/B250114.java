/*
30676번 이 별은 무슨 색일까
https://www.acmicpc.net/problem/30676


스타는 안에 별이 담긴 기계장치를 보았다. 
기계장치 내부를 볼 수 없어 별을 구경할 순 없었지만, 기계장치에는 별빛의 파장을 알려주는 계기판이 있었다. 
계기판에 표시된 파장의 값을 토대로 스타는 별의 색을 알아낼 수 있었다. 스타가 알아낸 별의 색은 무엇이었을까?

색상별 파장의 범위는 다음과 같다.

빨간색: 620nm 이상 780nm 이하
주황색: 590nm 이상 620nm 미만
노란색: 570nm 이상 590nm 미만
초록색: 495nm 이상 570nm 미만
파란색: 450nm 이상 495nm 미만
남색: 425nm 이상 450nm 미만
보라색: 380nm 이상 425nm 미만

입력
계기판에 표시된 별빛의 파장 lambda 가 주어진다. 파장은 항상 정수로 주어지며 단위는 nm이다. 
380 <= lambda <= 780 

출력
별의 색을 출력한다. 빨간색이면 "Red", 주황색이면 "Orange", 노란색이면 "Yellow", 
초록색이면 "Green", 파란색이면 "Blue", 남색이면 "Indigo", 보라색이면 "Violet"을 출력한다.

예제 입력 1 
627
예제 출력 1 
Red

예제 입력 2 
516
예제 출력 2 
Green
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250114 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());
        String color = "";

        if (380 <= star && star < 425) {
            color = "Violet";
        } else if (425 <= star && star < 450) {
            color = "Indigo";
        } else if (450 <= star && star < 495) {
            color = "Blue";
        } else if (495 <= star && star < 570) {
            color = "Green";
        } else if (570 <= star && star < 590) {
            color = "Yellow";
        } else if (590 <= star && star < 620) {
            color = "Orange";
        } else if (620 <= star && star <= 780) {
            color = "Red";
        }

        System.out.println(color);
    }
}
