/*
28691번 정보보호학부 동아리 소개
https://www.acmicpc.net/problem/28691


고려대학교에는 정보보호학부가 있고, 정보보호학부에는 사이버국방학과와 스마트보안학과의 두 학과가 있다.
공식 명칭은 학부와 학과 이름 모두 스마트보안학과이지만, 헷갈리는 관계로 모두가 편의상 정보보호학부, 스마트보안학과로 부른다.
학부와 각 학과에는 2023년 8월 기준 아래와 같이 각 학부 혹은 학과 소속 동아리가 존재하며, 각 동아리의 목록과 소개는 아래와 같다. 
소개는 각 동아리의 회장 혹은 임원에게 직접 받았으며, 보안상의 이유로 모자이크 처리했다.

정보보호학부 소속 동아리
MatKor
WiCys

사이버국방학과 소속 동아리
CyKor
AlKor

스마트보안학과 소속 동아리
$clear

올해 1학기, 23학번 새내기로 입학한 민재는 이렇게 많은 동아리를 보고 감탄하며 가입하고자 하는 동아리를 정했다. 
실제로는 모든 동아리에 중복으로 가입할 수 있지만, 아직 새내기였던 민재는 그 사실을 모른 채 하나의 동아리만 가입해야 하는지 알고, 
마음속으로 하나를 정했다. 
그러던 중 선배인 주영이와 밥약(선배가 후배에게 밥을 사주는 고대의 문화)을 하다가 동아리 얘기가 나왔고, 
주영이는 민재에게 어떤 동아리에 가입하고 싶은지 물어보았다.
민재는 답을 하려는 순간 동아리의 전체 이름이 기억나지 않고 첫 번째 글자 하나만 기억났다. 
다행히 주영이는 이미 20학번 4학년이기 때문에 한 글자만 들어도 어떤 동아리인지 알 수 있다. 
민재가 동아리의 첫번째 글자를 얘기할 때, 주영이가 되어 민재가 생각하고 있는 동아리의 전체 이름을 말해보자.

입력
첫 줄에 민재가 이야기한 동아리의 첫번째 글자가 주어진다. 이 글자는 M, W, C, A, $ 중 하나가 들어온다.

출력
첫 줄에 민재가 생각하는 동아리의 전체 이름을 대소문자를 구분하여 출력해 보자.

예제 입력 1 
M
예제 출력 1 
MatKor

예제 입력 2 
W
예제 출력 2 
WiCys

예제 입력 3 
C
예제 출력 3 
CyKor

예제 입력 4 
A
예제 출력 4 
AlKor

예제 입력 5 
$
예제 출력 5 
$clear
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240801 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        
        switch (str) {
            case "M":
                result = "MatKor";
                break;
        
            case "W":
                result = "WiCys";
                break;
        
            case "C":
                result = "CyKor";
                break;
        
            case "A":
                result = "AlKor";
                break;
                
            default:
                result = "$clear";
                break;
        }

        System.out.println(result);
    }
}


