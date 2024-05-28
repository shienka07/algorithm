/*
8545번 Zadanie próbne
https://www.acmicpc.net/problem/8545


Napisz program, który odwraca podane słowo trzyliterowe.

입력
W pierwszym i jedynym wierszu podane jest jedno słowo trzyliterowe.

출력
Pierwszy i jedyny wiersz wyjścia powinien zawierać odwrócone słowo wejściowe.

예제 입력 1 
abc
예제 출력 1 
cba
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B240528 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer str = new StringBuffer(br.readLine());

        System.out.println(str.reverse());
    }
}