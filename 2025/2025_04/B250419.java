/*
21354번 Äpplen och päron
https://www.acmicpc.net/problem/21354


Axel vill tävla med Petra om vem som sålt flest äpplen respektive päron, 
men Petra tycker inte att man kan "jämföra äpplen och päron". 
De kommer överens om att de istället ska jämföra hur mycket de tjänat. 
De ber dig skapa ett program som skriver ut vem som tjänat mest. 
Äpplen kostar 7 kronor styck och päron 13 kronor styck.

입력
En rad med två heltal A,P (0 <= A,P <= 1000), antalet äpplen Axel har lyckats sälja,
och antalet päron Petra har lyckats sälja. 

출력
Programmet ska skriva ut en rad med en sträng: 
den person som har tjänat mest, "Axel" eller "Petra". 
Om de sålt för lika mycket ska du skriva "lika".

예제 입력 1 
1 1
예제 출력 1 
Petra

예제 입력 2 
13 7
예제 출력 2 
lika

예제 입력 3 
15 8
예제 출력 3 
Axel
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B250419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int axel = A * 7;
        int petar = P * 13;

        if (axel > petar) {
            System.out.println("Axel");
        } else if (axel < petar) {
            System.out.println("Petra");
        } else {
            System.out.println("lika");
        }
    }
}