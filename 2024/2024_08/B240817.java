/*
6840번 Who is in the middle? 
https://www.acmicpc.net/problem/6840


In the story Goldilocks and the Three Bears, 
each bear had a bowl of porridge to eat while sitting at his/her favourite chair. 
What the story didn’t tell us is that Goldilocks moved the bowls around on the table, 
so the bowls were not at the right seats anymore. 
The bowls can be sorted by weight with the lightest bowl being the Baby Bear’s bowl, 
the medium bowl being the Mama Bear’s bowl and the heaviest bowl being the Papa Bear’s bowl. 
Write a program that reads in three weights and prints out the weight of Mama Bear’s bowl. 
You may assume all weights are positive integers less than 100.

예제 입력 1 
10
5
8
예제 출력 1 
8
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B240817 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3]; 
        
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        System.out.println(arr[1]);
	}
}

