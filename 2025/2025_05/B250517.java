/*
31495번 그게 무슨 코드니..
https://www.acmicpc.net/problem/31495


토카는 문자열을 출력하는 파이썬 코드를 작성하는 것에 자신감이 있었다. 
어느 날 Hello, World!를 출력해달라는 요청을 받은 토카는 자신있게 코드를 작성했지만,
큰따옴표를 찍지 않는 치명적인 실수로 인해 컴파일 에러를 받고 말았다!!

토카는 이로 인해 자신감을 잃어버려 문자열 출력을 멀리하고 있다. 
당신은 토카의 자신감을 회복시켜 주기 위해 문자열을 입력받았을 때 정확한 문자열인지 판독하는 프로그램을 작성하고자 한다. 
정확한 문자열은 문자열의 시작과 끝이 큰따옴표로 이루어져 있으며 큰따옴표를 제외한 문자가 포함되어 있는 문자열을 뜻하는 말로, 
대표적으로는 "Hello, World!"가 있다. 
즉, 큰따옴표로 시작하지 않거나 끝나지 않은 Dijkstra나 A"b등의 문자열은 정확한 문자열이 아니다. 
이제 토카의 문자열이 정확한 문자열인지 판독하는 코드를 작성하여 보자!

입력
첫 번째 줄에 토카의 문자열을 뜻하는 문자열 S가 주어진다. 
S는 50글자를 넘지 않으며, 영어 대소문자와 큰따옴표, 그리고 공백으로 이루어져 있다.
큰따옴표는 전체 문자열에서 2 개 이하로 들어옴이 보장된다. 큰따옴표란 "를 의미한다. 
또한, 큰따옴표 안에 있는 문자열 앞뒤에 공백이 주어지는 경우나 문자열의 시작과 끝에 공백이 주어지는 경우는 주어지지 않는다.

출력
토카의 문자열이 정확한 문자열이라면 큰따옴표 내부 문자열을, 
만약 토카의 문자열이 정확한 문자열이 아니거나, 큰따옴표 내부가 빈 문자열이라면 CE를 출력한다.

예제 입력 1 
"Hello World
예제 출력 1 
CE

예제 입력 2 
"Hello World"
예제 출력 2 
Hello World
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250517 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if (s.length() >= 2 && s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"') {
            String temp = s.substring(1, s.length() - 1);
            if (temp.length() > 0) {
                System.out.println(temp);
            } else {
                System.out.println("CE");
            }
        } else {
            System.out.println("CE");
        }
    }
}
