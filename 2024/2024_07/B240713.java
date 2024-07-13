/*
15000번 CAPS
https://www.acmicpc.net/problem/15000


Earth is under attack! Messages need to be sent to the Earth Defense Force (EDF)
 that makes clear that the situation is dire. 
The EDF’s strongest forces consist of mechs (huge bipedal robots) that are piloted by Japanese teenagers. 
To make sure that the messages come across as urgent, 
 they must be displayed on the monitors of the pilots in uppercase letters. 
Unfortunately, the tachyon communication system that is used by the EDF is only able to send strings 
 in lower-case alphabetic characters.

The set of lower-case alphabetic characters is made up of the following characters: 
’a’, ’b’, ’c’, ’d’, ’e’, ’f’, ’g’, ’h’, ’i’, ’j’, ’k’, ’l’, ’m’, 
’n’, ’o’, ’p’, ’q’, ’r’, ’s’, ’t’, ’u’, ’v’, ’w’, ’x’, ’y’, ’z’.

Your job is to write a program that converts the given messages to upper-case.

입력
A single line containing a string of length n (100 ≤ n ≤ 106), consisting of lower-case alphabetic characters.
출력
A single line containing the input string where all letters are converted to upper-case letters.

예제 입력 1 
alert
예제 출력 1 
ALERT

예제 입력 2 
earthisunderattack
예제 출력 2 
EARTHISUNDERATTACK

예제 입력 3 
canyoupickupsomegroceries
예제 출력 3 
CANYOUPICKUPSOMEGROCERIES
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String result = str.toUpperCase();
        System.out.println(result);
    }
}
