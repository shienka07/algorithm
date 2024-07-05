/*
15819번 너의 핸들은
https://www.acmicpc.net/problem/15819


문제 해결(Problem Solving) 능력을 기르는 데에 도움이 되는 여러 사이트가 있다. 
국내 최대 규모의 Baekjoon Online Judge와 아주대학교 알고리즘 소학회 A.N.S.I.에서 관리하는 Lavida Online Judge와 같은
국내 온라인 채점 사이트를 비롯해 전 세계인이 모여 (비)정기적으로 대회를 치르는 Codeforces나 TopCoder 등 다양한 특색의 사이트가 존재한다.

온라인 게임에서 서로를 구분하기 위해 ID를 사용하듯, 이러한 알고리즘 사이트들에서도 ID를 사용한다. 
여러 알고리즘 사이트에서 동일한 ID를 사용하는 사람들도 많은데, 이 ID는 핸들(Handle)이라고도 불린다. 
대화에서도 유저의 본명보다 핸들이 등장할 때가 종종 있으며, 유명한 유저의 핸들은 대명사로 사용되기도 한다.

상민이는 알고리즘 사이트와 대회장 등에서 'qilip'라는 귀엽고 대칭성마저 완벽한 핸들을 사용한다. 
하지만 상민이에게는 말 못할 고민이 있는데, 바로 남들이 자신의 핸들을 자꾸 헷갈린다는 것이다. 
그중에서도 현정이는 상민이의 핸들을 'q'로 시작하고 'p'로 끝나는 것만 기억하며 'qp'라고 부른다. 
'quilip'까지는 헷갈릴 수 있지만 'qp'라니, 자신의 정체성을 부정당한 상민이는 어떻게든 현정이에게 자신의 핸들을 각인시키고 싶다.

현정이는 사람의 이름과 사람을 매칭시키는 능력은 매우 떨어지지만, 어떤 핸들이 자신이 아는 핸들 중 사전 순으로 몇 번째인지 기억하는 쓸데없는 능력을 가지고 있다. 
이를 이용해 상민이는 현정이가 아는 핸들 목록 중 자신이 몇 번째인지를 알아내어 앞으로 번호를 붙여 다니려고 한다. 
정체성을 지키고 싶은 상민이를 위해 현정이의 어지러운 머리속에서 임의의 순서를 가지는 핸들을 찾아보자.

입력
첫 줄에 현정이가 기억하고 있는 핸들의 개수 N과 I(1 ≤ I, N ≤ 100)이 주어진다. 이후 N개의 줄에 걸쳐 현정이 기억하는 핸들이 무작위 순서로 주어진다. 
모든 핸들은 영어 소문자와 숫자로만 이루어져 있으며 길이는 20보다 짧거나 같다. 입력되는 핸들 중 완전히 같은 핸들은 없음이 보장된다.

출력
현정이가 기억하고 있는 핸들 중 사전 순으로 I번째인 핸들을 한 줄에 출력한다.

이 문제에서 정의하는 사전 순이란 숫자가 알파벳보다 먼저이며, 숫자는 작을 수일수록 먼저이고, 알파벳은 순서가 빠를수록 먼저이다. 
또한 'abcd'와 'abc' 같이 어떤 한 문자열이 다른 문자열의 접두사가 될 때에는 길이가 더 짧은 쪽이 먼저이다.

예제 입력 1 
4 1
acka1357
spectaclehong
mitslll
luke0201
예제 출력 1 
acka1357

예제 입력 2 
9 7
tourist
petr
qilip
won0114
hmy3743
jujh97
hjhj97
bio8641
kangjieun9843
예제 출력 2 
qilip
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B240705 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        System.out.println(arr[I - 1]);
    }
}
