/*
2857번 FBI
https://www.acmicpc.net/problem/2857


5명의 요원 중 FBI 요원을 찾는 프로그램을 작성하시오.
FBI요원은 요원의 첩보원명에 FBI가 들어있다. 

입력
5개 줄에 요원의 첩보원명이 주어진다. 
첩보원명은 알파벳 대문자, 숫자 0~9, 대시 (-)로만 이루어져 있으며, 최대 10글자이다.

출력
첫째 줄에 FBI 요원을 출력한다. 
이때, 해당하는 요원이 몇 번째 입력인지를 공백으로 구분하여 출력해야 하며, 오름차순으로 출력해야 한다. 
만약 FBI 요원이 없다면 "HE GOT AWAY!"를 출력한다.

예제 입력 1 
N-FBI1
9A-USKOK
I-NTERPOL
G-MI6
RF-KGB1
예제 출력 1 
1

예제 입력 2 
N321-CIA
F3-B12I
F-BI-12
OVO-JE-CIA
KRIJUMCAR1
예제 출력 2 
HE GOT AWAY!

예제 입력 3 
47-FBI
BOND-007
RF-FBI18
MARICA-13
13A-FBILL
예제 출력 3 
1 3 5
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        
        for (int i = 1; i <= 5; i++) {
            String str = br.readLine();
            
            if (str.contains("FBI")) {
                result += i + " ";
            }
        }
        
        if(result.equals("")){
            result = "HE GOT AWAY!";
        }
        
        System.out.println(result);
    }
}
