/*
28114번 팀명 정하기
https://www.acmicpc.net/problem/28114


현대 모비스는 모빌리티 SW 해커톤, 알고리즘 경진대회, 채용 연계형 SW 아카데미 등 다양한 SW 인재 발굴 프로그램을 진행하고 있다. 
지난 2월에 개최된 모빌리티 SW 해커톤은 국내 14개 대학의 소프트웨어 동아리 20개 팀, 
70여 명이 참여해 모빌리티 소프트웨어 개발 실력을 겨뤘다.

숭실대학교 컴퓨터학부 문제해결 소모임 SCCC 부원들은 매년 모빌리티 SW 해커톤, SCON, ICPC와 같은 팀 대회에서 사용할 
팀명을 정하기 위해 많은 고민을 한다. 졸업을 한 학기 남겨둔 성서는 더 이상 부원들이 팀명으로 고통을 받지 않도록 가이드라인을 만들었다.

성서의 가이드라인에 따르면 팀 이름을 짓는 방법은 두 가지가 있다.

세 참가자의 입학 연도를 100으로 나눈 나머지를 오름차순으로 정렬해서 이어 붙인 문자열
세 참가자 중 성씨를 영문으로 표기했을 때의 첫 글자를 백준 온라인 저지에서 해결한 문제가 많은 사람부터 차례대로 나열한 문자열

예를 들어 
600문제를 해결한 18학번 안(AHN)씨, 2000문제를 해결한 19학번 이(LEE)씨, 6000문제를 해결한 20학번 오(OH)씨로 구성된 팀을 생각해 보자. 
첫 번째 방법으로 팀명을 만들면 181920이 되고, 두 번째 방법으로 팀명을 만들면 OLA가 된다.

2000문제를 해결한 19학번 이(LEE)씨, 9000문제를 21학번 나(NAH)씨, 1000문제를 해결한 22학번 박(PARK)씨로 구성된 팀은 
첫 번째 방법으로 팀명을 만들면 192122가 되고, 두 번째 방법으로 팀명을 만들면 NLP가 된다.

세 팀원의 백준 온라인 저지에서 해결한 문제의 개수, 입학 연도, 그리고 성씨가 주어지면 첫 번째 방법과 
두 번째 방법으로 만들어지는 팀명을 차례대로 출력하는 프로그램을 작성하라.

입력
첫째 줄에 첫 번째 팀원이 백준 온라인 저지에서 해결한 문제의 개수 P_1, 입학 연도 Y_1, 성씨 S_1이 공백으로 구분되어 주어진다.
둘째 줄과 셋째 줄에는 두 번째 팀원의 정보 P_2,Y_2,S_2와 
세 번째 팀원의 정보 P_3,Y_3,S_3이 첫째 줄과 같은 형식으로 주어진다.

출력
첫째 줄에 첫 번째 방법으로 만든 팀명을 출력한다.
둘째 줄에 두 번째 방법으로 만든 팀명을 출력한다.

제한
- 1 <= P_i 20,000 (1 <= i <= 3)
- P_i는 모두 서로 다르다. (1 <= i <= 3)
- 2010 <= Y_i <= 2099 (1 <= i <= 3)
- Y_i는 모두 서로 다르다. (1 <= i <= 3)
- 성씨는 알파벳 대문자로만 구성되어 있으며, 최대 5글자이다.
- 모든 성씨는 서로 다르다.
- 입력으로 주어지는 수는 모두 정수이다.

예제 입력 1 
600 2018 AHN
2000 2019 LEE
6000 2020 OH
예제 출력 1 
181920
OLA

예제 입력 2 
1000 2022 PARK
9000 2021 NAH
2000 2019 LEE
예제 출력 2 
192122
NLP
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B250119 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] scNa = new int[3][2];
        int[] year = new int[3];

        for (int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    year[i] = Integer.parseInt(st.nextToken()) % 100;
                } else if (j == 2) {
                    scNa[i][1] = st.nextToken().charAt(0);
                } else {
                    scNa[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        Arrays.sort(year);
        Arrays.sort(scNa, (o1, o2) -> {
            return o2[0]-o1[0];
        });

        for (int i = 0; i < 3; i++){
            System.out.print(year[i]);
        }
            System.out.println();
        for (int i = 0; i < 3; i++){
            System.out.print((char)scNa[i][1]);
        }
    }
}
