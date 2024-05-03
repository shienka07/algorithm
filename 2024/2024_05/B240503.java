/*
11536번 줄 세우기
https://www.acmicpc.net/problem/11536


악독한 코치 주혁은 선수들을 이름 순으로 세우는 것을 좋아한다. 
더 악독한 것은 어떤 순서로 서야할지도 알려주지 않았다! 
선수들의 이름이 주어질 때 어떤 순서로 이루어져있는지 확인해보자.

입력
첫째 줄에 N개의 이름이 주어진다. (2 ≤ N ≤ 20)

다음 N개의 줄에는 각 선수들의 이름이 주어진다. 
이름은 2 이상 12 이하의 대문자로만 이루어져있다. 선수의 이름은 중복되지 않는다.

출력
이름이 증가하는 순으로 나타나면 INCREASING, 감소하는 순이면 DECREASING을 한 줄에 출력한다. 
만약 위의 두 경우가 아니라면 NEITHER를 출력한다.

예제 입력 1 
5
JOE
BOB
ANDY
AL
ADAM
예제 출력 1 
DECREASING

예제 입력 2 
11
HOPE
ALI
BECKY
JULIE
MEGHAN
LAUREN
MORGAN
CARLI
MEGAN
ALEX
TOBIN
예제 출력 2 
NEITHER

예제 입력 3 
4
GEORGE
JOHN
PAUL
RINGO
예제 출력 3 
INCREASING
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B240503 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        String[] copyArr = Arrays.copyOf(arr, n);
        Arrays.sort(copyArr);

        if((arr[0].equals(copyArr[0])&&arr[1].equals(copyArr[1])) 
                || (arr[0].equals(copyArr[n-1]))&&(arr[1].equals(copyArr[n-2]))) {
            if(Arrays.equals(arr, copyArr)) {
                System.out.println("INCREASING");
            } else {
                System.out.println("DECREASING");
            }
        } else {
            System.out.println("NEITHER");
        }
    }
}
