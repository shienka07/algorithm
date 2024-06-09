/*
6778번 Which Alien?
https://www.acmicpc.net/problem/6778


Canada Cosmos Control has received a report of another incident. 
They believe that an alien has illegally entered our space. 
A person who witnessed the appearance of the alien has come forward to describe the alien’s appearance. 
It is your role within the CCC to determine which alien has arrived. 
There are only 3 alien species that we are aware of, described below:

TroyMartian, who has at least 3 antenna and at most 4 eyes;
VladSaturnian, who has at most 6 antenna and at least 2 eyes;
GraemeMercurian, who has at most 2 antenna and at most 3 eyes.
입력
The first line contain the number of antenna that the witness claimed to have seen on the alien.
The second line contain the number of eyes seen on the alien.

출력
The output will be the list of aliens who match the possible description given by the witness. 
If no aliens match the description, there is no output.

예제 입력 1 
4
5
예제 출력 1 
VladSaturnian

예제 입력 2 
2
3
예제 출력 2 
VladSaturnian
GraemeMercurian

예제 입력 3 
8
6
예제 출력 3 

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int atn = Integer.parseInt(br.readLine());
        int eye = Integer.parseInt(br.readLine());

        if (atn >= 3 && eye <= 4) {
            System.out.println("TroyMartian");
        }
        if (atn <= 6 && eye >= 2) {
            System.out.println("VladSaturnian");
        }
        if (atn <= 2 && eye <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}
