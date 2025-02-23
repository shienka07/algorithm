/*
1371번 가장 많은 글자
https://www.acmicpc.net/problem/1371


영어에서는 어떤 글자가 다른 글자보다 많이 쓰인다. 예를 들어, 긴 글에서 약 12.31% 글자는 e이다.
어떤 글이 주어졌을 때, 가장 많이 나온 글자를 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 글이 주어진다. 글은 최대 50개의 줄로 이루어져 있고, 각 줄은 최대 50개의 글자로 이루어져 있다. 
각 줄에는 공백과 알파벳 소문자만 있다. 글에 알파벳은 적어도 하나 이상 있다.

출력
첫째 줄에 가장 많이 나온 문자를 출력한다. 여러 개일 경우에는 알파벳 순으로 앞서는 것부터 모두 공백없이 출력한다.

예제 입력 1 
english is a west germanic
language originating in england
and is the first language for
most people in the united
kingdom the united states
canada australia new zealand
ireland and the anglophone
caribbean it is used
extensively as a second
language and as an official
language throughout the world
especially in common wealth
countries and in many
international organizations
예제 출력 1 
a

예제 입력 2 
baekjoon online judge
예제 출력 2 
eno

예제 입력 3 
abc a
예제 출력 3 
a

예제 입력 4 
abc
ab
예제 출력 4 
ab

예제 입력 5 
amanda forsaken bloomer meditated gauging knolls
betas neurons integrative expender commonalities
latins antidotes crutched bandwidths begetting
prompting dog association athenians christian ires
pompousness percolating figured bagatelles bursted
ninth boyfriends longingly muddlers prudence puns
groove deliberators charter collectively yorks
daringly antithesis inaptness aerosol carolinas
payoffs chumps chirps gentler inexpressive morales
예제 출력 5 
e
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B250223 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int [26];
        String temp;

        while ((temp = br.readLine()) != null) {
            for (char ch : temp.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    alphabet[ch - 'a']++;
                }
            }
        }

        int max = 0;
        for (int i : alphabet) {
            max = Math.max(max, i);
        }

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == max) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}
