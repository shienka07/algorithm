/*
문자열 str이 주어집니다.
문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 10

입출력 예
입력 #1

abcde

출력 #1

a
b
c
d
e
 */


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}


// toCharArray()

public class Solution2 {
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(char ch : a.toCharArray()){
            System.out.println(ch);
        }
    }
}